package com.pinal.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.pinal.model.Account;

@Repository
public class AccountRepository {

	private static final Logger LOGGER=LoggerFactory.getLogger(AccountRepository.class);
	private final static Map<Integer, Account> accounts=new HashMap<Integer, Account>();
	
	static {
		accounts.put(1,new Account(1, "Pinal", "Pinalp887@gmail.com"));
		accounts.put(2, new Account(2, "John Doe", "john.doe@mail.com"));
		accounts.put(3, new Account(3, "Michael Knight", "michael.knight@mail.com"));
		accounts.put(4, new Account(4, "Black Hawk", "black.hawk@mail.com"));
		LOGGER.info("::::::::::::::::::::::::::::::::::::>>>>>>>>>>>>>>>>>>   Account is added successfully!!!!!!!!!!!!!!!!");
	}
	
	public Optional<Account> findById(Integer id){
		return Optional.ofNullable(accounts.get(id));
	}
	
	public Optional<Collection<Account>> findAll(){
		return Optional.ofNullable(accounts.values());
	}
}
