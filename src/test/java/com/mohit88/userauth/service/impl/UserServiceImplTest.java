package com.mohit88.userauth.service.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mohit88.userauth.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Test
	public void shouldFindAllUsers() {
		userServiceImpl.findAll();
		verify(userRepository).findAll();
	}
}
