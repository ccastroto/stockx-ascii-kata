package edu.asestatuas.stockx.item;

public interface Offer extends Comparable<Offer> {

    String size();
    int value();

    @Override
    int compareTo(Offer o);


}
