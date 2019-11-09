package com.nikoschatz.RestfulAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController  {
	
	//injecting RestRepository
	@Autowired
	private RestRepository repository;
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Products product) {
		repository.save(product);
		return "New product saved!";
	}
	@GetMapping("/getProduct/(name)")
	public List<Products> getProductByName(@PathVariable String name){
		return repository.findByName(name);
	}
	@GetMapping("/getProduct/(code)")
	public List<Products> getProductByCode(@PathVariable int code){
		return repository.findByCode(code);
	}
	
	@GetMapping("getProducts/(price)")
	public List<Products> findAllOrderByPriceAsc(@PathVariable float price) {
        return repository.findByOrderByPriceAsc();
    }
	@GetMapping("getProducts/(price)")
	public List<Products> findAllOrderByPriceDsc(@PathVariable float price){
		return repository.findByOrderByPriceDsc();
		
	}
	
	@DeleteMapping("/deleteProduct/(code)")
	public void deleteProduct(@PathVariable int code) {
		repository.deleteById(code);
	}
	
	
	/**@DeleteMapping("/deleteProduct/{code}")
    public String deleteProduct(@PathVariable("code") int code) {
        Optional<Products> p = repository.findById(code);
        repository.delete(p);
        return "deleted";
    }*/
	

}
