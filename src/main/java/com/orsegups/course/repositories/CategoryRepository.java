package com.orsegups.course.repositories;

import com.orsegups.course.entities.Category;
import com.orsegups.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
