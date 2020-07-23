package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { //classe possui opera��es estaticas para instanciar os DAO's
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
