package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductService;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Iphone XR", 9000);
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger()};

		ProductService productService = new ProductService(new JdbcProductDao(), loggers);

		productService.add(product1);
	}

}
