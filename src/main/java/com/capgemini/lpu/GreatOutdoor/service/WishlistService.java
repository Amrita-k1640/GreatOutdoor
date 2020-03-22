package com.capgemini.lpu.GreatOutdoor.service;
import java.util.HashMap;

import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;
import com.capgemini.lpu.GreatOutdoor.exceptions.WishListException;
public interface WishlistService {
	public boolean addProductToWishlist(String productId) throws WishListException;
	public boolean removeProductFromWishlist (String productId) throws WishListException;
	public HashMap<String, ProductDTO> displayProductInWishlist() ;

}

