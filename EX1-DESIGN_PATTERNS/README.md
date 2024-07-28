# Design Patterns Implementation (Exercise 1)

This repository demonstrates implementations of various design patterns. There are 2 use cases for each of the 3 Design Patterns - Creational, Structural, and Behavioral. Each one is implemented in Java.

## Creational Design Patterns

### 1. Document Maker (Factory Method)

**Use Case**: Creating different types of documents (e.g., PDF, Text, Word) without specifying the exact class of object that will be created.

- **DocumentMaker**: Defines the factory method for creating documents.
- **PDFDocument** , **TextDocument** and **WordDocument**: Concrete implementations of documents.

**Example**: The `DocumentMaker` class provides a `createDocument` method that returns different types of documents based on user input.

### 2. Game Settings (Singleton)

**Use Case**: Managing global game settings (e.g., volume, resolution) in a consistent manner across the game.

- **GameSettings**: Ensures a single instance of the settings manager.
- **Main**: Demonstrates how to use the `GameSettings` class to set and get game settings.

**Example**: The `GameSettings` class uses the Singleton pattern to ensure that only one instance of the settings exists and provides global access to this instance.

## Structural Design Patterns

### 1. Home Theater (Facade)

**Use Case**: Simplifying the process of controlling a complex home theater system by providing a unified interface.

- **HomeTheaterFacade**: Provides methods to control various components of the home theater.
- **Amplifier**, **DVDPlayer**, **Projector**, and **Lights**: Components of the home theater system.

**Example**: The `HomeTheaterFacade` class provides a simplified interface for turning on and using the home theater system, abstracting away the complexity of individual components.

### 2. Media Player (Adapter)

**Use Case**: Adapting different media players with incompatible interfaces to work with a unified media player system.

- **MediaPlayer**: Interface for playing media.
- **AdvancedMediaPlayer**: Interface for advanced media players with additional functionalities.
- **MediaPlayerAdapter**: Adapts `AdvancedMediaPlayer` to the `MediaPlayer` interface.
- **VLCPlayer** and **MP4Player**: Concrete implementations of the `AdvancedMediaPlayer`.

**Example**: The `MediaPlayerAdapter` class allows the `MediaPlayer` interface to work with `AdvancedMediaPlayer` implementations, such as `VLCPlayer` and `MP4Player`, which have different methods for playing media. The adapter provides a consistent interface for the unified media player system.

## Behavioral Design Patterns

### 1. Gaming Chat (Observer)

**Use Case**: Implementing a chat system where players (observers) receive messages from a chat room (subject).

- **ChatRoom**: Maintains a list of observers and notifies them of new messages.
- **Player**: Represents an observer that receives messages from the chat room.
- **Main**: Demonstrates the chat system and allows players to send and receive messages.

**Example**: The `ChatRoom` class manages a list of players and sends messages to all registered players, while the `Player` class receives and processes these messages.

### 2. Game Character State (State)

**Use Case**: Managing a game character's behavior based on its current state (e.g., standing, running, jumping).

- **Character**: Maintains the current state and delegates behavior to the state.
- **State**: Interface for different character states.
- **StandingState**, **RunningState**, and **JumpingState**: Concrete states that define specific behaviors.

**Example**: The `Character` class changes its behavior based on its current state and transitions between states based on user input.

## Running the Examples

To run any of the examples, compile and execute the `Main` class in the respective directory. Follow the prompts to interact with the system and see the design pattern in action.

## Notes

- Ensure you have Java installed on your system to compile and run the Java code.
- Each design pattern example is contained within its own directory for clarity.

---

