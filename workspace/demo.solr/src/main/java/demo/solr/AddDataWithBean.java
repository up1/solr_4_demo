package demo.solr;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

import demo.solr.bean.Product;

public class AddDataWithBean {

	public static void main(String[] args) {
		try {
			String url = "http://localhost:8080/app1/collection1";
			SolrServer server = new HttpSolrServer(url);

			Product product1 = new Product("1", "product 1", 100f);
			Product product2 = new Product("2", "product 2", 200f);
			List<Product> products = new ArrayList<Product>();
			products.add(product1);
			products.add(product2);
			server.addBeans(products);
			server.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
