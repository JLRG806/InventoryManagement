package com.progra.inventory_classes.login;

import java.util.ArrayList;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.user.User;

public interface Auth {
	
	public boolean newUser();
	
	public void createFirstUser ();
	
	public void loginMenu(ArrayList<User> users, ArrayList<Category> categories);
	
	
}
