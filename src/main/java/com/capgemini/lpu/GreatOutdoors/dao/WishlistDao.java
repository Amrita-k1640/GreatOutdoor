package com.capgemini.lpu.GreatOutdoors.dao;
import java.util.HashMap;

import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;

public interface WishlistDao {
	public boolean addProductToWishlist(String productId);
	public boolean removeProductFromWishlist (String productId);
	public HashMap<String, ProductDTO> displayProductInWishlist();
	
}
