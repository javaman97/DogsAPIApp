# Dogs API App 🐶

A simple and fun Android app that displays random dog images from an API with smooth animations and a clean MVVM architecture.

## Tech Stack 🚀

- **KOTLIN** Use Android Official Language
- **XML** layouts for UI design
- **Retrofit** for API communication
- **Glide** for image loading and caching
- **Lottie Animation** for a fun animated splash screen
- **MVVM Architecture** for clean separation of concerns
- **Serialization** to handle data models
- **ViewModel** and **MutableLiveData** for UI updates

## Features ✨

- Display random dog images from an API.
- Smooth image loading with **Glide**.
- Clean **MVVM architecture**.
- Eye-catching **Lottie animation** during startup [Splash Screen]

## Libraries 📚

- [Retrofit](https://square.github.io/retrofit/)
- [Glide](https://github.com/bumptech/glide)
- [Lottie](https://airbnb.io/lottie/)
- [Gson](https://github.com/google/gson) (for serialization)
- [Room](https://developer.android.com/training/data-storage/room) (optional for local data storage)

## PREVIEW 📸

https://github.com/user-attachments/assets/fc1911cf-e76d-4f9f-a6bb-ae3ae0543133

 
*Enjoy Preview with Volume ON.*

## Setup Instructions 🛠

1. Clone the repository:
   ```bash
   git clone https://github.com/yagmurerdogan/Doggy-App.git
   ```
   
2. Open the project in **Android Studio**.

3. Add your **API key** (if required by the service) in the `build.gradle` or **strings.xml**.

4. Build and run the app on your emulator or device.

## Architecture 🏗️

The app follows the **MVVM architecture** to ensure code maintainability and separation of concerns:

- **Model**: Represents the data structure (dog image model).
- **View**: The activity/fragment that interacts with the user.
- **ViewModel**: Holds and processes the UI data, communicates with the repository.
- **Repository**: Handles data fetching (from network or cache).

## Contributions 🤝

Feel free to fork the repository, raise new issues and add improvements, and create pull requests.
