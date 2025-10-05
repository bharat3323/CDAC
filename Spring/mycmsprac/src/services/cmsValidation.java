package services;

import java.time.LocalDate;

import com.myscms.core.Customer;
import com.myscms.core.ServicePlan;

public class cmsValidation {

	public static Customer validateAllInputs(String firstName,String lastName,String email,String password,int regAmount,String dob,String plan) {
		return new Customer(firstName,lastName,email,password,regAmount,LocalDate.parse(dob),ServicePlan.valueOf(plan.toUpperCase()));
		
	}
}
