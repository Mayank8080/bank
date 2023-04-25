package com.excelsoft.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.excelsoft.dao.TransactionDao;
import com.excelsoft.enties.Transaction;

@Component
public class TransactionServiceImpl implements TransactionService {
	 @Autowired
		private TransactionDao tranDao;

	@Override
	@Transactional
	public Transaction transferFundsService(long fromId, long toId, int amt) {
		
		Transaction t=tranDao.transferFunds(fromId,toId,amt);
		return t;
	}

	

	@Override
	@Transactional
	public List<Transaction> fetchTransactionByAccountNoService(int cid) {
		
		return tranDao.fetchTransactionByAccountNo(cid);
	}




}
