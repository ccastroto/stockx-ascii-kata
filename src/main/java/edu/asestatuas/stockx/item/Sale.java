package edu.asestatuas.stockx.item;

public class Sale implements Offer{

    private String size;
    private Integer price;

    public Sale (String size, int price) {
        this.size = size;
        this.price = price;
    }
    public String size(){
        return size;
    }
    public int value(){
        return price;
    }

    @Override
    public int compareTo(Offer sale){
        return this.price.compareTo(sale.value());
    }

    public String toString() {
        return "\t\t" + this.size + '\t' + '\t' + this.price + '\n';
    }

}
