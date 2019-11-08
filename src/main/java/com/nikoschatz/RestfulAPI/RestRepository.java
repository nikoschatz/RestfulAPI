package com.nikoschatz.RestfulAPI;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestRepository extends CrudRepository<Products, Integer>{

	List<Products> findByName(String name);

	List<Products> findByCode(int code);

	List<Products> findByOrderByPriceAsc();
	
	List<Products> findByOrderByPriceDsc();


	




	

	

	
}
