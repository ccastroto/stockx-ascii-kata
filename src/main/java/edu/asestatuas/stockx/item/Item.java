package edu.asestatuas.stockx.item;

public interface Item {

    int getSale();
    int getBid();
    int getAsk();

    void add(Bid Offer);
    void add(Ask Offer);
}
