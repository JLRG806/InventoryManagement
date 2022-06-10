package com.progra.inventory_classes.login;

import java.util.ArrayList;
import java.util.Scanner;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.inventory_manager.Inventory_Management;
import com.progra.inventory_classes.user.User;

public class Login {

	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Category> categories = new ArrayList<Category>();	
	public Scanner input = new Scanner(System.in);

	public Login(ArrayList<User> users, ArrayList<Category> categories) {
		this.users = users;
		this.categories = categories;
		if (newUser()) {
			createFirstUser();
		} else {
			loginMenu(this.users,this.categories);
		}
	}

	public boolean newUser() {
		boolean result = false;
		if (users.isEmpty()) {
			return true;
		} else {

		}
		return result;
	}

	public void loadUser() {

	}

	public void createFirstUser() {
		User user;
		System.out.println("╔═══════════════════════════════════╗");
		System.out.println("║  No hay usuarios registrados...   ║");
		System.out.println("╠═══════════════════════════════════╣");
		System.out.print("║  Usuario: ");
		String name = input.nextLine();
		System.out.println("╠═══════════════════════════════════╣");
		System.out.print("║  Contraseña: ");
		String password = input.nextLine();
		System.out.println("╚═══════════════════════════════════╝");

		try {
			users.add(user = new User(name, 0, password));
			System.out.println("Se registro el usuario Administrado...");
			input.nextLine();
			loginMenu(this.users,this.categories);

		} catch (Exception e) {
			System.out.println("Error al registrar usuario...");
		}

	}

	public void loginMenu(ArrayList<User> users, ArrayList<Category> categories) {
		boolean successLogin = false;
		do {
			System.out.println("╔═══════════════════════════════════╗");
			System.out.println("║  Login - Sistema de Inventario    ║");
			System.out.println("╠═══════════════════════════════════╣");
			System.out.print("║  Usuario: ");
			String username = input.nextLine();
			System.out.println("╠═══════════════════════════════════╣");
			System.out.print("║  Contraseña: ");
			String password = input.nextLine();
			System.out.println("╚═══════════════════════════════════╝");
			for (User user : users) {
				if (user.getUsername() == username && user.getPassword() == password) {
					Inventory_Management im = new Inventory_Management();
					
				}

			}
			System.out.println("Login Fallido - Intentelo de nuevo");


		} while (successLogin);

	}
}
