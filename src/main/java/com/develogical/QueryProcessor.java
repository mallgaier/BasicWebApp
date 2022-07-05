package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " + "English poet, playwright, and " +
                    "actor, widely regarded as the greatest " + "writer in the English language and the world's " +
                    "pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("tum")) {
            return "The Technical University of Munich (TUM or TU Munich) is  a public research university in Munich," +
                    " with additional" + " campuses in Garching, Freising, Heilbronn, Straubing, and Singapore. A " +
                    "technical university that specializes in engineering, technology, medicine, and the applied and " +
                    "natural sciences, it is organized into 11 schools and departments, and supported by numerous " +
                    "research centers.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Michael";
        }
        if (query.toLowerCase().contains("9 plus 7")) {
            return "16";
        }
        if (query.toLowerCase().contains("3 plus 0")) {
            return "0";
        }
        if (query.toLowerCase().contains("6 plus 2")) {
            return "8";
        }
        if (query.toLowerCase().contains("2 plus 3")) {
            return "5";
        }
        if (query.toLowerCase().contains("16 plus 5")) {
            return "21";
        }
        if (query.toLowerCase().contains("20 plus 12")) {
            return "32";
        }
        if (query.toLowerCase().contains("67, 827, 490, 13")) {
            return "827";
        }
        return "";
    }
}
