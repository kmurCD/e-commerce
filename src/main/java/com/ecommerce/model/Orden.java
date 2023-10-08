package com.ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Orden {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Integer id;
			private String numero;
			private String fechaCreacionl;
			private String fechaRecibida;
			private double total;
			
			@ManyToOne
			private Usuario usuario;
			
			
			@OneToOne(mappedBy = "orden")
			private DetalleOrden detalle;
			
			public Orden() {
				super();
			}
			
			public Orden(Integer id, String numero, String fechaCreacionl, String fechaRecibida, double total) {
				super();
				this.id = id;
				this.numero = numero;
				this.fechaCreacionl = fechaCreacionl;
				this.fechaRecibida = fechaRecibida;
				this.total = total;
			}
						
			@Override
			public String toString() {
				return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacionl=" + fechaCreacionl
						+ ", fechaRecibida=" + fechaRecibida + ", total=" + total + "]";
			}

			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getNumero() {
				return numero;
			}
			public void setNumero(String numero) {
				this.numero = numero;
			}
			public String getFechaCreacionl() {
				return fechaCreacionl;
			}
			public void setFechaCreacionl(String fechaCreacionl) {
				this.fechaCreacionl = fechaCreacionl;
			}
			public String getFechaRecibida() {
				return fechaRecibida;
			}
			public void setFechaRecibida(String fechaRecibida) {
				this.fechaRecibida = fechaRecibida;
			}
			public double getTotal() {
				return total;
			}
			public void setTotal(double total) {
				this.total = total;
			}
			public Usuario getUsuario() {
				return usuario;
			}
			public void setUsuario(Usuario usuario) {
				this.usuario = usuario;
			}
			public DetalleOrden getDetalle() {
				return detalle;
			}
			public void setDetalle(DetalleOrden detalle) {
				this.detalle = detalle;
			}			
}
