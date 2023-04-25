package com.excelsoft.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.excelsoft.dao.AccountDao;
import com.excelsoft.dao.CustomerDao;
import com.excelsoft.enties.Account;
import com.excelsoft.enties.Customer;
@Component
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accDao;
@Override
@Transactional
public Account openNewAccountservice(Account a,int id) {
	a=accDao.openNewAccount(a, id);
	return a;
}
@Override
@Transactional
public Account serachAccountByNoService(long accNo) {
	
	return accDao.serachAccountByNo(accNo);
}
@Override
@Transactional
public List<Account> ListAllAccountService() {
	return accDao.ListAllAccount();


}
}

