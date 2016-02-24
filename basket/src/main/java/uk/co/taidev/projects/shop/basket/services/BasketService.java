package uk.co.taidev.projects.shop.basket.services;

import uk.co.taidev.projects.shop.basket.model.Basket;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BasketService {

    private Map<String, Basket> fakeBasketRepo = new HashMap<>();

    public Basket getBasket(String basketId) {
        return fakeBasketRepo.get(basketId);
    }

    public Basket saveBasket(Basket basket) {
        fakeBasketRepo.put(basket.getId(), basket);
        return basket;
    }

}
