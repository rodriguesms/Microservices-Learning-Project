package com.treinamento.store.Controllers.DTO;

import java.util.List;

public class ShopListDTO {

  private List<ShopItemDTO> items;
  private AddressDTO address;

  public List<ShopItemDTO> getItems() {
    return this.items;
  }

  public void setItems(List<ShopItemDTO> items) {
    this.items = items;
  }

  public AddressDTO getAddress() {
    return this.address;
  }

  public void setAddress(AddressDTO address) {
    this.address = address;
  }
  
}
