package com.pinal.container;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinal.model.Account;
import com.pinal.repository.AccountRepository;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountResource {
	private static final Logger LOGGER=LoggerFactory.getLogger(AccountResource.class);
	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Account> get(@PathVariable("id") Integer id) {
		LOGGER.warn("Request for the account is inititate and request ID is '{}'",id);
		return ResponseEntity.ok(accountRepository.findById(id).get());
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Account>> getAll(){
		LOGGER.warn("Request for the All account is initiate.");
		return ResponseEntity.ok(accountRepository.findAll().get());
	}
}
