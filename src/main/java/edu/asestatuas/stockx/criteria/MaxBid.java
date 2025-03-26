package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Bid;
import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;

import java.util.List;
import java.util.Optional;
import java.util.List;

public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers()
                                    .stream()
                                    .filter(o -> o instanceof Bid)
                                    .max(Offer::compareTo);
        return max.isPresent()? List.of(max.get()) : List.of();
    }
}
