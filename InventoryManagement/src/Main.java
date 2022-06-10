import java.util.ArrayList;

import com.progra.inventory_classes.category.Category;
import com.progra.inventory_classes.login.Login;
import com.progra.inventory_classes.user.User;

/**
 * 
 */

/**
 * @author angel
 *
 */
public class Main {

	private static ArrayList<User> users = new ArrayList<User>();
	private static ArrayList<Category> categories = new ArrayList<Category>();	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Login login;

		login = new Login(users, categories);

	}

}
