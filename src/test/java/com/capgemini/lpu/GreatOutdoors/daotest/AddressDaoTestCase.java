package com.capgemini.lpu.GreatOutdoors.daotest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.lpu.GreatOutdoors.dao.AddressDaoImpl;
import com.capgemini.lpu.GreatOutdoor.dto.Address;

public class AddressDaoTestCase {
	AddressDaoImpl impl = new AddressDaoImpl();
	@Test
	public void deleteAddressTest()
	{
		
		  boolean actual = impl.deleteAddress("101");
		   
		   //assertEquals(expected1, actual1);
		 assertEquals(true, actual);
		 //assertTrue(actual.equals(expected));
		
	}
	

}

