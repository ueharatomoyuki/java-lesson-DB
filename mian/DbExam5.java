package mian;

import java.sql.Connection;
import java.util.List;

import dao.ProductDao ;
import entity.Product;
import util.DbUtil; 

public class DbExam5 {
	public static void main(String[] args) {
		Connection connection;
		ProductDao ProductDao; 
		connection = DbUtil.getConnection(); 
		ProductDao = new ProductDao(connection) ;
		List<Product> list = ProductDao.findAll();
		Product newProduct = new Product("ボールペン",200) ;
		ProductDao.register(newProduct);
		for(Product p : list) {
			System.out.println("product_id:"+p.getProductId()+", product_name:"+p.getProductName()
			+", price"+p.getPrice());
		}
	}
}

