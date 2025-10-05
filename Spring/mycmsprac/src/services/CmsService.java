package services;

import com.myscms.core.Customer;
import com.myscms.custom_expections.CmshandlingException;

public interface CmsService {
	
	String registerCustomer(String firstName,String lastname,String email,String password,int regAmount,String dob,String plan);

	void displayCustomerDetails();

	Customer signIn(String mail, String password) throws CmshandlingException;

	String resetPass(String mail,String oldpass,String newpass)throws CmshandlingException ;

	String unsuscribe(String r) throws CmshandlingException;

	void searchByplanAndDate(String plan, String date)throws CmshandlingException;

	void sortByEmail();
}
