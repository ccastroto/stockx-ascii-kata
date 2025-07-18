package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Ask;
import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(a -> a instanceof Ask)
                .sorted()
                .collect(Collectors.toList());
    }
}
