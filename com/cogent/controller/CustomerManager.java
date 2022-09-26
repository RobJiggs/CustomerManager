/**
 * 
 */
package com.cogent.controller;

import java.util.Scanner;
import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;
/**
 * @author Robert Joasilus
 *
 * @date: Sep 26, 2022
 */
public class CustomerManager {
	public static void main(String[] args) {
		
		while(true) {
		    	
			System.out.println("********************************************");
			System.out.println("Customer Management Service");
			System.out.println("1.Add Customer");
			System.out.println("2.View all Customers");
			System.out.println("3.Search by Customer");
			System.out.println("4.Exit");
			System.out.println("********************************************");
			
			
			Scanner selection = new Scanner(System.in); 
			int usersel=selection.nextInt();
			switch(usersel) {
			case 1:	
				String useryes="";
				do {
						System.out.println("User selected 1 ");
						System.out.println("Please enter customer ID");
						long id=selection.nextInt();
						selection.nextLine();
						System.out.println("Please enter Customer Name");
						String cusname= selection.nextLine();
						
						
						CustomerBean c1= new CustomerBean(id,cusname);
						
						CustomerRepo customerRepo = new CustomerRepo();
						customerRepo.addCustomer(c1);
						System.out.println("do you want to add another Customer Y/N");
						useryes=selection.nextLine();
							
						
						
						
						
						
				}while(useryes.equals("Y")|| useryes.equals("y"));
				break;
			case 2: 
					CustomerBean [] cb= new CustomerBean [6];
					CustomerRepo customerRepo = new CustomerRepo();
					
					
					cb=customerRepo.viewAllCustomer();
					
					break;
			case 3: System.out.println("User selected 1 ");
					System.out.println("Please enter customer ID");
					long id=selection.nextLong();
					selection.next();
					CustomerRepo cr= new CustomerRepo();
					CustomerBean beans=cr.searchCustomerById(id);
					System.out.println("Id"+ "    " + "Name");
					System.out.println(beans.getCustomerId()+" " + beans.getCustomerName());
					break;
			case 4: 
				System.exit(0);
				break;
				
			}
			
			
		}
		}
	
	}
