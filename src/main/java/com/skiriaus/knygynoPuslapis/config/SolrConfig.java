package com.skiriaus.knygynoPuslapis.config;

import org.apache.solr.client.solrj.impl.Http2SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SolrConfig {

    @Bean
    public HttpSolrClient solrClient(){
        return new HttpSolrClient.Builder("http://localhost:8983/solr").build();
    }
}
