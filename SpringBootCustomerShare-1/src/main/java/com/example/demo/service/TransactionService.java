package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionRepositoy;

@Service
public class TransactionService {

	@Autowired
	TransactionRepositoy transactionRepo;
	
	public List<Transaction> findAll() {
		
		return transactionRepo.findAll();
	}
	
}
