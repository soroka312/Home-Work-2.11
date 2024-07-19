package pro.sky.homework2._1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class OnlineStoreController {
    private final OnlineStoreServiceIml onlineStoreServiceIml;

    public OnlineStoreController(OnlineStoreServiceIml onlineStoreServiceIml) {
        this.onlineStoreServiceIml = onlineStoreServiceIml;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam Set<Long> products) {
        onlineStoreServiceIml.add(products);
    }

    @GetMapping(path = "/get")
    public Set<Long> get() {
        return onlineStoreServiceIml.getProducts();
    }
}
