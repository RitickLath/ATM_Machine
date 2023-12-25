# Java ATM Program

This is a simple Java program that simulates an ATM (Automated Teller Machine) system. It is an Object-Oriented Programming (OOP) project that demonstrates the use of encapsulation, as various methods are encapsulated within the `Atm` class.

## Features

1. **User Interface:**
   - Users are greeted with a welcome message when they start the program.
   - They can choose between entering a password or recovering a forgotten password.

2. **Password Entry:**
   - Users can enter their password to access the main menu.
   - If the password is incorrect, they are given multiple attempts (limited to 3 attempts). After three incorrect attempts, the user must wait for 24 hours before trying again.

3. **Forgotten Password:**
   - Users can recover their password by providing a two-digit number, their name, and birth date.
   - To ensure the user is in a good mental state, they must enter a two-digit number as a simple test.
   - They have three attempts to enter the correct details; otherwise, they must wait for 24 hours.

4. **Main Menu:**
   - Once the password is entered correctly, users are presented with a menu to perform various banking operations.

5. **Check Balance:**
   - Users can check their account balance.

6. **Withdraw Money:**
   - Users can withdraw money in multiples of 100, subject to sufficient balance and proper denomination.

7. **Deposit Money:**
   - Users can deposit money in multiples of 100.

8. **Exit:**
   - Users can exit the program.

## Usage

To run the program, execute the `test` class.

```bash
javac test.java
java test
```

Follow the on-screen prompts to interact with the ATM.

## Requirements

- Java Development Kit (JDK) installed on your machine.

## Important Notes

- This program is a simple simulation and does not involve real transactions or account data.
- The waiting period after three unsuccessful password attempts is hard-coded as 24 hours for simulation purposes.

## Object-Oriented Concepts

- **Encapsulation:** Methods like `getPIN`, `WithdrawMoney`, `checkBalance`, `DepositMoney`, and `menu` are encapsulated within the `Atm` class, showcasing encapsulation in an object-oriented design.

## Contribution

Feel free to contribute to the improvement of this program. Create a fork, make changes, and submit a pull request.

## License

This program is open-source and available under the [MIT License](LICENSE).

---
