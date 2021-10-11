package com.treinamento.Services;

import com.treinamento.store.Controllers.DTO.ShopListDTO;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.treinamento.store.Controllers.DTO.ProviderInfoDTO;

@Service
public class ShoppingService {

  public void purchase(ShopListDTO shopList) {

    RestTemplate client = new RestTemplate();
    ResponseEntity<ProviderInfoDTO> exchange = client.exchange("http://localhost:8081/info/"+shopList.getAddress().getState(), 
      HttpMethod.GET, null, ProviderInfoDTO.class);
    System.out.println(exchange.getBody().getAddress());
  }
  
}
