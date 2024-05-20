package com.siscon.productor.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siscon.productor.model.Producto;
import com.siscon.productor.response.ResponseObj;
import com.siscon.productor.service.ProductoService;

/**
 * @author Fredi
 * 
 */
@CrossOrigin
@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@PostMapping("api/insertProdcut")
	public ResponseObj insertProdcut(@RequestBody HashMap<String, Object> map) {
		Producto product = new Producto();

		product.setId((Integer) map.get("id"));
		product.setNombre((String) map.get("nombre"));
		product.setDetalle((String) map.get("detalle"));
		product.setCodigo((Integer) map.get("codigo"));
		product.setPrecio((Integer) map.get("precio"));
		product.setProveedor((String) map.get("proveedor"));

		return new ResponseObj("OK", productoService.insertProduct(product));
	}

	@GetMapping("api/getProveedor/{idProduct}")
	public ResponseObj getProveedor(@PathVariable Integer idProduct) {
		return new ResponseObj("OK", productoService.getProveedor(idProduct));
	}
}
