package JATtask6;

import java.util.Scanner;

public class Account {

	private int accno;
	private String name;
	private  String branch;
	private double balance;
	
	public Account() {
		System.out.println("XYXY bank");
	}
	public Account(int accno,String name,String branch,double balance) {
		this.accno=accno;
		this.balance=balance;
		this.name=name;
		this.branch=branch;
	}
	public void checkBalance() {
		System.out.println("Account number: "+accno);
        System.out.println("Account Holder: " + name);
        System.out.println("Banck branch: "+branch);
        System.out.println("Current Balance: ₹" + balance);
    }
	public void Withdraw(double amount) {
		if(amount>0&&amount<=balance) {
			balance-=amount;
		System.out.println("Amount withdrawn:"+amount);
		}else {
			System.out.println("Invalid amount or insufficient balance");
		}
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposited"+amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public void recheckBalance() {
		System.out.println("Account number: "+accno);
        System.out.println("Account Holder: " + name);
        System.out.println("Banck branch: "+branch);
        System.out.println("Current Balance: ₹" + balance);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acc no");
		int accno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the accounant");
		String name=sc.nextLine();
	    System.out.println("Enter the branch");
	   String branch=sc.nextLine();
	    System.out.println("Enter the balance");
	    double balance=sc.nextInt();
	    Account obj=new Account();
	    Account obj1=new Account(accno, name, branch, balance);
	    obj1.checkBalance();
	    System.out.println("Enter the amount to withdraw");
	    double withdrawamount =sc.nextDouble();
	    obj1.Withdraw(withdrawamount);
	    System.out.println("Enter the amount to deposit");
	    double depositamount =sc.nextDouble();
	    obj1.deposit(depositamount);
	    obj1.recheckBalance();
	
	}

}
