package edu.asestatuas.stockx;

import edu.asestatuas.stockx.item.*;

/**
 * Hello world!
 *
 */
public class Stockx {

    public static void main(String[] args) {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));

    }

    public static String draw(Item sneaker) {
        return sneaker.toString();
    }
}