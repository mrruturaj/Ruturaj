package com.zensar.bankingsystem.dao;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Transaction;

public interface BankingRepositoryServices {
	int insertCustomer(Customer customer);

	boolean updateCustomer(Customer customer);

	boolean updateTransaction(int custId, int accNo, Transaction transaction);

	Account getAccount(int custId, int accNo);

	Account[] getAccountList(int custId);

	Customer getCustomer(int custId);

	Transaction[] getTransactions(int custId, int accNo);

	boolean deleteCustomer(int custId);

	boolean deleteAccount(int custId, int accNo);

	int insertAccount(Account account, int custId);

	boolean updateAccount(int custId, Account account);

}
