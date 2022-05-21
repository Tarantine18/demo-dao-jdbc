package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

public class Program {

	public static void main(String[] args) {

	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	sellerDao.deleteById(7);
	
	
	
	
	}

}
