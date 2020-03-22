package com.capgemini.lpu.GreatOutdoor.service;
import java.util.List;

import com.capgemini.lpu.GreatOutdoor.dto.Address;

public interface AddressService {
	List<Address> viewAllAddress(String addressid);
	boolean updateAddress(Address addressDTO);
	boolean deleteAddress(Address adressDTO);
	boolean addAddress( Address addressDTO);
		
}

