package edu.asestatuas.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String name;
    private int sale;
    private int ask;
    private int bid;
    private String style;

    public Sneaker(String id, String sneaker) {
        this.name = sneaker;
        this.style=id;
    }

    public String getName() {
        return this.name;
    }

    public String getStyle() {
        return this.style;
    }

    @Override
    public int getSale(){
        return this.sale;
    }
    void setSale(){
        this.sale= sale + 1;
    }
    @Override
    public int getAsk(){
        return this.ask;
    }
    void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getBid(){
        return this.bid;
    }
    void setBid(int bid){
        this.bid = bid;
    }
    @Override
    public void add(Bid Offer){

    }
    @Override
    public void add(Ask Offer){}


    private List<Offer> offers = new ArrayList<Offer>();

    public String toString() {
        return this.name
                +'\n'+'\t'+'\t'+this.style;
    }
}
