package com.progra.inventory_classes.user;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	
	private User user;
	
	public void init() {
		user = new User("Usuario1", 0, "Contraseña1");
	}
	
	public void testGetters() {
		init();
		assertTrue("Usuario1"== user.getUsername());
		assertTrue("Contraseña1" == user.getPassword());
		assertTrue(0 == user.getUser_type());
	}
	
	public void testSetters() {
		init();
		user.setUsername("Usuario2");
		user.setPassword("Contraseña2");
		user.setUser_type(1);
		assertNotSame(0, user.getUser_type());
		assertNotSame("Usuario1", user.getUsername());
		assertNotSame("Contraseña1", user.getPassword());
	}
}
