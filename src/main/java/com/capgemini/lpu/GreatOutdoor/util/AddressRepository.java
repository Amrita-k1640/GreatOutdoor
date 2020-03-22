package com.capgemini.lpu.GreatOutdoor.util;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.lpu.GreatOutdoor.dto.Address;


public class AddressRepository {
	
	public static List<Address>list = new ArrayList<Address>();
	static
	{
		Address addressDTO6 = new Address("101","301","6-32","Darbhanga","Bihar","Sport","847104");
		Address addressDTO1 = new Address("102","302","5-34","Gazipur","Lucknow","Personal Accesories","144411");
		Address addressDTO2 = new Address("103","303","6-33","karimnagar","telanagana","Camping","144411");
		Address addressDTO3 = new Address("104","304","36-7","nenlloi","AndhraPradesh","Mountaineering Equipments","524004");
		Address addressDTO4 = new Address("105","405","3-32","Vishakapatnam","AndhraPradesh","Sport","524021");
		Address addressDTO5 = new Address("106","606","7-48","Coiambattur","TamilNadu","Golf","501508");
		Address addressDTO7=  new Address("107","709","3-69","Dharmsala","Himachal Pradesh","Outdoor Protection","127846");
		Address addressDTO8=  new Address("108","759","1-79","Haldwani","uttraKhand","Personal Accesories","767846");
		Address addressDTO9=  new Address("109","859","9-79","Ajmer","Rajasthan","Campming ","127846");
		
		
		
		list.add(addressDTO6);
		list.add(addressDTO1);
		list.add(addressDTO2);
		list.add(addressDTO3);
		list.add(addressDTO4);
		list.add(addressDTO7);
		list.add(addressDTO8);
		list.add(addressDTO5);
		list.add(addressDTO9);
	
	
	}
	public static List<Address> getList() {
		return list;
	}
	
		
		
}
	
