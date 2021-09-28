package com.malvika.springboot.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.malvika.springboot.data.entities.Product;
import com.malvika.springboot.data.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductdataApplicationTests {
	
	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Samsung");
		product.setDesc("Android");
		product.setPrice(1000d);
		repository.save(product);
	}
	
	@Test
	public void testRead() {
		Product product = repository.findById(1).get();
		assertNotNull(product);
		assertEquals("Samsung",product.getName());
	}
	
	@Test
	public void testUpdate() {
		Product product = repository.findById(1).get();
		product.setPrice(1300d);
		repository.save(product);

		
	}
	
	@Test
	public void testDelete() {
		if(repository.existsById(1))
		repository.deleteById(1);
		
	}

}
