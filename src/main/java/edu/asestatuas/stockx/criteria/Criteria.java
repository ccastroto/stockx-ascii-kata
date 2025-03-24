package edu.asestatuas.stockx.criteria;

import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;

import java.util.ArrayList;
import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
