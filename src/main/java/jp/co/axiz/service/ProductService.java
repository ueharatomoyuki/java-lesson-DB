package jp.co.axiz.service;

import java.sql.Connection;

import jp.co.axiz.dao.ProductDao;
import jp.co.axiz.entity.Product;
import jp.co.axiz.util.DbUtil;

public class ProductService {
    public Product authentication(int id) {
        try (Connection conn = DbUtil.getConnection()) {
            ProductDao productDao = new ProductDao(conn);
            Product product = productDao.findAll();

            return product;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
