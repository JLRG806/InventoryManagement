package com.progra.inventory_classes.inventory_manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.login.Login;
import com.progra.inventory_classes.product.Product;
import com.progra.inventory_classes.user.User;

public class Inventory_Management {

	private static ArrayList<User> users = new ArrayList<User>();
	private static ArrayList<Category> categories = new ArrayList<Category>();
	private static ArrayList<Product> products = new ArrayList<Product>();

	public Scanner userInput;
	private Integer input;
	private Integer displayMenu;

	public Inventory_Management(ArrayList<User> users, ArrayList<Category> categories, Integer displayMenu) {
		this.users = users;
		this.categories = categories;
		this.displayMenu = displayMenu;
		userInput = new Scanner(System.in);
	}

	public void menuType() {
		switch (this.displayMenu) {
		case 0:
			menuAdmin();
			break;
		case 1:
			menuClient();
			break;
		default:
			System.out.println("Error del sistema, por favor inicie de nuevo...");
			System.exit(0);
			break;
		}
	}

	public void menuClient() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║  ¡Bienvenido al menú para clientes! ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║  1) Comprar productos               ║");
			System.out.println("║  2) Ver productos comprados         ║");
			System.out.println("║  3) Devolver produto                ║");
			System.out.println("║  4) Cerrar sesión                   ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╚═════════════════════════════════════╝");
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuClient();
		}
	}

	public void menuAdmin() {
		clearConsole();
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║¡Bienvenido al menú de administrador!║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Productos                      ║");
			System.out.println("║   2) Categorias                     ║");
			System.out.println("║   3) Cerrar sesión                  ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║ Escriba su respuesta:  ");
			this.input = this.userInput.nextInt();
			System.out.println("╚═════════════════════════════════════╝");
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuAdmin();
		}
		switch (this.input) {
		case 1:
			if (this.categories.size() != 0) {
				menuProducts();
			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║     Primero debe ingresar una       ║");
				System.out.println("║            categoria.               ║");
				System.out.println("╚═════════════════════════════════════╝");
				menuAdmin();
			}
			break;
		case 2:
			menuCategory();
			break;
		case 3:
			logOut();
		default:
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuAdmin();
			break;
		}
	}

	public void menuProducts() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║           Menú de Productos         ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Añadir                         ║");
			System.out.println("║   2) Actualizar                     ║");
			System.out.println("║   3) Reabastecer                    ║");
			System.out.println("║   4) Buscar                         ║");
			System.out.println("║   5) Borrar                         ║");
			System.out.println("║   6) Regresar                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║ Escriba su respuesta:  ");
			this.input = this.userInput.nextInt();
			System.out.println("╚═════════════════════════════════════╝");
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuProducts();
		}
		switch (this.input) {
		case 1:
			createProduct();
			break;
		case 2:
			updateProduct();
			break;
		case 3:
			restock();
			break;
		case 4:
			searchProduct();
			break;
		case 5:
			deleteProduct();
			break;
		case 6:
			menuAdmin();
			break;
		default:
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuProducts();
			break;
		}
	}

	public void createProduct() {

	}

	public void updateProduct() {

	}

	public void restock() {

	}

	public void searchProduct() {

	}

	public void deleteProduct() {

	}

	public void menuCategory() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║          Menú de Category           ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Crear                          ║");
			System.out.println("║   2) Actualizar                     ║");
			System.out.println("║   3) Borrar                         ║");
			System.out.println("║   4) Regresar                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║ Escriba su respuesta:  ");
			this.input = this.userInput.nextInt();
			System.out.println("╚═════════════════════════════════════╝");
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
		}
		switch (this.input) {
		case 1:
			createCategory();
			break;
		case 2:
			deleteCategory();
			break;
		case 3:
			deleteCategory();
			break;
		case 4:
			menuAdmin();
			break;
		default:
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
			break;
		}
	}

	public void createCategory() {
		try {
			if (this.categories.size() != 0) {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Lista de categorias existentes   ║");
				System.out.println("╠═════════════════════════════════════╣");
				for (Category category : this.categories) {
					
					System.out.println("║    " + category.getId_category() + ") Nombre: " + category.getCategory_name() + ".");
					
				}
				System.out.println("╚═════════════════════════════════════╝");
			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Sin categorias por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
			}
			Category c;
			Product p;
			String category_name = userInput.nextLine();
			categories.add(c = new Category(category_name, this.products));
			
			

		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
		}

	}

	public void updateCategory() {

	}

	public void deleteCategory() {

	}

	public void menuUser() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║            Menú de Usuario          ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Crear                          ║");
			System.out.println("║   2) Borrar                         ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║ Escriba su respuesta:  ");
			this.input = this.userInput.nextInt();
			System.out.println("╚═════════════════════════════════════╝");
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuUser();
		}
		switch (this.input) {
		case 1:
			// Poner metodos aqui
			break;
		case 2:
			// Poner metodos aqui
			break;
		default:
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuUser();
			break;
		}
	}

	public void logOut() {
		Login l = new Login(this.users, this.categories);
	}

	private void clearConsole() {
		System.out.println(System.lineSeparator().repeat(100));
	}
}
