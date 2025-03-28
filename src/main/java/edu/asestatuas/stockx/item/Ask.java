package edu.asestatuas.stockx.item;

public class Ask implements Offer{

    private  String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    public int value() {
        return this.ask;
    }

    public String size(){
        return this.size;
    }
    public Integer ask(){
        return this.ask;
    }

    @Override
    public int compareTo(Offer ask){
        return this.ask.compareTo(ask.value());
    }

    public String toString(){
        return "\t\t" + this.size + '\t' + '\t' + this.ask + '\n';
    }
}
