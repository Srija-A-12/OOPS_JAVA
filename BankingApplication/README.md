

# 🏦 Banking Application (Java)

A simple **Banking Application** built in **Java** to demonstrate **Object-Oriented Programming (OOP) concepts**.
This project simulates an account system where users can **deposit money, withdraw money, and view account details**.

---

## 📌 OOP Concepts Used in this Project

* **Encapsulation**

  * All fields (`accountNumber`, `balance`, `name`, `email`, `phoneNumber`) are `private`.
  * Access controlled through **getters and setters** → prevents direct modification of sensitive data.

* **Abstraction**

  * Users only interact with methods like `depositMoney()` and `withdraw()`.
  * The internal logic (balance updates, validations) is hidden.

* **Constructor**

  * Used to initialize account details (`Account` object created with all required info).

* **Behavior via Methods**

  * `depositMoney(double amount)` → Add funds to account.
  * `withdraw(double amount)` → Withdraw funds if balance is sufficient.
  * `displayAccountDetails()` → Show account summary.

---

## ▶️ Example Run

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

--- Account Details ---
Account Number: 123456
Account Holder: Srija
Email: srijaa@gmail.com
Phone: 1234567890
Balance: 11.0
-----------------------
```

---

## 📂 Project Structure

```
BankingApplication/
│── Account.java   # Account class with encapsulation & methods
│── Main.java      # Runs the application
```

---

## 🎯 Learning Outcome

* How **Encapsulation** secures data.
* How **Abstraction** hides implementation details.
* How **constructors and methods** define object behavior.

---

Would you like me to also add a **section comparing this project to your Telecommunication project** (like “this project focuses more on encapsulation, while that one focuses on interfaces”)? That way, your GitHub will look like a **series of OOP concept projects**.
