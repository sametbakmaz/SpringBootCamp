package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//sadece db erişim kodları yazılır.SQL
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
