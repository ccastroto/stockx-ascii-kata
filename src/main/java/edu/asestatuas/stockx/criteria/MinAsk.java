package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Ask;
import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk  implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> min = sneaker.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .min(Offer::compareTo);
        return min.isPresent()? List.of(min.get()) : List.of();
    }
}
