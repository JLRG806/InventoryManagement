package com.progra.inventory_classes.category;

import junit.framework.TestCase;

public class CategoryTest extends TestCase {
	private Category category;
	
	public void init() {
		category = new Category(25, "Categoria1");
	}
	
	public void testGetters () {
		init();
		assertEquals("Categoria1", category.getCategory_name());
		assertTrue(25==category.getId_category());
	}
	
	public void testSetters () {
		init();
		category.setCategory_name("Categoria2");
		category.setId_category(265612);
		assertNotSame("Categoria1", category.getCategory_name());
		assertNotSame("25", category.getId_category());
	}
}
