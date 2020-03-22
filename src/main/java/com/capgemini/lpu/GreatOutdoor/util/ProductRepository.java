package com.capgemini.lpu.GreatOutdoor.util;
import java.util.HashMap;

import com.capgemini.lpu.GreatOutdoor.dto.ProductDTO;


public class ProductRepository {
static public  HashMap<String, ProductDTO> productList=new HashMap<String , ProductDTO>(); 
/************* Function To Create Repository for Product *************/
static public void createProductList()
{
	productList.put("P101", new ProductDTO(11,10,"P101","GOLF STICK","Red","dimension1","spec1","Sport",9999));
	productList.put("P102", new ProductDTO(22,7,"P102","CAMPING TENT","black","dimension2","spec2","Camping",3499));
	productList.put("P103", new ProductDTO(22,20,"P103","TENT HOOKS","white","dimension1","spec3","Camping",745));
	productList.put("P104", new ProductDTO(11,51,"P104","GOLF TEE","black","dimension3","spec1","Golf Equipment",300));
	productList.put("P105", new ProductDTO(11,18,"P105","GOLF BALL","white","dimension1","spec2","xyz",500));
	productList.put("P106", new ProductDTO(33,44,"P106","TRIMMER","black","dimension1","spec2","xyz",999));
	productList.put("P107", new ProductDTO(33,73,"P107","KNEE CAP","blue","dimension1","spec2","xyz",399));
	productList.put("P108", new ProductDTO(33,29,"P108","SUNGLASSES","golden","dimension1","spec2","xyz",5999));
	productList.put("P109", new ProductDTO(44,9,"P109","FIRST AID KIT","as per availability","dimension1","spec2","xyz",999));
}

/************** Function to get the list Of Product **************/
public static HashMap<String, ProductDTO> getProductList() {
	return productList;
}

/************** Function to set the list Of Product **************/
public static void setProductList(HashMap<String, ProductDTO> productList) {
	ProductRepository.productList = productList;
}
}







	
	


