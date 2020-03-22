package com.capgemini.lpu.GreatOutdoors.servicetest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
//import org.junit.gen5.api.Assertions;

import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;
import com.capgemini.lpu.GreatOutdoor.exceptions.WishListException;
import com.capgemini.lpu.GreatOutdoor.service.WishlistServiceImpl;
import com.capgemini.lpu.GreatOutdoor.util.ProductRepository;
import com.capgemini.lpu.GreatOutdoors.dao.WishlistDao;

public class WishlistServiceImplTest {
	
	 WishlistServiceImpl obj=new WishlistServiceImpl();
	@Test()
	 public void addProductToWishlist() 
	 {
		assertThrows(WishListException.class, ()->obj.addProductToWishlist("P110"));
	
	  
	 }
	 @Test()
	 public void removeProductFromWishlist()  
	 {assertThrows(WishListException.class, ()-> obj.removeProductFromWishlist("P104"));
	  
		
	}
	 @Test()
	 public void displayProductInWishlist()  throws WishListException
	 {  HashMap<String, ProductDTO> list1=new HashMap<String, ProductDTO>();
		 Assert.assertEquals( list1,obj.displayProductInWishlist());
		// assertThrows(WishListException.class, ()-> obj.displayProductInWishlist());
	 }
	 
}
	
	

