//Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.Scanner;
class BankAccount
  {
    
    void deposit(long balance,long deposit_ammount)
    {
      
      long deposit = balance+deposit_ammount;
      System.out.println("before deposited your ammount is " + balance + "now adding deposit money so your final balance is :" + deposit);
      
    }
    void withdraw(long balance,long withdraw_ammount) throws Exception
    {
      
      long withdraw = balance-withdraw_ammount;

      
      if(withdraw <= 0){
        throw new Exception("InsufficientFundsException");
      }else if(balance <= 0){
        throw new Exception("InsufficientFundsException");
      }else{
        System.out.println(withdraw);
      }
    }
    void check_balance(long balance)
    {
      
      System.out.println("check bank balance is :" + balance);
      
    }
  }
class BankApplication
  {
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter main balance:");
      long balance = sc.nextLong();
      System.out.println("enter deposited ammount:");
      long deposit_ammount = sc.nextLong();

       System.out.println("enter withdraw ammount:");
      long withdraw_ammount = sc.nextLong();
      
      BankAccount b = new BankAccount();
      b.deposit(balance,deposit_ammount);
      b.withdraw(balance,withdraw_ammount);
      b.check_balance(balance);
    }
  }


