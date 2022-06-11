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
			loginMenu(this.users, this.categories);
		}
	}
	
	public Login(ArrayList<User> users, ArrayList<Category> categories, boolean test) {
		this.users = users;
		this.categories = categories;
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
		System.out.println("║  Se creara un usuario Admin ...   ║");
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
			loginMenu(this.users, this.categories);

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
			for (User user : this.users) {

				if (user.getUsername().compareTo(username) == 0 && user.getPassword().compareTo(password) == 0) {
					Inventory_Management im = new Inventory_Management(this.users, this.categories,
							user.getUser_type());
					im.menuType();

				} else {
					System.out.println("Login Fallido - Intentelo de nuevo");
					successLogin = true;
				}
			}

		} while (successLogin);

	}
}
