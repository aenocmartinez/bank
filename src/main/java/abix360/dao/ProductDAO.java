package abix360.dao;


import abix360.domain.Product;
import abix360.domain.repositories.ProductRepository;

public class ProductDAO implements ProductRepository {

	@Override
	public boolean create(Product product) {
		System.out.println("");
		System.out.println("***************** Guarda producto en DAO *****************");
		System.out.println("");
		System.out.println(product.getType() + " - " + product.getNumber());
		System.out.println("");
		System.out.println("");
		return true;
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
