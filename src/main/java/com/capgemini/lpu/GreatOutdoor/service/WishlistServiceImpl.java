package com.capgemini.lpu.GreatOutdoor.service;
import java.util.HashMap;
import com.capgemini.lpu.GreatOutdoors.dao.WishlistDaoImpl;
import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;
import com.capgemini.lpu.GreatOutdoor.exceptions.WishListException;
import com.capgemini.lpu.GreatOutdoor.util.ProductRepository;
public class WishlistServiceImpl implements WishlistService{
	//static  HashMap<String, ProductDTO> wlist1=new HashMap<String , ProductDTO>(); 
	WishlistDaoImpl WishlistDaoImplObj=new WishlistDaoImpl();
	
/*******************This Method will Add the Product to Wishlist *********************/
	
	public boolean addProductToWishlist(String productId) throws WishListException {
		// TODO Auto-generated method stub
		boolean result=false;
		if(ProductRepository.productList.get(productId) != null)
		{   if(WishlistDaoImpl.wlist.containsKey(productId))
	          	{	
			        throw new WishListException("WishList already contain this PRODUCT");
	        	}
		   else {
			 result=WishlistDaoImplObj.addProductToWishlist(productId);
		    return result;
		      }
			
		}
		else
		{
			throw new WishListException("Product ID not Found in Product List to Add in WishList\n");
		}
	   
		
	}

/*************************** This Method  will remove the Particular Product from wishlist  ***************************/	
	
	 public boolean  removeProductFromWishlist(String productId) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(WishlistDaoImpl.wlist.get(productId) != null)
		{
		
			result=WishlistDaoImplObj.removeProductFromWishlist(productId);
			return result;
		}
		else
		{   
			int x=3;
			int y=0;
			int z=x/y;
			return false;
		
			//throw new WishListException("Product ID not found in Wishlist to REMOVE");
		}
	
}

/**************************** This Method will Return all  the Product of wishlist ****************************/	
	public HashMap<String, ProductDTO> displayProductInWishlist()  {
		// TODO Auto-generated method stub
		
		return WishlistDaoImpl.wlist ;
	}

	
}


