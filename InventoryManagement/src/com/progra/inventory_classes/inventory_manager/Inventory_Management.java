package com.progra.inventory_classes.inventory_manager;

import java.util.Scanner;

public class Inventory_Management {
	public Scanner userInput; 
	private int input;
	public Inventory_Management() {
		userInput = new Scanner (System.in);
	}


	public void menuClient() {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║  ¡Bienvenido al menú para usuarios! ║");
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
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║¡Bienvenido al menú de administrador!║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Productos                      ║");
			System.out.println("║   2) Categorias                     ║");
			System.out.println("║   3) Usuario                        ║");
			System.out.println("║   4) Cerrar sesión                  ║");
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
		case 1 :
			menuProducts();
			break;
		case 2 :
			menuCategory();
			break;
		case 3 :
			menuUser();
			break;
		default:
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║    Parece que ha habido un error,   ║");
			System.out.println("║          Intentelo nuevamente       ║");
			System.out.println("╚═════════════════════════════════════╝");
			menuAdmin();
			break;
		}
	}
	public void menuProducts () {
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
			System.out.println("║   5) Mostrar status                 ║");
			System.out.println("║   6) Borrar                         ║");
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
		case 1 :
			//Poner metodos aqui
			break;
		case 2 :
			//Poner metodos aqui
			break;
		case 3 :
			//Poner metodos aqui
			break;
		case 4 :
			//Poner metodos aqui
			break;
		case 5 :
			//Poner metodos aqui
			break;
		case 6 :
			//Poner metodos aqui
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
	public void menuCategory () {
		try {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║          Menú de Category           ║");
			System.out.println("╠═════════════════════════════════════╣");
			System.out.println("║  ¿Qué desea hacer a continuación?   ║");
			System.out.println("║                                     ║");
			System.out.println("║   1) Crear                          ║");
			System.out.println("║   2) Actualizar                     ║");
			System.out.println("║   3) Borrar                         ║");
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
		case 1 :
			//Poner metodos aqui
			break;
		case 2 :
			//Poner metodos aqui
			break;
		case 3 :
			//poner metodos aqui
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
	public void menuUser () {
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
		case 1 :
			//Poner metodos aqui
			break;
		case 2 :
			//Poner metodos aqui
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
}
