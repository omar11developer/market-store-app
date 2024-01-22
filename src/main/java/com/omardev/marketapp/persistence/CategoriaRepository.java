package com.omardev.marketapp.persistence;

import com.omardev.marketapp.domain.dto.Category;
import com.omardev.marketapp.domain.repository.CategoryRepository;
import com.omardev.marketapp.persistence.crud.CategoriaCrudRepository;
import com.omardev.marketapp.persistence.entity.Categoria;
import com.omardev.marketapp.persistence.mapper.CategoryMapper;

import java.util.List;
import java.util.Optional;

public class CategoriaRepository implements CategoryRepository {

    private CategoriaCrudRepository categoriaCrudRepository;
    private CategoryMapper mapper;

    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategories(categorias);
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        return categoriaCrudRepository.findById(categoryId).map(categoria -> mapper.toCategory(categoria));
    }

    @Override
    public Category save(Category category) {
        Categoria categoria =  mapper.toCategoria(category);
        return mapper.toCategory(categoriaCrudRepository.save(categoria));
    }

    @Override
    public void delete(int categoryId) {
        categoriaCrudRepository.deleteById(categoryId);
    }
}
