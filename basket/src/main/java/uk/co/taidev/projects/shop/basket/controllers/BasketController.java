package uk.co.taidev.projects.shop.basket.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.taidev.projects.shop.basket.model.Basket;
import uk.co.taidev.projects.shop.basket.services.BasketService;

import javax.websocket.server.PathParam;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @ApiOperation(value = "getBasket", nickname = "getBasket")
    @RequestMapping(path = "/baskets/{basketId}", produces = "application/json")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Success", response = Basket.class),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public Basket getBasket(@PathParam("basketId") String basketId) {
        //todo return view
        return basketService.getBasket(basketId);
    }
}