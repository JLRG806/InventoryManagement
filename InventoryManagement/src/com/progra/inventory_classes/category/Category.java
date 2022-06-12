package com.progra.inventory_classes.category;

import java.util.ArrayList;

import com.progra.inventory_classes.product.Product;

public class Category {

	private Integer id_category;
	private String category_name;
	private ArrayList<Product> products = new ArrayList<Product>();	

	/**
	 * Constructor
	 * 
	 * @param category_name
	 * @param arrayList 
	 */
	public Category(Integer id_category, String category_name) {
		this.id_category = id_category;
		this.category_name = category_name;
	}

	public Category(Integer id_category, String category_name, ArrayList<Product> products) {
		this.id_category = id_category;
		this.category_name = category_name;
		this.products = products;
	}

	/**
	 * @return the id_category
	 */
	public Integer getId_category() {
		return id_category;
	}

	/**
	 * @param id_category the id_category to set
	 */
	public void setId_category(Integer id_category) {
		this.id_category = id_category;
	}

	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}

	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> id_products) {
		this.products = id_products;
	}

}
