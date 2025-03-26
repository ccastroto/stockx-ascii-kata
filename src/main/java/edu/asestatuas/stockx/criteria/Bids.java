package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;
import edu.asestatuas.stockx.item.Bid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    /*public List<Offer> checkCriteria(Item item) {
        List<Offer> list = item.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .collect(Collectors.toList());
    return list;
    }*/

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .collect(Collectors.toList());
    }
}
