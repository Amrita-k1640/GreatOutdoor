package com.capgemini.lpu.GreatOutdoors.daotest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.lpu.GreatOutdoors.dao.WishlistDaoImpl;

public class WishlistDaoImplTest {
	WishlistDaoImpl obj=new WishlistDaoImpl();
 @Test
 public void addProductToWishlist()
 {
   assertEquals(true, obj.addProductToWishlist("P102") );
 }
 @Test
 public void removeProductFromWishlist()
 {
	 assertEquals(true, obj.removeProductFromWishlist("P103") );
 }
 
	
}
