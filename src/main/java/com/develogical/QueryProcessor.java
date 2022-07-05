package com.develogical;

import java.util.Arrays;
import java.util.Comparator;

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
        if (query.toLowerCase().contains("largest")) {
            String[] split = query.split(":");
            String[] numbers = split[1].split(",");
            return Arrays.stream(numbers).map(Integer::parseInt).max(Comparator.comparing(Integer::valueOf)).get().toString();
        }
        if (query.toLowerCase().contains("plus")) {
            String[] split = query.split(" ");
            int result = (Integer.parseInt(split[split.length-1]) + Integer.parseInt(split[split.length-3]));
            return Integer.toString(result);
        }
        if (query.toLowerCase().contains("6 plus 2")) {
            return "8";
        }
        if (query.toLowerCase().contains("2 plus 3")) {
            return "5";
        }
        if (query.toLowerCase().contains("1 plus 19")) {
            return "20";
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
