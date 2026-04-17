package com.skiriaus.knygynoPuslapis.services;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnygosIeskojimoSolrService {
    private final SolrClient solrClient;

    public KnygosIeskojimoSolrService(SolrClient solrClient) {
        this.solrClient = solrClient;
    }
    public List<Long> ieskotiKnygos(String ieskojimoTerminas){
        if (ieskojimoTerminas == null || ieskojimoTerminas.trim().isEmpty()) {
            return List.of();
        }
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.set("defType", "edismax");
        solrQuery.setQuery(ieskojimoTerminas);
        solrQuery.set("qf", "pavadinimas^2.0 autoriai^0.6 aprasymas^0.5 zanrai^0.4 leidejas^0.2 metai^0.1");
        solrQuery.setFields("id");

        List<Long> ids = new ArrayList<>();
        try {
            QueryResponse queryResponse = solrClient.query("books", solrQuery);
            SolrDocumentList solrDocumentList = queryResponse.getResults();
            for (SolrDocument solrDocument : solrDocumentList){
                Object idReiksme = solrDocument.getFieldValue("id");
                Long id = Long.parseLong(idReiksme.toString());
                ids.add(id);
            }
            return ids;
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

}
