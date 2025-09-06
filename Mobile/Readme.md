

# 📱 Mobile Simulation (Java)

This project simulates a **Mobile Phone** using **Java OOP principles**.
It demonstrates how a mobile behaves in real life — **taking pictures, recording videos, playing games, and charging the battery** — while applying **encapsulation and abstraction** in code design.

---

## 🎯 Purpose of the Project

The goal of this project is to:

* Learn **how to model real-world objects** (like a Mobile phone) using OOP.
* Understand **encapsulation** (keeping attributes private and safe).
* Practice **abstraction** (hiding battery logic while exposing only operations).
* Build confidence in writing **clean, structured Java code**.

---

## 📌 OOP Concepts in this Project

### 1. **Encapsulation**

* Fields (`screenSize`, `companyName`, `operatingSystem`, `batteryPercent`) are `private`.
* They can only be accessed or updated using **getters and setters**.
* This ensures the internal state (like battery) is secure and controlled.

### 2. **Abstraction**

* Users of the class only call methods like `takePicture()`, `recordVideo()`, `playGame()`, and `charge()`.
* They don’t need to know how the battery consumption is calculated internally.
* This hides complexity and exposes only what’s needed.

### 3. **Constructor**

* The constructor initializes essential details of a mobile (screen size, company, OS).

### 4. **Behavior via Methods**

* `takePicture()` → Consumes 10% battery. Fails if below 10%.
* `recordVideo()` → Consumes 30% battery. Fails if below 30%.
* `playGame()` → Consumes 60% battery. Fails if below 60%.
* `charge()` → Restores battery to 100%.

---

## ▶️ Example Run

### Input (Main.java)

```java
Mobile mobile = new Mobile(15, "Apple", "iOS");

mobile.takePicture();
mobile.recordVideo();
mobile.playGame();
System.out.println("🔋 Battery left: " + mobile.getBatteryPercent() + "%");

mobile.takePicture();
mobile.charge();
mobile.takePicture();
```

### Output

```text
📸 Picture taken successfully.
🎥 Video recorded successfully.
❌ Battery too low to play games.
🔋 Battery left: 60%
📸 Picture taken successfully.
⚡ Mobile fully charged (100%).
📸 Picture taken successfully.
```

---

## 📂 Project Structure

```
Mobile/
│── Mobile.java   # Defines Mobile attributes and behaviors
│── Main.java     # Runs the simulation
```

---

## 🧠 What You Learn

* How to **model a real-world entity** using classes and objects.
* How **encapsulation** keeps attributes like battery safe from misuse.
* How **abstraction** hides unnecessary details from the user.
* How methods can simulate **real-world actions** in programming.

---

## 🚀 Future Enhancements (Optional)

If you want to extend this project later:

* Add **different battery modes** (e.g., power saving, performance).
* Track **storage usage** when taking pictures or recording videos.
* Add **inheritance** → Example: `SmartPhone` extends `Mobile` and adds internet, apps, etc.

---

✅ This project shows how even a simple **daily-life object (Mobile phone)** can be modeled with OOP, making learning fun and practical.

