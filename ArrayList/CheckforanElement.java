package AGGSINGMENT6;

import java.util.*;

public class CheckforanElement {

    public static void main(String[] args) {
        ArrayList<String> alovu = new ArrayList<>();
        alovu.add("HO CHI MINH");
        alovu.add("LONDON");
        alovu.add("MACAO");
        alovu.add("SHENGHAI");
        alovu.add("DAKLAK");
        if (alovu.contains("LONDON")) {
            System.out.println("Cac thanh pho" + alovu);
        } else {
            System.out.println("no contains LONDON" + alovu);
        }
    }
}
