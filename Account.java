package com.oops.day11_12;
import java.util.Scanner;
public class Account {
	private String name;
	private long accNo;
	private long balance;
	Scanner sc=new Scanner (System.in);
	public void accOpen() {
		System.out.println("Enter Account Name: ");
		name=sc.next();
		System.out.println("Enter a Acc Number:");
		accNo=sc.nextLong();
		System.out.println("Enter a Balance you want to Add: ");
		balance=sc.nextLong();
	}
	public void creditAcc(){
		System.out.println("Enter a Amount you want to Add:");
		long amount=sc.nextLong();
		balance=balance+amount;
		System.out.println("Account is Credited Current balance is "+balance);
	}
	public void debitAcc() {
		System.out.println("Enter a Ammount you want to Withdraw: ");
		long amount=sc.nextLong();
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("Account is debited "+amount+ "Current balance is "+balance);
		}
		else
			System.out.println("Debit Amount exceeded Account balance ");
	}
	public static void main(String[] args) {
		Account acc1=new Account();
		int choice=0;
		while(choice<4) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your Choice: 1:aaOpen \n 2:creditAcc \n 3:debitAcc");
			choice=sc.nextInt();

			switch(choice){
			case 1: 
				acc1.accOpen();
				break;
			case 2: 
				acc1.creditAcc();
				break;
			case 3: 
				acc1.debitAcc();
				break;
			default:	   
			}
		}
	}

}
