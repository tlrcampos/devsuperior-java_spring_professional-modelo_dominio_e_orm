package com.devsuperior.dscommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quatity;
	private Double price;
	
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Order order, Product product, Integer quatity, Double price) {
		this.id.setOrder(order);
		this.id.setProduct(product);
		this.quatity = quatity;
		this.price = price;
	}
	
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		this.id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		this.id.setProduct(product);
	}

	public Integer getQuatity() {
		return quatity;
	}

	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
