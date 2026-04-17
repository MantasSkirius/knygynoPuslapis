package com.skiriaus.knygynoPuslapis.dao;

public class DaoUtils {
    public static final int MAX_REZULTATU_SKAICIUS = 25;
    public static String kurtiPlaceholderKlaustukus(int skaicius){
        if(skaicius == 0) return "";
        String klaustukai = "?";
        for (int i = 1; i < skaicius; i++) {
            klaustukai += ",?";
        }
        return klaustukai;
    }
}
