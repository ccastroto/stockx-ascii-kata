package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;
import edu.asestatuas.stockx.item.Bid;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
