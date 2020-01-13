package com.mohit88.userauth.controller;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mohit88.userauth.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {


	@InjectMocks
	private UserController userController;
	
	@Mock
	private UserService userService;

	@Test
	public void shouldFindAllUsers() {
		userController.getAllUsers();
		verify(userService).findAll();
	}
}
