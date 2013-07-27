package demo.solr;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

public class DeleteData {

	public static void main(String[] args) {
		try {
			String url = "http://localhost:8080/app1/collection1";
			SolrServer server = new HttpSolrServer(url);
			server.deleteByQuery("*:*");
			server.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
