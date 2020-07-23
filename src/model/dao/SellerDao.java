package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); //operação resposanvel por inserir do BD o objeto obj
	void update(Seller obj); 
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	

}
