package pro.sky.homework2._1;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Long> products = new HashSet<>();

    public void add(Set<Long> products) {
        this.products.addAll(products);
    }

    public Set<Long> getProducts() {
        return Collections.unmodifiableSet(products);
    }
}
