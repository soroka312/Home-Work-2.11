package pro.sky.homework2._1;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service

public class OnlineStoreServiceIml {
    private final Basket basket;

    public OnlineStoreServiceIml(Basket basket) {
        this.basket = basket;
    }

    public void add(Set<Long> products) {
        basket.add(products);
    }

    public Set<Long> getProducts() {
        return basket.getProducts();
    }

}
