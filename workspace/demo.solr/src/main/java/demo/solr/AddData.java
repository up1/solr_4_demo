package demo.solr;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

public class AddData {

	public static void main(String[] args) {
		try {

			String url = "http://localhost:8080/app1/collection1";
			SolrServer server = new HttpSolrServer(url);

			SolrInputDocument doc1 = new SolrInputDocument();
			doc1.addField("id", "1", 1.0f);
			doc1.addField("name", "doc 1", 1.0f);
			doc1.addField("price", 10);

			SolrInputDocument doc2 = new SolrInputDocument();
			doc2.addField("id", "2", 1.0f);
			doc2.addField("name", "doc 2222", 1.0f);
			doc2.addField("price", 100);

			Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
			docs.add(doc1);
			docs.add(doc2);

			server.add(docs);
			server.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
