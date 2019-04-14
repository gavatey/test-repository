package com.pradeep.banking.service;

import java.util.List;

import com.pradeep.banking.dao.AccountDao;
import com.pradeep.banking.model.Account;

public class AccountServiceImpl implements AccountService{

	
	private AccountDao accountDao;
	
	
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	System.out.println("AccountService setAccountDao method...");
	}
	
	
	public AccountServiceImpl() {
		System.out.println("AccountService default constructor created.....");
	}
	
	public AccountServiceImpl(AccountDao accountDao) {
		System.out.println("AccountService param constructor...");
		this.accountDao = accountDao;
	}



	@Override
	public boolean addAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.addAccount(account);
	}

	@Override
	public boolean deleteAccount(int accno) {
		// TODO Auto-generated method stub
		return accountDao.deleteAccount(accno);
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	}

	@Override
	public Account getAccount(int accno) {
		// TODO Auto-generated method stub
		return accountDao.getAccount(accno);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccounts();
	}

	
	
}
