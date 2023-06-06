package com.hnbcoffee.Sevice;

import java.util.Collection;

import com.hnbcoffee.DTO.CartItem;


public interface ShoppingCartService {

	CartItem add(CartItem itemCart);

	void remove(Integer id);

	CartItem update(Integer id, int qty);

	void clear();

	Collection<CartItem> getItems();

	int getCount();

	double getAmount();
}