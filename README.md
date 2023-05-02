# MVVM RecyclerView Android Project

This is a simple MVVM RecyclerView Android project built with Kotlin programming language. The project displays a list of data using RecyclerView and follows the Model-View-ViewModel (MVVM) architecture.

## Project Structure

The project structure follows a common MVVM architecture pattern. The main packages used in this project are:

- `com.rakibofc.mvvmrecyclerview.adapters` - Contains the RecyclerView adapter used to display the list of data.
- `com.rakibofc.mvvmrecyclerview.models` - Contains the data model used in the project.
- `com.rakibofc.mvvmrecyclerview.viewmodels` - Contains the ViewModel class which handles the logic for the View.
- `com.rakibofc.mvvmrecyclerview.views` - Contains the MainActivity class which is the View in the MVVM architecture.

## Requirements

- Android Studio 4.2 or newer
- Kotlin 1.4.32 or newer

## Getting Started

1. Clone the repository:

```
git clone https://github.com/your-username/mvvm-recyclerview-android.git
```

2. Open the project in Android Studio.

3. Build and run the project on your device or emulator.

## Dependencies

- RecyclerView: A flexible view for providing a limited window into a large data set.
- ViewModel: The ViewModel class is designed to store and manage UI-related data in a lifecycle-conscious way.
- LiveData: LiveData is an observable data holder class that is lifecycle-aware.
- Kotlin Coroutines: A concurrency design pattern that you can use on Android to simplify code that executes asynchronously.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
