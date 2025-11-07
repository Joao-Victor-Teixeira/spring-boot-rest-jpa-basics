package com.joaodev.spring_boot_basic.repositories;

import com.joaodev.spring_boot_basic.entities.Category;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}