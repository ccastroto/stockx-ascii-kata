package edu.asestatuas.stockx.criteria;


import edu.asestatuas.stockx.item.Item;
import edu.asestatuas.stockx.item.Offer;


import java.util.List;


public class LastSale implements Criteria{
    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria sales = new Sales();
        List<Offer> salelist = sales.checkCriteria(sneaker);

        return salelist.isEmpty()?
                List.of()
                : List.of(salelist.get(salelist.size()-1));
    }
}
