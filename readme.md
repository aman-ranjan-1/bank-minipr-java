# 🏦 Mini Banking System (Java)

## 📌 Project Overview

The **Mini Banking System** is a simple Java-based console application that simulates basic banking operations. It allows users to create a bank account and perform common transactions such as depositing money, withdrawing money, and checking the account balance.

This project is designed for beginners who want to practice **Object-Oriented Programming (OOP)** concepts in Java and understand how basic banking operations can be implemented programmatically.

---

## 🚀 Features

The system supports the following banking operations:

* 👤 **Create Bank Account** – Users can create a new account with basic details.
* 💰 **Deposit Money** – Add funds to the account.
* 💸 **Withdraw Money** – Withdraw money with balance validation.
* 📊 **Check Balance** – Display the current account balance.
* 🔐 **Basic Validation** – Prevents withdrawal if insufficient balance.

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Concepts Used:**

  * Object-Oriented Programming (OOP)
  * Classes and Objects
  * Encapsulation
  * Conditional Statements
  * User Input Handling (Scanner)

---

## 📂 Project Structure

```
MiniBankingSystem/
│
├── BankAccount.java      # Contains account details and banking operations
├── BankingSystem.java    # Main program with menu-driven interface
└── README.md             # Project documentation
```

---

## ⚙️ How It Works

1. The user runs the program.
2. A menu is displayed with available banking options.
3. The user selects an option.
4. The system performs the requested operation.

### Example Menu

```
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Exit
```

---

## ▶️ How to Run the Project

### Step 1: Clone or Download the Project

```bash
git clone https://github.com/your-username/mini-banking-system.git
```

### Step 2: Navigate to Project Folder

```bash
cd mini-banking-system
```

### Step 3: Compile the Java Files

```bash
javac *.java
```

### Step 4: Run the Program

```bash
java BankingSystem
```

---

## 🧠 Example Code Concept

Example of a simple deposit method:

```java
public void deposit(double amount) {
    balance += amount;
    System.out.println("Amount deposited successfully.");
}
```

Example withdrawal method:

```java
public void withdraw(double amount) {
    if(amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawal successful.");
    } else {
        System.out.println("Insufficient balance.");
    }
}
```

---

## 🎯 Learning Objectives

This project helps in understanding:

* Java class design
* Basic banking logic implementation
* Menu-driven console applications
* Input handling using `Scanner`
* Method creation and reuse

---

## 🔮 Possible Future Improvements

You can enhance the project by adding:

* Multiple account management
* Account number generation
* PIN authentication
* Transaction history
* File handling or database integration
* Graphical User Interface (GUI)

---

## 👨‍💻 Author

**Your Name**

Student / Java Developer

---

## 📜 License

This project is for **educational purposes** and is free to use and modify.

---
