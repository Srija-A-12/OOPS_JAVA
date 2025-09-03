
---

```markdown
# ☎️ Desk Phone Simulation (Java)  
*(Project to understand how **interfaces** work in Java)*  

---

## 📌 About the Project
This is a simple **Java console project** that demonstrates how **interfaces** and **classes** interact in object-oriented programming.  
The project simulates a **desk phone** with basic operations like powering on, dialing, receiving calls, and answering.  

---

## 🎯 Learning Objective
- Understand how to define an **interface** in Java.  
- Learn how a **class implements an interface**.  
- Practice **method overriding** and **encapsulation**.  

---

## 🛠️ Features
- `Telephone` interface defines the contract for a phone:  
  - `powerOn()`  
  - `dial(String number)`  
  - `answer()`  
  - `calling(String number)`  
  - `isRinging()`  

- `DeskPhone` class implements the `Telephone` interface.  
- `MAin` class runs a basic simulation of phone behavior.  

---

## 📂 Project Structure
```

Telecommunication/
┣ DeskPhone.java      # Implements Telephone interface
┣ Telephone.java      # Defines the interface
┗ MAin.java           # Main runner class

````

---

## ▶️ Example Run
```text
welcome back
Phone is ringing
picking the phone
````

---

## 🚀 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/<your-username>/DeskPhone-Simulation.git
   ```
2. Open the project in any IDE (IntelliJ / Eclipse / VS Code).
3. Compile and run `MAin.java`.

---

## 📚 Concepts Practiced

* **Interfaces in Java**
* **Class implementation**
* **Method overriding**
* **Encapsulation of fields**

---

## 🔮 Possible Extensions

* Fix `isRinging` logic to return the actual ringing state.
* Use `.equals()` for comparing phone numbers instead of `==`.
* Extend to **JavaFX frontend** or **Spring Boot REST API**.

---
## 🎯 Why Use an Interface Here?
We chose an **interface** (`Telephone`) because:  
- It defines a **contract** for all types of phones (DeskPhone, MobilePhone, SmartPhone, etc.).  
- It allows **loose coupling** – different classes can implement the same interface in their own way.  
- It promotes **code reusability** and **flexibility**.  
- If tomorrow we want to add `MobilePhone` or `VoIPPhone`, they just need to **implement `Telephone`** without changing existing code.  

---

## 👉 What problem will we face if we don’t use an interface?
---
If we don’t use an interface, we lose **flexibility and scalability**.

* We would have to write everything inside a **single class (e.g., DeskPhone)**.
* Later, if we want to add a new type of phone (like `MobilePhone` or `SmartPhone`), we’d either need to **duplicate a lot of code** or **modify the existing class**, which breaks the **Open/Closed Principle** (OOP rule: *open for extension, closed for modification*).
* Our code becomes **tightly coupled** – other parts of the program will depend on one concrete class instead of a general contract.
* We cannot guarantee that all types of phones will follow the same required methods (`powerOn`, `dial`, `answer`, etc.).

In short:
❌ Without an interface → Code becomes rigid, harder to extend, tightly coupled.
✅ With an interface → We get a common contract, loose coupling, and easy extension for future phone types.


---


