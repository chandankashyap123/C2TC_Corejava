package com.tns.entity.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class B25UserserviceModule1ApplicationTests {
	
	@Mock
	private UserRepository repo;
	@Autowired
	private UserService service;
	
	@Test
	void contextLoads() {
	}

  @Test
  void Checkall() {
	service.listAll();
	verify(repo).findAll();
  }
 @Test
 void byid() {
	 UserService nnn= new UserService();
	 
	 assertEquals(nnn.get(1),1);
 }
}
