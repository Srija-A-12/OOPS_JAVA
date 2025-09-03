
This repository contains small projects designed to **learn and practice Object-Oriented Programming (OOP) concepts** in Java.  
Instead of just theory, each project focuses on implementing real-world examples using OOP principles.  

---

## 🎯 Goals of This Repository
- Understand **OOP concepts** by building small, practical projects.  
- Learn how to use **abstraction, encapsulation, inheritance, and polymorphism**.  
- Get comfortable with writing **clean and extensible Java code**.  

---

````markdown
# 📘 Learn OOP with Projects  

This repository is created to **learn Object-Oriented Programming (OOP) concepts** in Java through small projects.  
Each project demonstrates how OOP principles are applied in real-world scenarios.  

---

## 1️⃣ Telecommunication (DeskPhone Simulation)  

### 📌 Concepts in this Project
- **Interface** → `Telephone` defines a contract of methods (`dial`, `answer`, `powerOn`, etc.)  
- **Implementation Class** → `DeskPhone` implements the interface and provides behavior.  
- **Encapsulation** → Fields like `myNumber` and `isRinging` are kept private and accessed only through methods.  
- **Polymorphism** → Any class (e.g., `MobilePhone`) can also implement the `Telephone` interface in the future.  
- **Method Overriding** → The implementing class overrides interface methods with its own logic.  

### ❓ Why Interface?  
If we don’t use an interface, our design becomes rigid. For example:  
- Every new type of phone would require changes in the existing class.  
- Code reusability and flexibility would be lost.  
- Interfaces solve this by enforcing a **common structure** that all phones must follow.  

### ▶️ Example Output
```text
welcome back
Phone is ringing
picking the phone
````

---

✅ This project helps understand how **interfaces, encapsulation, and polymorphism** work together in Java OOP.

