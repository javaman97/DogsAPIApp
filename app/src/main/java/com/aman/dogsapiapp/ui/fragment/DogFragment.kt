package com.aman.dogsapiapp.ui.fragment

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.aman.dogsapiapp.databinding.FragmentDogBinding
import com.aman.dogsapiapp.repository.DogRepository
import com.aman.dogsapiapp.utils.extensions.load
import com.aman.dogsapiapp.utils.extensions.setVisible
import com.aman.dogsapiapp.viewmodel.DogViewModel
import com.aman.dogsapiapp.viewmodel.DogViewModelFactory

class DogFragment : Fragment() {
    private var _binding: FragmentDogBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: DogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentDogBinding.inflate(inflater, container, false)
       val repository = DogRepository()
        val viewModelFactory = DogViewModelFactory(repository)
          viewModel = ViewModelProvider(this, viewModelFactory)[DogViewModel::class.java]

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        backgroundAnimation()

        setImage()
    }

    private fun setImage() {
        viewModel.getRandomDogImage()
        viewModel.myResponse.observe(viewLifecycleOwner) { response ->
            if (response.isSuccessful) {
                with(binding.ivRandomDog) {
                    load(response.body()?.message.toString(), requireContext())
                    setVisible()
                }
                Log.e("Response", response.body()?.message.toString())
            } else {
                Log.e("Response", response.errorBody().toString())
            }
        }
    }

    private fun backgroundAnimation() {
        val animationDrawable : AnimationDrawable = binding.fragmentDog.background as AnimationDrawable

        animationDrawable.apply {
            setEnterFadeDuration(1000)
            setExitFadeDuration(3000)
            start()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}