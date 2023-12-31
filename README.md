# Music Player App

The **Music Player App** is a simple Android application designed to allow users to explore and interact with a collection of songs and artists.

## Screenshots

<img src="https://github.com/ano-ny-mous/Music-Player-App/assets/91519560/3a8e7a68-2307-4fee-88a8-95553ce427f7" alt="Screenshot 1" width="300" >

<img src="https://github.com/ano-ny-mous/Music-Player-App/assets/91519560/40f54aa4-05df-4e96-a8b6-b9cb294645ef" alt="Screenshot 2" width="300" >

<img src="https://github.com/ano-ny-mous/Music-Player-App/assets/91519560/3d762db6-f6ce-4134-88aa-4175f87b8910" alt="Screenshot 3" width="300" >

## Features

The app includes the following **features**:

- **All Songs:** View a list of songs and play them.
- **Artists:** View a list of artists and their information.
- **Now Playing:** Display the currently playing song and its details.

## Prerequisites

To run this app, you will need:

- Android Studio
- An Android emulator or a physical Android device

## Getting Started

1. Clone this repository to your local machine.
2. Open Android Studio and select "Open an existing Android Studio project."
3. Navigate to the cloned project directory and select it.
4. Build and run the app on an emulator or a physical device.

## App Structure

The app is structured as follows:

- **`app/src/main`**: Contains the main source code, resources, and layout files.
  - **`java/com/example/android/music`**: Contains the Java code for the app's activities and custom adapter.
  - **`res/layout`**: Contains XML layout files for different screens.
  - **`res/drawable`**: Contains drawable resources, such as images.

## Activities

The app includes the following **activities**:

- **MainActivity:** The main entry point of the app. Provides buttons to navigate to the "All Songs" and "Artists" sections.
- **AllSongs:** Displays a list of songs that users can play.
- **Artists:** Displays a list of artists and their information.
- **NowPlaying:** Shows the currently playing song and details.

## Custom Adapter

The app uses a custom `SongListAdapter` to populate data from `Song` objects into corresponding views.

## Data Model

The `Song` class is used as a data model to represent songs and artists, including their names, genders, ages, etc.

## Contributing

Feel free to contribute to this project by creating issues, suggesting enhancements, or submitting pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

