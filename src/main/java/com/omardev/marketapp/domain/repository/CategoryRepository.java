package com.omardev.marketapp.domain.repository;

import com.omardev.marketapp.domain.dto.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<Category> getAll();
    Optional<Category> getCategory(int categoryId);

    Category save(Category category);

    void delete(int categoryId);

}
