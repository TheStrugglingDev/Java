package com.strugglingdev;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));

        listProducts();
    }

    public static void listProducts() {
        for (var product : storeProducts) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }

}
