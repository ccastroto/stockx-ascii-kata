package edu.asestatuas.stockx.item;

import edu.asestatuas.stockx.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String name;
    private int sale;
    private int ask;
    private int bid;
    private String style;
    private List<Offer> offers = new ArrayList<Offer>();

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
    public void setSale(){
        this.sale= sale;
    }
    @Override
    public int getAsk(){
        return this.ask;
    }
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getBid(){
        return this.bid;

    }
    public void setBid(int bid){
        this.bid = bid;
    }

    public void add(Offer offer){
        this.offers.add(offer);
    }



    public List<Offer> offers() {
        return this.offers;
    }

    public String toString() {
        return this.name
                +'\n'+'\t'+'\t'+this.style;
    }
}
