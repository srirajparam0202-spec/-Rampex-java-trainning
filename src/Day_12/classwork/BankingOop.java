package Day_12.classwork;

public class BankingOop {

    public static void main(String[] args) {
        Sbiaccount s1 = new Sbiaccount();

        s1.accName = "sriraj";
        s1.deposit(1000);
        s1.withdraw(500);
        System.out.println(s1.checkBalance());
    }



}
interface rbi{

    public void deposit(float amount);

    public void withdraw(float withdraw);

    public float checkBalance();


}
class Sbiaccount implements rbi{
    String accName;
    int accId;
    float balance;

    public void deposit(float amount){
        balance = balance + amount;
        System.out.println("Amount deposited in " + accName +  " Account :" + amount + " Remaining balance: " + balance);
    }
    public void withdraw(float withdraw){
        balance = balance - withdraw;
        System.out.println("Amount withdrawn in " + accName +  " Account :" + withdraw + " Remaining balance: " + balance);
    }
    public float checkBalance(){
        return balance;
    }
}
