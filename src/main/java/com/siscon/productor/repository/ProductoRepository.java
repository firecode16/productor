package com.siscon.productor.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siscon.productor.model.Producto;

/**
 * @author Fredi
 * 
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

	Optional<Producto> findById(Integer id);
}
