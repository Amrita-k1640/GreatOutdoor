package com.capgemini.lpu.GreatOutdoor.service;
import java.util.List;
import com.capgemini.lpu.GreatOutdoors.dao.AddressDaoImpl;
import com.capgemini.lpu.GreatOutdoor.dto.Address;
import com.capgemini.lpu.GreatOutdoor.exceptions.InputMisMatchException;

public class AddressServiceImpl {
	
	AddressDaoImpl addressDao=new AddressDaoImpl();
	/* This method will used for View All the Address */
		public Address viewAllAddress(String addressId) throws InputMisMatchException
		{
			if(addressId.isEmpty()) {
				throw new InputMisMatchException("Address ID should not be null");
			}
			
			Address result=addressDao.viewAllAddress(addressId);
			
			if(result==null) {
				throw new InputMisMatchException("Address for gven Address ID is not found");
			}
			else 
				return result;
		
		}
		/************** This Method will use for  Add the Address ************/
	public boolean addAddress(Address obj) throws InputMisMatchException
	{
		boolean result=false;
		if(!obj.getAddressId().isEmpty()) {
			if(!obj.getBuildingNo().isEmpty()) {
				result = addressDao.addAddress(obj);
				if(!result)
				{
					throw new InputMisMatchException("Address not added ");
					
				}
				else
					return result;
			}
			throw new InputMisMatchException("Building number should not be empty");
		}
		else {
			throw new InputMisMatchException("Address ID should not be empty");
		}
		
	}
	/**************  This method will be use for  Update Address ********/
	public boolean updateAddress(Address obj,String address) throws InputMisMatchException
	{
		boolean result=false;
		if(!address.isEmpty()) {
			if(!obj.getAddressId().isEmpty()) {
				result = addressDao.updateAddress(obj, address);
				if(!result)
				{
					throw new InputMisMatchException("Address not updated ");
					
				}
				else
					return result;
			}
			throw new InputMisMatchException("Address number should not be empty");
		}
		else {
			throw new InputMisMatchException("Address  should not be empty");
		}
		
	}
	/*****************  This method will be use for Delete Address *********************/
	public boolean deleteAddress(String address) throws InputMisMatchException
	{
		boolean result;
		if(address.isEmpty())
		{
			throw new InputMisMatchException("Address ID should not be null");
			
		}
		else
		{
			 result = addressDao.deleteAddress(address);
			 if(result == false)
			 {
				 throw new InputMisMatchException("Address not found on data" );
			 }
		}
		return result;
	}
}
