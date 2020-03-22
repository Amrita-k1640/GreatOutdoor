package com.capgemini.lpu.GreatOutdoors.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import com.capgemini.lpu.GreatOutdoors.dao.AddressDaoImpl;
import com.capgemini.lpu.GreatOutdoor.dto.Address;


public class AddressDaoImplTestCases { 

	AddressDaoImpl impl = new AddressDaoImpl();
	@Test
	public void viewAddressTest1()
	{
		
		  Address expected = null;
		  Address actual = impl.viewAllAddress("100001");
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(expected, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	@Test
	public void viewAddressTest2()
	{
		
		  Address expected = new Address ("101","201","6-32","karimnagar","telanagana","Baby Product","144411");
		  Address actual = impl.viewAllAddress("101");
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(expected, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	@Test
	public void addAddressTest()
	{
		
		  Address expected = new Address ("108","208","8-23","Ajmer","Rajasthan","Ethnic Dress","501508");
		  boolean actual = impl.addAddress(expected);
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(true, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	@Test
	public void updateAddressTest()
	{
		
		  Address expected = new Address ("108","208","8-23","ludhiana","punjab","training","501508");
		  boolean actual = impl.updateAddress(expected,"101");
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(true, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	
	
		   
		   //assertEquals(expected1, actual1);
		// assertEquals(expected, actual);
		 //assertTrue(actual.equals(expected));
		
}
	




