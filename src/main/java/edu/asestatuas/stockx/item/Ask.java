package edu.asestatuas.stockx.item;

public class Ask {

    private  String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }
    public String size(){
        return this.size;
    }
    public Integer ask(){
        return this.ask;
    }

    public String toString(){
        return this.size + " " + this.ask;
    }
}
