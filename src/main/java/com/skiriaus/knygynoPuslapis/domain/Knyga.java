package com.skiriaus.knygynoPuslapis.domain;

public interface Knyga {
    Long getId();
    String getPavadinimas();
    String getVirselioAdresas();
    String getAprasymas();
    String getZanrai();
    Integer getMetai();
    String getLeidejas();
    Integer getPuslapiuSkaicius();
    String getFormatoInformacija();
    String getKalba();
    String getAutoriai();
    Double getKaina();
}
