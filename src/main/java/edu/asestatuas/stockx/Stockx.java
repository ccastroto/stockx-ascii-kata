package edu.asestatuas.stockx;

import edu.asestatuas.stockx.item.*;
import edu.asestatuas.stockx.criteria.*;
import java.util.List;


public class Stockx {

    public static void main(String[] args) {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));

        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

        Criteria bids = new Bids();
        System.out.println("\n\t\t All BIDS");
        bids.checkCriteria(sneaker).forEach(System.out::print);

        Criteria asks = new Asks();
        System.out.println("\n\t\t All ASKS");
        asks.checkCriteria(sneaker).forEach(System.out::print);

        Criteria maxBid = new MaxBid();
        List<Offer> maximum = maxBid.checkCriteria(sneaker);
        sneaker.setBid(maximum.isEmpty()? 0 : maximum.get(0).value());
        System.out.println(Stockx.draw(sneaker));
    }

    public static String draw(Item sneaker) {
        return
                "\n\n\t\t" + sneaker.getAsk() + " Buy\t"
                        + sneaker.getBid() + " Sell \n" +

                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                        "\t" + sneaker.toString() + "\n" +
                        "\t\tlast sale: " + sneaker.getSale();
    }
}