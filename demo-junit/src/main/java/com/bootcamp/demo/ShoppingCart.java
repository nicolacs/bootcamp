package com.bootcamp.demo;

import java.util.List;

// Person has name, age
// ShoppingCart has tools to achieve its method objective
public class ShoppingCart {

  public CartRepository cartRepository; // an agent to get data

  public ShoppingCart() {
    this.cartRepository = new CartRepository();
  }

  // Dependency injection (DI)
  public ShoppingCart(CartRepository cartRepository) {
    if (cartRepository == null)
      throw new IllegalArgumentException("cartRepository should not be null.");
    this.cartRepository = cartRepository;
  }

  public List<Item> getCartItems(int customerId) {
    return this.cartRepository.getItemsFromDB(customerId);
  }

  
  public int getCartItemsTotalPrice(int customerId) {
    return this.cartRepository.getItemsFromDB(customerId).stream() //
        .mapToInt(item -> item.getPrice()) //
        .sum();
  }
}