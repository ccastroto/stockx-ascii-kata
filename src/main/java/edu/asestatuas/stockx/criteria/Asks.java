package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Ask;
import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(a -> a instanceof Ask)
                .collect(Collectors.toList());
    }
}
