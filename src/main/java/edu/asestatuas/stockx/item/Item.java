package edu.asestatuas.stockx.item;

import java.util.List;

public interface Item {

    int getSale();
    int getBid();
    int getAsk();

    void add(Offer offer);
    List<Offer> offers();

    void setBid(int bid);
    void setAsk(int ask);
}
