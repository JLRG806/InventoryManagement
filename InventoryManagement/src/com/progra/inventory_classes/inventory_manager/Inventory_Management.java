package com.progra.inventory_classes.inventory_manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.login.Login;
import com.progra.inventory_classes.product.Product;
import com.progra.inventory_classes.user.User;

public class Inventory_Management {

	private static ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Category> categories = new ArrayList<Category>();
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<ArrayList<Integer>> category_product = new ArrayList<>();

	private Integer categoryCounter = 0;
	private Integer productCounter = 0;

	public Scanner userInput;
	private Integer input;
	private Integer displayMenu;

	/**
	 * Constructor
	 * 
	 * @param users
	 * @param categories
	 * @param displayMenu
	 */
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

	public void manageData(Integer id_category, Integer id_product, Integer type) {
		if (type == 0) {
			for (int i = 0; i < categories.size(); i++) {
				if (categories.get(i).getId_category() == id_category) {
					category_product.add(i, new ArrayList<Integer>());
				}
			}

		} else if (type == 1) {
			for (int i = 0; i < categories.size(); i++) {
				if (categories.get(i).getId_category() == id_category) {
					category_product.remove(i);
				}
			}
		} else if (type == 2) {
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i).getId_product() == id_product) {
					this.category_product.get(id_category).add(i);
				}
				
			}
			
		} else if (type == 3) {

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

	/**
	 * Imprime el meni de Administrador
	 */
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
			this.input = Integer.parseInt(userInput.nextLine());
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

	/**
	 * Imprime el menu de productos.
	 */
	public void menuProducts() {
		clearConsole();
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║           Menú de Productos         ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Añadir                         ║");
			System.out.println("║   2) Actualizar                     ║");
			System.out.println("║   3) Reabastecer                    ║");
			System.out.println("║   4) Borrar                         ║");
			System.out.println("║   5) Regresar                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║ Escriba el número de la opción a    ║");
			System.out.println("║ continuación:                       ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║ Escriba su respuesta:  ");
			this.input = Integer.parseInt(userInput.nextLine());
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
			deleteProduct();
			break;
		case 5:
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

	/**
	 * Crea un producto.
	 */
	public void createProduct() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║           Crear Producto            ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");
			if (this.products.size() != 0) {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Lista de productos existentes    ║");
				System.out.println("╠═════════════════════════════════════╣");

				for (Category category : this.categories) {

					for (Product product : this.products) {

						System.out.println("║    Id: " + product.getId_product());
						System.out.println("║    Nombre: " + product.getProduct_name());
						System.out.println("║    Precio: " + product.getPrice());
						System.out.println("║    Existencias: " + product.getStock_quantity());
						for (int i = 0; i < this.category_product.size(); i++) {
							for (int j = 0; j < this.category_product.get(i).size(); j++) {
								this.category_product.get(i).get(i);
								if (category.getId_category() == i && this.category_product.get(i).get(j) == product.getId_product()) {
									System.out.println("║    Categoria: " + category.getCategory_name());
								}
							}
						}
					}
				}
				System.out.println("╚═════════════════════════════════════╝");
			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║     Sin productos por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");				
			}

			System.out.println("╔═════════════════════════════════════╗");
			System.out.print("║    Nombre del producto: ");
			String product_name = userInput.nextLine();
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║    Precio del producto: ");
			double price = Double.parseDouble(userInput.nextLine());
			System.out.println("╠═════════════════════════════════════╣");
			System.out.print("║    Existencias del producto: ");
			Integer stock = Integer.parseInt(userInput.nextLine());

			if (this.categories.size() != 0) {
				System.out.println("╠═════════════════════════════════════╣");
				System.out.println("║    Lista de categorias existentes   ║");
				System.out.println("╠═════════════════════════════════════╣");
				for (Category category : this.categories) {

					System.out.println("║    " + category.getId_category() + ")Nombre: " + category.getCategory_name());

				}
				System.out.println("╠═════════════════════════════════════╣");

			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Sin categorias por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
				userInput.nextLine();
			}
			System.out.print("║   Seleccione el N° de categoria para el producto: ");
			Integer category_id = Integer.parseInt(userInput.nextLine());
			System.out.println("╠═════════════════════════════════════╣");
			for (int i = 0; i < this.categories.size(); i++) {
				if (this.categories.get(i).getId_category() == category_id) {
					Category c;
					Product p;
					String category_name = this.categories.get(i).getCategory_name();

					this.products.add(p = new Product(this.productCounter, product_name, price, stock));

					this.categories.set(i, c = new Category(category_id, category_name));

					manageData(i, this.productCounter, 2);
					
					this.productCounter++;

				}

			}
			menuProducts();
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			System.out.println(e);
			userInput.nextLine();
			menuProducts();
		}
	}

	/**
	 * Actualiza un producto
	 */
	public void updateProduct() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║        Actualizar Producto          ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");

			if (this.products.size() != 0) {
				if (this.categories.size() != 0) {
					System.out.println("╔═════════════════════════════════════╗");
					System.out.println("║    Lista de productos existentes    ║");
					System.out.println("╠═════════════════════════════════════╣");
					
					
					for (int i = 0; i < this.category_product.size(); i++) {
						for (int j = 0; j < this.category_product.get(i).size(); j++) {
							if (this.categories.get(i).getId_category() ==  i && this.products.get(j).getId_product() == this.category_product.get(i).get(j)) {
								System.out.println("║    Id: " + this.products.get(j).getId_product());
								System.out.println("║    Nombre: " + this.products.get(j).getProduct_name());
								System.out.println("║    Precio: " + this.products.get(j).getPrice());
								System.out.println("║    Existencias: " + this.products.get(j).getStock_quantity());
								System.out.println("║    Categoria: " + this.categories.get(i).getCategory_name());
							} 
						}
					}
					
					System.out.println("╠═════════════════════════════════════╣");
					System.out.print("║    Actualizar producto ID N°: ");
					Integer product_id = Integer.parseInt(userInput.nextLine());
					System.out.println("╚═════════════════════════════════════╝");
					for (Product product : this.products) {
						if (product.getId_product() == product_id) {
							Category c;
							Product p;

							System.out.println("╠═════════════════════════════════════╣");
							System.out.print("║    Nombre del producto: ");
							String product_name = userInput.nextLine();
							System.out.println("╠═════════════════════════════════════╣");
							System.out.print("║    Precio del producto: ");
							double price = Double.parseDouble(userInput.nextLine());
							System.out.println("╠═════════════════════════════════════╣");

							System.out.println("╚═════════════════════════════════════╝");
							if (this.categories.size() != 0) {
								System.out.println("╠═════════════════════════════════════╣");
								System.out.println("║    Lista de categorias existentes   ║");
								System.out.println("╠═════════════════════════════════════╣");
								for (Category category : this.categories) {

									System.out.println("║    " + category.getId_category() + ")Nombre: "
											+ category.getCategory_name());

								}
								System.out.println("╠═════════════════════════════════════╣");

							} else {
								System.out.println("╔═════════════════════════════════════╗");
								System.out.println("║    Sin categorias por mostrar...    ║");
								System.out.println("╚═════════════════════════════════════╝");
								userInput.nextLine();
							}

							System.out.print("║   Seleccione el N° de categoria para el producto: ");
							Integer category_id = Integer.parseInt(userInput.nextLine());
							System.out.println("╠═════════════════════════════════════╣");
							for (int i = 0; i < this.categories.size(); i++) {
								if (this.categories.get(i).getId_category() == category_id) {
									Integer stock = product.getStock_quantity();
									String category_name = this.categories.get(i).getCategory_name();

									this.products.add(p = new Product(this.productCounter, product_name, price, stock));

									this.categories.set(i, c = new Category(category_id, category_name));

									manageData(i, this.productCounter, 2);

								}
							}
							menuProducts();
						}
					}
				} else {
					System.out.println("╔═════════════════════════════════════╗");
					System.out.println("║    Registre primero categorias...   ║");
					System.out.println("╚═════════════════════════════════════╝");
					userInput.nextLine();
				}

			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║     Sin productos por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
				userInput.nextLine();
				menuProducts();
			}

		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			System.out.println(e);
			userInput.nextLine();
			menuProducts();
		}

	}

	/**
	 * Reabastece un producto
	 */
	public void restock() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║       Reabastecer Producto          ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");

		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuProducts();
		}
	}

	/**
	 * Borra un producto
	 */
	public void deleteProduct() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║          Borrar Producto            ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");

		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuProducts();
		}
	}

	/**
	 * Imprime el menu de categoria
	 */
	public void menuCategory() {
		clearConsole();
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
			this.input = Integer.parseInt(userInput.nextLine());
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
			updateCategory();
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

	/**
	 * Crea una categoria
	 */
	public void createCategory() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║           Crear Categoria           ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");
			if (this.categories.size() != 0) {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Lista de categorias existentes   ║");
				System.out.println("╠═════════════════════════════════════╣");
				for (Category category : this.categories) {

					System.out.println("║    " + category.getId_category() + ")Nombre: " + category.getCategory_name());

				}
				System.out.println("╚═════════════════════════════════════╝");
			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Sin categorias por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
			}
			Category c;

			System.out.println("╔═════════════════════════════════════╗");
			System.out.print("║    Nombre de la categoria: ");
			String category_name = userInput.nextLine();
			System.out.println("╚═════════════════════════════════════╝");

			this.categories.add(c = new Category(this.categoryCounter, category_name));
			manageData(this.categoryCounter, 0, 0);
			System.out.println("Tamaño: "+this.category_product.size());

			this.categoryCounter++;

			menuCategory();
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
		}

	}

	/**
	 * Actualiza una categoria
	 */
	public void updateCategory() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║        Actualizar Categoria         ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");
			if (this.categories.size() != 0) {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Lista de categorias existentes   ║");
				System.out.println("╠═════════════════════════════════════╣");
				for (Category category : this.categories) {

					System.out.println("║    " + category.getId_category() + ")Nombre: " + category.getCategory_name());

				}
				System.out.println("╠═════════════════════════════════════╣");
				System.out.print("║    Actualizar categoria N°: ");
				Integer category_id = Integer.parseInt(userInput.nextLine());
				System.out.println("╚═════════════════════════════════════╝");
				for (Category category : this.categories) {
					if (category.getId_category() == category_id) {
						Category c;
						Product p;

						System.out.println("╠═════════════════════════════════════╣");
						System.out.print("║    Nombre de la categoria: ");
						String category_name = userInput.nextLine();
						System.out.println("╚═════════════════════════════════════╝");
						category.setCategory_name(category_name);

					} else {
						System.out.println("╔═════════════════════════════════════╗");
						System.out.println("║  Seleccione una categoria existente ║");
						System.out.println("╚═════════════════════════════════════╝");
					}

				}

			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Sin categorias por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
				menuCategory();
			}
			menuCategory();
		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
		}

	}

	/**
	 * Borra una categoria
	 */
	public void deleteCategory() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║          Borrar Categoria           ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");

			if (this.categories.size() != 0) {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Lista de categorias existentes   ║");
				System.out.println("╠═════════════════════════════════════╣");
				for (Category category : this.categories) {

					System.out.println("║    " + category.getId_category() + ")Nombre: " + category.getCategory_name());

				}
				System.out.println("╠═════════════════════════════════════╣");
				System.out.println("║     Eliminar categorias borra       ║");
				System.out.println("║  los productos relacionados a esta  ║");
				System.out.println("╠═════════════════════════════════════╣");
				System.out.print("║    Eliminar categoria N°: ");
				Integer category_id = Integer.parseInt(userInput.nextLine());
				System.out.println("╚═════════════════════════════════════╝");
				for (int i = 0; i < this.categories.size(); i++) {
					if (this.categories.get(i).getId_category() == category_id) {
						this.categories.remove(i);
						manageData(category_id, 0, 1);						
					}
				}

			} else {
				System.out.println("╔═════════════════════════════════════╗");
				System.out.println("║    Sin categorias por mostrar...    ║");
				System.out.println("╚═════════════════════════════════════╝");
				menuCategory();
			}
			menuCategory();

		} catch (Exception e) {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuCategory();
		}
	}

	public void logOut() {
		Login l = new Login(this.users, this.categories);
	}

	public static void clearConsole() {
		System.out.println(System.lineSeparator().repeat(100));		
	}
		

	
}
