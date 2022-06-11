/**
 * 
 */
package com.progra.inventory_classes.user;

/**
 * @author angel
 *
 */
public class User extends People {

	private Integer id_user;
	private String username;
	private int user_type;
	private String password;
	private int counter = 0;

	/**
	 * Constructor
	 * 
	 * @param username
	 * @param user_type
	 * @param password
	 */
	public User(String username, int user_type, String password) {
		this.id_user = counter;
		this.username = username;
		this.user_type = user_type;
		this.password = password;
		this.counter++;
	}

	/**
	 * @return the id_user
	 */
	@Override
	public Integer getId_user() {
		return id_user;
	}

	/**
	 * @param id_user the id_user to set
	 */
	@Override
	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	/**
	 * @return the username
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the user_type
	 */
	@Override
	public int getUser_type() {
		return user_type;
	}

	/**
	 * @param user_type the user_type to set
	 */
	@Override
	public void setUser_type(int user_type) {  
		this.user_type = user_type;
	}

	/**
	 * @return the password
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
