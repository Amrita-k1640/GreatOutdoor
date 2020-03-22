package com.capgemini.lpu.GreatOutdoor.ui;
import java.util.Scanner;
import com.capgemini.lpu.GreatOutdoor.dto.Address;
import com.capgemini.lpu.GreatOutdoor.exceptions.InputMisMatchException;
import com.capgemini.lpu.GreatOutdoor.service.AddressServiceImpl;
import com.capgemini.lpu.GreatOutdoor.util.AddressRepository;
public class UserInterface {

		public static void main(String[] args) {
			new AddressRepository();
			
			
			AddressServiceImpl addressService=new AddressServiceImpl();
			
			
			System.out.println("choose Option Which You Want:"+"\n"+"1* View The Address : "+"\n"+"2* Add a Address :"+"\n"+"3* For Update Address :"+"\n"+"4* Delete a Address :"
					);
			int choose ;
			Scanner scan = new Scanner(System.in);
			choose = scan.nextInt();
		  switch(choose)
			{
			case 1:
			 System.out.println("enter addressId");
			 String addressId;
				Scanner viewScan = new Scanner(System.in);
				addressId = viewScan.next();
				try {
					Address result=addressService.viewAllAddress(addressId);
					System.out.println("Address for given address ID : ");
					System.out.println(result.getAddressId()+" "+result.getBuildingNo()+" "+result.getCity()+" "+result.getState());
				}
				catch(InputMisMatchException e) {
					System.out.println(e.getMessage());
				}
				
		//System.out.println(obj.viewAllAddress(addressId));
				break;
			case 2:
				String addressId1;
				Scanner AddressScan = new Scanner(System.in);
				System.out.println("Enter  address id");
				addressId1 =  AddressScan.next();
				System.out.println("Enter  retailer id");
				String retailer = AddressScan.next();
				System.out.println("Enter your building No");
				String building =  AddressScan.next();
				System.out.println("Enter your city");
				String city =  AddressScan.next();
				System.out.println("Enter your state");
				String state =  AddressScan.next();
				System.out.println("Enter your feild");
				String feild =  AddressScan.next();
				System.out.println("Enter zip code");
				String zip =  AddressScan.next();
				Address address1 = new Address();
				address1.setAddressId(addressId1);
				address1.setBuildingNo(building);
				address1.setCity(city);
				address1.setFeild(feild);
				address1.setRetailerId(retailer);
				address1.setState(state);
				address1.setZip(zip);
				try
				{
					boolean addAddress = addressService.addAddress(address1);
					if(addAddress)
						{
							System.out.println("Address Added Successfully");
						}
				}
				catch(InputMisMatchException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter an addressId to update");
				Scanner updateScan = new Scanner(System.in);
				String choice;
				choice = updateScan.next();
				String updateaddressId;
				System.out.println("enter  update address id");
				updateaddressId =  updateScan.next();
				System.out.println("enter update retailer id");
				String updateretailer = updateScan.next();
				System.out.println("enter your update building No");
				String updatebuilding =  updateScan.next();
				System.out.println("enter  update city");
				String updatecity =  updateScan.next();
				System.out.println("enter your state");
				String updatestate =  updateScan.next();
				System.out.println("enter update feild");
				String updatefeild =  updateScan.next();
				System.out.println("enter update code");
				String updatezip =  updateScan.next();
				Address address = new Address();
				address.setAddressId(updateaddressId);
				address.setBuildingNo(updatebuilding);
				address.setCity(updatecity);
				address.setFeild(updatefeild);
				address.setRetailerId(updateretailer);
				address.setState(updatestate);
				address.setZip(updatezip);
				try {
					boolean result = addressService.updateAddress(address,choice);
					if(result)
					{
						System.out.println("data  updated successfully");
					}
				} catch (InputMisMatchException e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}
				break;
			case 4:
				System.out.println("enter an address id to delete");
				Scanner deleteScan = new Scanner(System.in);
				String delete = deleteScan.next();
				try {
					boolean deleteAddress = addressService.deleteAddress(delete);
					if(deleteAddress)
					{
						System.out.println("Address Deleted Successfully");
					}
				} catch (InputMisMatchException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				break;
		
			default: 
				System.out.println("choose correct Number");
			}
			
		}
}


	


