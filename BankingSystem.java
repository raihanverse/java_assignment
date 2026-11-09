class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  BankAccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  String getAccountNumber() {
    return accountNumber;
  }

  String getAccountHolderName() {
    return accountHolderName;
  }

  double getBalance() {
    return balance;
  }

  void deposit(double amount) {
    if (amount > 0) {
      balance = balance + amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid amount");
    }
  }

  void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Invalid withdraw amount");
    } else if (amount>balance) {
      System.out.println("Not enough balance");
    } else {
      balance = balance-amount;
      System.out.println("Withdrawn: " + amount);
    }
  }

  void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Balance: " + balance);
  }
}

public class BankingSystem {
  public static void main(String[] args) {
    BankAccount a1 = new BankAccount("1001", "Rahim", 5000);
    BankAccount a2 = new BankAccount("1002", "Karim", 1000);

    a1.deposit(2000);
    a1.withdraw(3000);

    a2.deposit(500);
    a2.withdraw(2000);

    a1.displayAccountDetails();
    a2.displayAccountDetails();
  }
}