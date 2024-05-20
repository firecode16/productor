package com.siscon.productor.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siscon.productor.model.Producto;
import com.siscon.productor.repository.ProductoRepository;

/**
 * @author Fredi
 * 
 */
@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Transactional
	public int insertProduct(Producto product) {
		productoRepository.save(product);
		return 1;
	}

	public Optional<Producto> getProveedor(Integer idProduct) {
		return productoRepository.findById(idProduct);
	}
}
