package com.niit.bookpalace.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.bookpalace.dao.SupplierDAO;
import com.niit.bookpalace.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("/getSuppliers")
	public ModelAndView showSupplier() {
		List<Supplier> supplierList = supplierDAO.getSuppliers();
		ModelAndView mv = new ModelAndView("/supplierspage");
		mv.addObject("supplierList", supplierList);
		return mv;
	}
	
}
