package edu.asestatuas.stockx.item;

public class Sale {

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

    public int compareTo(Offer price){
        return this.price.compareTo(price.value());
    }

    @Override
    public String toString() {
        return  this.size  +'\t'+'\t' + this.price + '\n' +'\t'+'\t';
    }

}
