package com.mohit88.userauth.domain;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.google.code.beanmatchers.BeanMatchers;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

	@Test
	  public void testUser() {
	    assertThat(User.class,
	        CoreMatchers.allOf(BeanMatchers.hasValidBeanConstructor(), BeanMatchers.hasValidGettersAndSetters()
	        		, BeanMatchers.hasValidBeanToString(), BeanMatchers.hasValidBeanEquals(), BeanMatchers.hasValidBeanHashCode()));
	  }
}
