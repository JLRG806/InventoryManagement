package com.progra.inventory_classes.login;

import java.util.ArrayList;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.user.User;

import junit.framework.TestCase;

public class LoginTest extends TestCase{
	
	private Login login;
	private User user;
	
	public void init (User user) {
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		ArrayList<Category> categories = new ArrayList<Category>();
		login = new Login(users, categories, true);
	}
	
	public void init2 () {
		ArrayList<Category> categories = new ArrayList<Category>();
		ArrayList<User> users = new ArrayList<User>();
		this.login = new Login(users, categories, true);
	}
	
	public void testNewUser () {
		init (new User("Usuario1", 0, "Contraseña1"));
		assertTrue(!(login.newUser()));
	}
	
	public void testNewUser2 () {
		init2 ();
		assertTrue(login.newUser());		
	}
}
