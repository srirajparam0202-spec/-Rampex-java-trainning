package Day_11.classwork;

public class BankingTest {

    public static void main(String[] args) {

        Bankaccount b1=new Bankaccount();
        System.out.println(b1.accName);
        b1.deposite(10000);
        b1.withdraw(5000);
        System.out.println(b1.checkBalance());


    }
}
class Bankaccount{

    String accName="sriraj";
    int accNo;
    float balance;

    public void deposite(float amount){
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount  + " Rs," + "balance: " + balance);

    }
    public void withdraw(float amount){
        balance = balance - amount;
        System.out.println("Amount withdrawn: " + amount  + " Rs," + "balance: " + balance);
    }
    public float checkBalance(){
        return balance;
    }
}
