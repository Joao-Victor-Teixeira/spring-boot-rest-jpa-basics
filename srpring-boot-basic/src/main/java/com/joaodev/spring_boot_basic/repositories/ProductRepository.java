package com.joaodev.spring_boot_basic.repositories;


import com.joaodev.spring_boot_basic.entities.Product;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
