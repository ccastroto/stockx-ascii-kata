package edu.asestatuas.stockx.item;

public class Sneaker implements Item {

    private String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String id, String sneaker) {
        this.name = sneaker;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getSale(){
        return this.sale;
    }

    @Override
    public int getAsk(){
        return this.ask;
    }

    @Override
    public int getBid(){
        return this.bid;
    }

    public String toString() {
        return this.name;
    }
}
