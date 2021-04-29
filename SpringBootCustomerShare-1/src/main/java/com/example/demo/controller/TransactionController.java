package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService ts;
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String message() {
		return "welcome to REST";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Transaction> find() {
		return ts.findAll();
	}
}
