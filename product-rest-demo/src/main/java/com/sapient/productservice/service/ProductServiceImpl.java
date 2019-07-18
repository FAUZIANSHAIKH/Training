package com.sapient.productservice.service;

import com.sapient.productservice.dao.ProductDAO;
import com.sapient.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service(value = "employeeService")
public class ProductServiceImpl implements ProductService {

    @Autowired( required = true)
    @Qualifier(value = "HybernateDAOImpl")
    private ProductDAO productDAO;
    
    public ProductServiceImpl(@Qualifier(value = "HybernateDAOImpl")ProductDAO productDAO){
        this.productDAO = productDAO;
    }
    @Transactional
    public String saveProduct(Product product) {
        System.out.println("Inside the save employee method of Employee service class ....");
        return productDAO.save(product);
    }
    @Transactional
    public List<Product> fetchAllEmployees() {
    	System.out.println("MYSQL Service");
        return productDAO.listAll();
    }
    @Transactional
    public Product findById(int id) {
        return productDAO.findById(id);
    }
    @Transactional
    public void deleteProduct(int id) {
    	productDAO.deleteProduct(id);
    }

    @Transactional
	public void updateProduct(int id, Product product) {
		System.out.println("Case inside the update product method");
		productDAO.updateProduct(id, product);
		
	}
	
	
}