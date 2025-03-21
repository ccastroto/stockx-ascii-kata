package edu.asestatuas.stockx.item;

public class Bid {

    private  String size;
    private Integer bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.bid;
    }

    public String toString() {
        return this.size +'\t'+'\t' + this.bid;
    }

}
