package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleOrden")
public class DetalleOrden {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Integer id;
			private String nombre;
			private String cantidad;
			private String precio;
			private double total;
			
			@OneToOne
			private Orden orden ;
			
			@OneToOne
			private Producto producto;
						
			public DetalleOrden() {
				super();
			}
			
			public DetalleOrden(Integer id, String nombre, String cantidad, String precio, double total) {
				super();
				this.id = id;
				this.nombre = nombre;
				this.cantidad = cantidad;
				this.precio = precio;
				this.total = total;
			}

			@Override
			public String toString() {
				return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
						+ ", total=" + total + "]";
			}

			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getCantidad() {
				return cantidad;
			}
			public void setCantidad(String cantidad) {
				this.cantidad = cantidad;
			}
			public String getPrecio() {
				return precio;
			}
			public void setPrecio(String precio) {
				this.precio = precio;
			}
			public double getTotal() {
				return total;
			}
			public void setTotal(double total) {
				this.total = total;
			}
			public Orden getOrden() {
				return orden;
			}
			public void setOrden(Orden orden) {
				this.orden = orden;
			}
			public Producto getProducto() {
				return producto;
			}
			public void setProducto(Producto producto) {
				this.producto = producto;
			}
}
