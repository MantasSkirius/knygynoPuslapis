package com.skiriaus.knygynoPuslapis.dao;

public class DaoUtils {
    public static String kurtiPlaceholderKlaustukus(int skaicius){
        if(skaicius == 0) return "";
        String klaustukai = "?";
        for (int i = 1; i < skaicius; i++) {
            klaustukai += ",?";
        }
        return klaustukai;
    }
}
