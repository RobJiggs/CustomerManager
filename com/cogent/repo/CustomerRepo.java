/**
 * 
 */
package com.cogent.repo;

import java.util.Arrays;

import com.cogent.bean.CustomerBean;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 26, 2022
 */
public class CustomerRepo {
	CustomerBean[] custarray = new CustomerBean[6];

	public void addCustomer(CustomerBean customerBean) {
	
		for (int i = 0; i < custarray.length; i++) {
			if (custarray[i] == null) {
				custarray[i] = customerBean;
				
				
			}
			System.out.println(custarray[0].display());
		}
		
		
		
		
		System.out.println(custarray[2].display());

	}
	
	

	public CustomerBean[] viewAllCustomer() {
		System.out.print("CustomerID ");
		System.out.println(" CustomerName");
		
		for (int i = 0; i < custarray.length; i++) {
			if(custarray[i]!= null) {
				System.out.println(" "+ custarray[i].getCustomerId()+ custarray[i].getCustomerName());
				
			}
			
			}
		System.out.println(custarray[0]+""+custarray[1]+""+custarray[2]+""+custarray[3]);
		return custarray;
		}

		

	

	public CustomerBean searchCustomerById(long id) {
		for (int i = 0; i < custarray.length; i++) {
			if (custarray[i] != null) {
				if (custarray[i].getCustomerId() == id) {
					return custarray[i];

				}

			}

		}
		return custarray[0];

	}

}
