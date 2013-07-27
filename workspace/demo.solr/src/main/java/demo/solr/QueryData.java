package demo.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class QueryData {

	public static void main(String[] args) {
		try {
			String url = "http://localhost:8080/app1/collection1";
			SolrServer server = new HttpSolrServer(url);

			SolrQuery query = new SolrQuery();
			query.setQuery("*:*");
			query.addSort("price", SolrQuery.ORDER.asc);

			QueryResponse rsp = server.query(query);
			SolrDocumentList docs = rsp.getResults();
			for (SolrDocument solrDocument : docs) {
				System.out.print("ID:" + solrDocument.getFieldValue("id"));
				System.out.print(", Name:" + solrDocument.getFieldValue("name"));
				System.out.println(", Price:" + solrDocument.getFieldValue("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
