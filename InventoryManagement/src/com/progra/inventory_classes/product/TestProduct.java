package com.progra.inventory_classes.product;

import junit.framework.TestCase;

public class TestProduct extends TestCase{
		private Product product;
		
		public void init () {
			this.product = new Product(1,"Producto1", 0.5, 56);
		}
		
		public void testGetters () {
			init();
			assertTrue(product.getId_product()==1);
			assertTrue(product.getProduct_name()=="Producto1");
			assertTrue(product.getPrice()== 0.5);
			assertTrue(product.getStock_quantity()==56);
		}
		
		public void testSetters () {
			init();
			product.setId_product(28);
			assertNotSame(1, product.getId_product());
			product.setProduct_name("Producto2");
			assertNotSame("Producto1", product.getProduct_name());
			product.setPrice(0.25);
			assertNotSame(0.5, product.getPrice());
			product.setStock_quantity(544);
			assertNotSame(56, product.getStock_quantity());
		}
}

