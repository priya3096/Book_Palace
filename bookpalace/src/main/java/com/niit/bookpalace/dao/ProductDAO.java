package com.niit.bookpalace.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.niit.bookpalace.model.Product;
@Repository
public class ProductDAO {
	
	public List<Product> getProducts()
	{
		List<Product> list= new ArrayList<Product>();
		Product p= new Product();
		p.setProductId("P_101");
		p.setProductName("Deception Point");
		p.setProductType("Fiction");
		
		list.add(p);
		
		 p= new Product();
		p.setProductId("P_102");
		p.setProductName("Wings of Fire");
		p.setProductType("Autobiography");
		
		list.add(p);
		
		 p= new Product();
		p.setProductId("P_103");
		p.setProductName("In Cold Blood");
		p.setProductType("Non-Fiction");
		
		list.add(p);
		

		 p= new Product();
		p.setProductId("P_104");
		p.setProductName("Percy Jackson and the Lightning Theif");
		p.setProductType("Fiction");
		
		list.add(p);
		

		 p= new Product();
		p.setProductId("P_105");
		p.setProductName("Harry Potter and the Goblet of Fire");
		p.setProductType("Fiction");
		
		list.add(p);
		

		 p= new Product();
		p.setProductId("P_106");
		p.setProductName("The Hunger Games");
		p.setProductType("Fiction");
		
		list.add(p);
		return list;
	}

}
