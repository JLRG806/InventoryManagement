/**
 * 
 */
package com.progra.inventory_classes.product;

/**
 * @author angel
 *
 */
public class Product {

	private Integer id_product;
	private String product_name;
	private double price;
	private int stock_quantity;

	/**
	 * Constructor
	 * 
	 * @param product_name
	 * @param price
	 * @param stock_quantity
	 */
	public Product(Integer id_product, String product_name, double price, int stock_quantity) {
		this.id_product = id_product;
		this.product_name = product_name;
		this.price = price;
		this.stock_quantity = stock_quantity;
	}

	/**
	 * @return the id_product
	 */
	public Integer getId_product() {
		return id_product;
	}

	/**
	 * @param id_product the id_product to set
	 */
	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the stock_quantity
	 */
	public int getStock_quantity() {
		return stock_quantity;
	}

	/**
	 * @param stock_quantity the stock_quantity to set
	 */
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

}
