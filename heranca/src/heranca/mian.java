package heranca;

import entities.Accounts;
import entities.BusinesAccount;
import entities.SavingsAccount;

public class mian {

	public static void main(String[] args) {
		
		Accounts acc = new Accounts(1001,"Carlos",1000.0);
		acc.saque(200.0);
		System.out.println(acc.getBalance());
		
		Accounts acc2 = new SavingsAccount(1002,"Thiago", 1000.0,0.01);
		acc2.saque(200.0);
		System.out.println(acc2.getBalance());
		
		Accounts acc3 = new BusinesAccount(1003,"Lukas", 1000.0, 500.0);
		acc3.saque(200.0);
		System.out.println(acc3.getBalance());
		
		
	/*	BusinesAccount bacc = new BusinesAccount(1002,"Thiago", 0.0, 500.0); 
	
		//upcasting
		
		Accounts acc1 = bacc;
		Accounts acc2 = new BusinesAccount(1003, "Luka", 0.0, 200.0);
		Accounts acc3 = new SavingsAccount(1004,"Gabriel", 0.0,0.01);
		
		//downcasting 
		
		BusinesAccount acc4 = (BusinesAccount)acc2;
		acc4.emprestimo(100.0);
		
		//BusinesAccount acc5 =  (BusinesAccount)acc3;
		if(acc3 instanceof BusinesAccount) {
			BusinesAccount acc5 =  (BusinesAccount)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo !");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update !");
		}
	*/
	}
}
