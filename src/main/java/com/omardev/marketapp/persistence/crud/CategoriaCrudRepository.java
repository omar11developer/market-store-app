package com.omardev.marketapp.persistence.crud;

import com.omardev.marketapp.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria,Integer> {
}
