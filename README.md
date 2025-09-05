
This repository contains small projects designed to **learn and practice Object-Oriented Programming (OOP) concepts** in Java.  
Instead of just theory, each project focuses on implementing real-world examples using OOP principles.  

---

## 🎯 Goals of This Repository
- Understand **OOP concepts** by building small, practical projects.  
- Learn how to use **abstraction, encapsulation, inheritance, and polymorphism**.  
- Get comfortable with writing **clean and extensible Java code**.  

---

## 1️⃣  Telecommunication (DeskPhone Simulation) 
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

---

## 2️⃣ Banking Application
---
### 📌 Concepts in this Project

* **Encapsulation** → All fields (`accountNumber`, `balance`, `name`, `email`, `phoneNumber`) are private, accessed through getters and setters.
* **Abstraction** → User interacts with simple methods (`depositMoney`, `withdraw`, `displayAccountDetails`) without knowing the internal logic.
* **Constructor** → Initializes account details in a single step.
* **Behavior via Methods** →

  * `depositMoney(double amount)` → Add funds.
  * `withdraw(double amount)` → Withdraw if balance is sufficient.
  * `displayAccountDetails()` → Show account summary.

### ▶️ Example Output

```text
--- Account Details ---
Account Number: 123456
Account Holder: Srija
Email: srijaa@gmail.com
Phone: 1234567890
Balance: 0.0
-----------------------

✅ Deposit successful. New balance: 1234.0
✅ Deposit successful. New balance: 1246.0
✅ Withdrawal successful. New balance: 11.0
⚠️ Insufficient balance. Current balance: 11.0
```

✅ This project demonstrates **encapsulation and abstraction** in a real-world banking scenario.
* Banking → Focused on **encapsulation & abstraction**
---





