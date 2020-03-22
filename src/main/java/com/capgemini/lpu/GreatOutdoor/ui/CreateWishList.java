package com.capgemini.lpu.GreatOutdoor.ui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;
import com.capgemini.lpu.GreatOutdoor.exceptions.WishListException;
import com.capgemini.lpu.GreatOutdoor.service.WishlistServiceImpl;
import com.capgemini.lpu.GreatOutdoor.util.ProductRepository;

public class CreateWishList {
	 static WishlistServiceImpl obj1=new  WishlistServiceImpl();
	 static Scanner sc=new Scanner(System.in);
	public static void main(String arg[]) throws WishListException
	{
	     ProductRepository obj=new ProductRepository();
	    {
		obj.createProductList();
	     }
	      HashMap<String , ProductDTO> wishlist=obj.getProductList();
	
		
	
	
	for(Entry<String, ProductDTO> me:wishlist.entrySet())
	{
		System.out.println("Product ID: "+me.getKey()+" ,Product Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
	    System.out.println();
	}
	 
     wishlistOperation();
  
}
	
	static public void wishlistOperation() throws WishListException
	{ 
		boolean decision=true;
	   while(decision)
	   {

		System.out.println("Press 1 to Insert Product in WishList :");
		System.out.println("Press 2 to Remove from Wishlist :");
		System.out.println("Press 3 to View Wishlist :");
		int choice;
		
		choice=sc.nextInt();
	    
	   
		switch(choice)
		{
		case 1:  createWishlist();
		         break;  
		case 2:  removeFromWishlist();
		         break;
		case 3: display();
		        break;
		default: System.out.println("WRONG CHOICE");
		}
		System.out.println("\n You Want to Add more Operation/Product on Wishlist(True/False)");
		 decision=sc.nextBoolean();
	   }
	   
		
	}
	static public void removeFromWishlist() throws WishListException
	{
		boolean decision=true;
		   while(decision)
		   {  try {
		      System.out.println("Enter Pid to remove :");
		      Scanner input=new Scanner (System.in);
		      String removePid=input.nextLine();
		   boolean result=   obj1.removeProductFromWishlist(removePid);
		     if(result)
		     {
		    	 System.out.println("REMOVED SUCCESSFULLY");
		     }
		     
		   }
		   finally {
		   }
		   }
		/*   catch(WishListException e)
		   {
			   System.out.println(e);
		   }*/
	       	  System.out.println("\nWant to remove from wishlist(true/false)");
		      decision=sc.nextBoolean();
		 }
		
	
	
	
	
	
	
	static public void createWishlist()
	{
	
		 System.out.println("CREATE WISHLIST :");
		 boolean decision=true;
		
		 while(decision)
		 {
			
			  try {
				  System.out.println("Enter ProductID to insert in Wishlist");
				  sc.nextLine();
			  String pid= sc.nextLine();
			  boolean result=obj1.addProductToWishlist(pid);
			  if(result)
			  {
				  System.out.println("Added Successfully");
			  }
			  }
			  catch(WishListException e)
			  {
				System.out.print(e);
			  } 
			  System.out.println(" You Want to Enter more Product in Wishlist(true/false)");
			 
			  decision=sc.nextBoolean();
			  
		 }
		  
		 
	}
	static public void display()
	{
		System.out.println("YOUR WISHLIST ARE READY PlEASE PROCEED FOR PAYMENT GATEWAY :\n");
		obj1.displayProductInWishlist();
	}
}

