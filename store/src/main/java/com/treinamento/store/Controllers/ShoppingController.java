package com.treinamento.store.Controllers;

import com.treinamento.Services.ShoppingService;
import com.treinamento.store.Controllers.DTO.ShopListDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
  
  private ShoppingService shoppingService;

  @PostMapping
  public void purchase(@RequestBody ShopListDTO shopList){
    shoppingService.purchase(shopList);
  }
}
