package edu.asestatuas.stockx.item;

public class Bid implements Offer{

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

    @Override
    public int compareTo(Offer bid){
        return this.bid.compareTo(bid.value());
    }

    public String toString() {
        return "\t\t" + this.size + '\t' + '\t' + this.bid + '\n';
    }

}
