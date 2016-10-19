package bank.model;

import java.util.List;

public interface BankDaoInter {
	void addAccount(Account account);
	Account findAccount(String account_no);
	List<Account> findAccountByName(String name);
	List<Account> getAccount();
	List<Account> getAccounts();
	void deposit(Account account, int money); //입금
	void withdraw(Account account, int money) throws Exception; //출금
	void transfer(Account from, Account to, int money) throws Exception; //이체
}
