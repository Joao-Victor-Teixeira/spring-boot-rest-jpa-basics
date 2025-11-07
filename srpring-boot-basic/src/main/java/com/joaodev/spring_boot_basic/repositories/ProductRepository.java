package com.joaodev.spring_boot_basic.repositories;


import com.joaodev.spring_boot_basic.entities.Product;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Component;


@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}
