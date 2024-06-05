package com.siscon.productor.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Fredi
 * 
 */
@Getter
@Setter

@ToString
@EqualsAndHashCode

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column
	private String nombre;

	@Column
	private String detalle;

	@Column
	private Integer codigo;

	@Column
	private Integer precio;

	@Column
	private String proveedor;

	@OneToMany(mappedBy = "product")
	private List<Proveedor> listProveedor;
}
