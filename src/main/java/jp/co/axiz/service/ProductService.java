package jp.co.axiz.service;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

import jp.co.axiz.dao.ProductDao;
import jp.co.axiz.entity.Product;
import jp.co.axiz.util.DbUtil;

public class ProductService {
	public List<Product> authentication(Product name) {
		try (Connection conn = DbUtil.getConnection()) {
			ProductDao productDao = new ProductDao(conn);
			List<Product> product = productDao.find(name);
			return product ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null ;
	}

	public static List<Product> find() {
		try (Connection conn = DbUtil.getConnection()) {
			ProductDao userDao = new ProductDao(conn);
			return userDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}