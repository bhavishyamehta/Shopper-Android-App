# Shopper – Android Shopping App

A modern Android shopping app built using Kotlin, following MVVM and Clean Architecture principles. This project demonstrates clean, scalable code with proper separation of concerns and real-world Android development practices.

---

## 🛠️ Tech Stack
- Language: Kotlin
- Architecture: MVVM + Clean Architecture
- UI: Jetpack Compose
- State Management: ViewModel + LiveData / StateFlow
- Networking: Retrofit
- Local Storage: Room Database
- Dependency Injection: Hilt
- Asynchronous Programming: Kotlin Coroutines

---

## 🧩 Architecture Overview
This project follows Clean Architecture with three main layers:

1. Presentation Layer: Handles UI and user interactions.
2. Domain Layer: Business logic, use-cases, and data flow control.
3. Data Layer: Repository pattern, local database (Room), and network API handling (Retrofit).

> This separation ensures scalability, testability, and maintainable code.

---

## ✨ Features
- Browse products in a clean list view
- Product details screen with full information
- Add products to the shopping cart
- MVVM-based state management
- Offline caching with Room
- Scalable and maintainable codebase

---

## 🏃 How to Run
1. Clone the repository:
   `bash
   git clone https://github.com/bhavishyamehta/Shopper-Android-App.git
2. Open the project in Android Studio
3. Sync Gradle and let it download dependencies
4. Run the app on an emulator or physical device
