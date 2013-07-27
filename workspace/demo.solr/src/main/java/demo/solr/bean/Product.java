package demo.solr.bean;

import org.apache.solr.client.solrj.beans.Field;

public class Product {

	@Field
	private String id;
	@Field
	private String name;
	@Field
	private float price;
	
	public Product(String id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
