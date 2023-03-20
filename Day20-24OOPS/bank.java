import java.util.Scanner;
class Customer
{
    String Name;
    String address;
    String Acc_no;
    int age;

    public Customer(String Name,String address,String Acc_no,int age){
        this.Name = Name;
        this.address = address;
        this.Acc_no=Acc_no;
        this.age=age;
    }
}
class Account
{
    String acc_type;
    String branch;

    public Account( String acc_type,String branch){
        this.acc_type=acc_type;
        this.branch=branch;
    }
}
class RBI
{
    double min_rate,min_balance,max_withdraw;
    public RBI(double min_rate,double min_balance,double max_withdraw){
        this.min_rate=4.0;
        this.min_balance=1000000.0;
        this.max_withdraw=1000;
    }
    public void setMin_rate(double min_rate){
        if(min_rate >= this.min_rate){
            this.min_rate = min_rate;
        }else{
            System.out.println("this is not in the range of rbi rate ");
        }
    }
    public void setMin_balance(double min_balance){
        if(min_balance >= this.min_balance){
            this.min_balance  =min_balance  ;
        }else{
            System.out.println("this is not in the range of rbi min_balance  ");
        }
    }
     public void setMaxWithdraw(double max_withdraw){
        if(max_withdraw >= this.max_withdraw){
            this.max_withdraw  =max_withdraw;
        }else{
            System.out.println("this is not in the range of rbi max_withdraw  ");
        }
    }
    public void printInfoAboutBank()
    {
        System.out.println("the rate:" + min_rate);
        System.out.println("the minimum balaance:" + min_balance);
        System.out.println("the maximum withdraw:" + max_withdraw);

    }
    

}
class UnionBank extends RBI
{
    public UnionBank(double min_rate,double min_balance,double max_withdraw)
    {
        setMin_rate(min_rate);
        setMin_balance(min_balance);
        setMaxWithdraw(max_withdraw);
    }
    public void printInfoAboutBank()
    {
        System.out.println("the rate:" + min_rate);
        System.out.println("the minimum balaance:" + min_balance);
        System.out.println("the maximum withdraw:" + max_withdraw);

    }

}
class SBI extends RBI
{
    public SBI(double min_rate,double min_balance,double max_withdraw)
    {
        setMin_rate(min_rate);
        setMin_balance(min_balance);
        setMaxWithdraw(max_withdraw);
    }
    public void printInfoAboutBank()
    {
        System.out.println("the rate:" + min_rate);
        System.out.println("the minimum balaance:" + min_balance);
        System.out.println("the maximum withdraw:" + max_withdraw);

    }

}
public class Bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter minimum rate:");
        double a = sc.nextDouble();

        System.out.println("enter minimum rate:");
        double b = sc.nextDouble();

        System.out.println("enter minimum rate:");
        double c = sc.nextDouble();

     RBI bank = new RBI();
     bank.setMin_rate();
     bank.setMin_balance();
     bank.setMaxWithdraw();

     UnionBank u = new UnionBank();
     u.UnionBank(a,b,c);
     u.setMin_rate();
     u.setMin_balance();
     u.setMaxWithdraw();
     u.printInfoAboutBank();


     SBI s = new SBI();
     s.SBI(a,b,c);
     s.setMin_rate();
     s.setMin_balance();
     s.setMaxWithdraw();
     s.printInfoAboutBank();

    }
}