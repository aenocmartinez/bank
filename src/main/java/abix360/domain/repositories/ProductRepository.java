package abix360.domain.repositories;

import abix360.domain.Product;

public interface ProductRepository {
	public boolean create(Product product);
	public boolean delete(Product product);
	public boolean update(Product product);	
	public Product findById(int id);	
}
