package com.pradeep.banking.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pradeep.banking.dao.AccountMapDaoImpl;
import com.pradeep.banking.model.Account;
import com.pradeep.banking.service.AccountService;
import com.pradeep.banking.service.AccountServiceImpl;

public class BankingApp {
	

private AccountService accountService;


public void setAccountService(AccountService accountService) {
	this.accountService = accountService;
	System.out.println("BankingApp setAccountService.... ");
	
}

public BankingApp() {
	System.out.println("BankingApp default constructor....... ");}

public BankingApp(AccountService accountService) {
	this.accountService = accountService;
	System.out.println("BankingApp param constructor...... ");
}


public void addAccount(Account account){

	if(accountService.addAccount(account))
	System.out.println("Account added successfully");
	else
	System.out.println("Problem In Insertion ");
		
}

public void updateAccount(Account account){

	if(accountService.updateAccount(account))
	System.out.println("Account updated successfully");
	else
	System.out.println("Account doesn't exist");
		
}

public void deleteAccount(int accno){

	if(accountService.deleteAccount(accno))
	System.out.println("Account deleted successfully");
	else
	System.out.println("Account doesn't exist");
		
}



public void showAccount(int accno){

	Account account=accountService.getAccount(accno);
	if(account!=null)
	System.out.println("Account  Details\n==================="+account);
	else
	System.out.println("Account doesn't exist");
		
}

public void showAllAccounts(){
	System.out.println("All Account  Details\n===================");
	for(Account a:accountService.getAllAccounts())	
	System.out.println(a);
	
}


public static void main(String[] args) {
	
ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("beans-aop-xml.xml");


BankingApp ba= c.getBean(BankingApp.class);

ba.showAccount(101);


ba.showAllAccounts();



		
	
}

	
	

}
