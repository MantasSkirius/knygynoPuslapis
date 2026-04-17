package com.skiriaus.knygynoPuslapis.services;

import com.skiriaus.knygynoPuslapis.dao.KnygaDao;
import com.skiriaus.knygynoPuslapis.domain.Knyga;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 Šį klasė paleidžia po aplication contex pakrovimo. Gauna knygas iš duomenų bazes ir jas sudeda į solr
 indeksavimo serveri.
 */
@Service
public class SolrService implements CommandLineRunner {

    private final SolrClient solrClient;
    private final KnygaDao knygaDao;

    public SolrService(SolrClient solrClient, KnygaDao knygaDao) {
        this.solrClient = solrClient;
        this.knygaDao = knygaDao;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Knyga> knygos = knygaDao.findAll();
        for(Knyga knyga : knygos){
            indeksuotiKnyga(knyga);
        }
        solrClient.commit("books");
    }
    private void indeksuotiKnyga(Knyga knyga) {
        SolrInputDocument doc = new SolrInputDocument();

        doc.addField("id", knyga.getId());
        doc.addField("pavadinimas", knyga.getPavadinimas());
        doc.addField("virselio_adresas", knyga.getVirselioAdresas());
        doc.addField("aprasymas", knyga.getAprasymas());
        doc.addField("zanrai", knyga.getZanrai());
        doc.addField("metai", knyga.getMetai());
        doc.addField("leidejas", knyga.getLeidejas());
        doc.addField("puslapiu_skaicius", knyga.getPuslapiuSkaicius());
        doc.addField("formato_informacija", knyga.getFormatoInformacija());
        doc.addField("kalba", knyga.getKalba());
        doc.addField("autoriai", knyga.getAutoriai());

        try {
            solrClient.add("books", doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
