import MyClasses.*;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Start 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        Admin a = new Admin();
		String str = "";
		System.out.println(" _________________________________________\n");
        System.out.println(" -----------------------------------------");
        System.out.println(" Welcome to Travel Agency Management Sytem");
        System.out.println(" -----------------------------------------");
        System.out.println(" _________________________________________\n");
		
		boolean repeat1 = true;
		
		while(repeat1)
		{   System.out.println("\n-------------MAIN MENU-------------\n");
			System.out.println("What do you want to do?\n");
			System.out.println("1.  Admin panel");
			System.out.println("2.  Customer panel");
			System.out.println("3.  Exit Program\n");
			
			System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            System.out.println("-----------------------------------");
			switch(choice)
			{
				//ADMIN PANEL
				
			    case 1:
				System.out.println("-----------------------------------");
                System.out.print("Enter Your Password : ");
                String j = sc.next();
                String k = "admin";
                if (k.equals(j))
			    {   
					boolean repeat2 = true;
				
				    while(repeat2)
	                {
						
						System.out.println("\n-----------------------------------");
                        System.out.println("            ADMIN PANEL           ");
                        System.out.println("-----------------------------------\n\n");
				
				        System.out.println("You have the following options: \n");
				        System.out.println("1. Enter your destination Details");
				        System.out.println("2. Remove your destination");
						System.out.println("3. Show details for your Destination");
				        System.out.println("4. Insert new Customer");
				        System.out.println("5. Remove existing customer");
				        System.out.println("6. Show all Customers");
						System.out.println("7. Confirm Bookings of a Customer");
						System.out.println("8. Show all Destination");
				        System.out.println("9. Main Menu\n");
						System.out.println();
                        System.out.print("Enter You Option: ");
                        int option1 = sc.nextInt();
						
			            switch(option1)
			            {
							case 1:
							
						    boolean repeat3=true;
						    while (repeat3)
                            {
								System.out.println("You have the following options: \n");
				                System.out.println("1. Enter your destination name and ID");
				                System.out.println("2. Enter Transport Details for your Destination");
				                System.out.println("3. Enter Hotel Details for your Destination ");
				                System.out.println("4. Enter Additional Travel Places for your Destination");
				                System.out.println("5. Exit");
								System.out.println();
								System.out.print("Enter You Option: ");
                                int option2 = sc.nextInt();
								
						        switch(option2)
					            {
									case 1:
								
									sc = new Scanner(System.in);
									
									System.out.println("You chose to insert your destination name\n");
							        System.out.print("Enter Destination name : ");
									String dname1=sc.nextLine();	
							
							        System.out.print("Enter Destination ID : ");
                                    int dId1 = sc.nextInt();
                                    System.out.print("Enter Destination Cost(Base) : ");
                                    int cop1 = sc.nextInt();									
							        Destination d1 = new Destination();
							        d1.setDestination(dname1);
							        d1.setDestinationId(dId1);
									d1.setCostOfPlace(cop1);
							        
									if(a.insertDestination(d1))
							        {
										System.out.println("Destination Inserted with name [ "+ d1.getDestination()+" ] And ID  [" +d1.getDestinationId()+"]\n");
							        }
							        else{System.out.println("  Destination Cannot be Insertd......");}
							
							        break;
							
						            case 2:
                        								
                         	        System.out.println("\nYou chose to insert Transport System\n");
							        sc.nextLine();
							        System.out.print("Enter Destination ID: ");
									int dId2 = sc.nextInt();
                                    Destination d2 = a.searchDestinationById(dId2);
							
							        if (d2 != null)
							        {
										sc = new Scanner(System.in);
										System.out.print("Enter Transport Type: ");
										String tt1 = sc.nextLine();
								
								        System.out.print("Enter Transport Name: ");
										String tname1 = sc.nextLine();
										System.out.print("Enter Transport Cost (1 person): ");
										int tcost1 = sc.nextInt();						
										d2.settransportType(tt1);
								        d2.settransportName(tname1);  
										d2.settransportCost(tcost1);
										System.out.println();
										System.out.println("Transport type [ "+d2.gettransportType() +" ]is inserted to destination ["+d2.getDestination()+"]\n");
								
							        }
							        break;
							
						            case 3:
									System.out.println("\nYou chose to insert Hotels\n");
							        System.out.print("Enter Destination ID : ");
                                    int dId3 = sc.nextInt();	
							        Destination d3 = a.searchDestinationById(dId3);
							        if (d3!=null)
							        {
										sc = new Scanner(System.in);
										System.out.print("Enter  Hotel Name: ");
										String hname1 = sc.nextLine();
									    System.out.print("Enter  Room Fare (1 Day): ");
										int roomFare1 = sc.nextInt();
										d3.setroomFarePerDay(roomFare1);
										
										d3.sethotelName(hname1);
										d3.setroomFarePerDay(roomFare1);
										System.out.println();
										System.out.println("Hotel "+d3.gethotelName()+" inserted to  [ " +d3.getDestination()+" ]\n");
								
							        } 	
							        break;
                          
						            case 4:
                                  									
                         	        System.out.println("\nYou chose to insert Travel Places\n");
							        System.out.print("Enter Destination ID : ");
                                    int dId4 = sc.nextInt();	
							        Destination d4 = a.searchDestinationById(dId4);
							        if (d4!=null)
							        {
										sc = new Scanner(System.in);
										System.out.print("Enter Additional Travel Place Name: ");
										String tpname1 = sc.nextLine();
										System.out.print("Enter Cost: ");
										int tpcost1 = sc.nextInt();
										
										
							            d4.setTPname(tpname1);
										d4.setTPcost(tpcost1);
										System.out.println();
										System.out.println("Additional Travel place "+d4.getTPname()+" inserted to destination ["+d4.getDestination()+"]\n");
                              							
							        }
							        break;
									
                                    case 5:
									
							        System.out.println("\nYou chose to exit\n");
							        repeat3=false;
							        break;
									
					            }
							
							}		
							
					        break;	
							
							
							case 2:
							
					        System.out.println("\nYou chose to remove a destination");
					        System.out.println("Destination ID to be removed : ");
							int dId5 = sc.nextInt();
							
							Destination d5 = a.searchDestinationById(dId5);
							if(d5!=null)
							{
								if(a.removeDestination(d5))
								{
									System.out.println("Destination "+d5.getDestination()+" removed successfully.");
								}
								else{System.out.println("Destination cannot be removed.");}
							}
							else{System.out.println("Destination not found");}
							break;
					

                            case 3:
					
                            System.out.println("\nYou chose to show details for your destination.");
					        System.out.print("Enter Destination ID : ");
                            int dId6 = sc.nextInt();	
							Destination d6 = a.searchDestinationById(dId6);
							if (d6!=null)
							{
								System.out.println("------------------------------------------------------");
								System.out.println("Destination Name: "+d6.getDestination());
								System.out.println("Transport type and Fare : "+d6.gettransportType()+" [fare: "+d6.gettransportCost()+"]");
								System.out.println("Hotel Name and Fare : "+ d6.gethotelName()+ "  [fare: "+d6.getroomFarePerDay()+"]");
								System.out.println("Travel Place and Cost : "+ d6. getTPname()+ "  [fare: "+d6.getTPcost()+"]");
								System.out.println("------------------------------------------------------");
									
							}
							else{System.out.println("Destination not found");}
							break;
							
							
							case 4:
					
							System.out.println("\nYou chose to insert a new customer.");
					
							System.out.print("Enter Customer's ID : ");
							int cId1 = sc.nextInt();
							
							sc = new Scanner(System.in);
							System.out.print("Enter Customer's name : ");
							String cname1=sc.nextLine();
				
							System.out.print("Enter Customer password : ");String cpass1=sc.next();
							
							System.out.print("Enter Customer's phone number : ");
							int cNum1 = sc.nextInt();
						
							System.out.print("Enter Customer's email : ");String cEmail1=sc.next();
						
							Customer c1 = new Customer();
							
							c1.setCustomerName(cname1);
							c1.setCustomerID(cId1);
							c1.setCustomerPassword(cpass1);
							c1.setCustomerNumber(cNum1);
							c1.setCustomerEmail(cEmail1);
							if(a.insertCustomer(c1))
							{
								System.out.println("Customer with ID : "+c1.getCustomerID()+" inserted");
							}
							else{System.out.println("Customer cannot be inserted .");}
							break;
							
						    case 5:
						
							System.out.println("You chose to remove an existing customer.");
							
							System.out.println("Enter customer's ID to remove : ");
							int cId2 = sc.nextInt();
							
							Customer c2 = a.searchCustomer(cId2);
							
							if(c2!=null)
							{
								if(a.removeCustomer(c2))
								{
									System.out.println("Customer with ID : "+c2.getCustomerID()+" removed successfully.");
								}
								else{System.out.println("Customer cannot be removed.");}
							}
							else{System.out.println("Customer not found");}
							break;
							
							case 6:
				
							a.showAllCustomers();
							break;
						
						
							case 7:
							
							System.out.println("\nYou chose to Approve Bookings of a Customer");
							System.out.print("Enter Customer ID: ");
							int cId4= sc.nextInt();
							a.book(cId4);
					
							break;
							
							
							case 8:
							
							a.showAllDestinations();
							break;
							
						    case 9:
							
							System.out.println("\nYou chose to go back. ");
							repeat2 = false;
							break;
							
							default:
							
                            System.out.println("Invalid Choice.....");
                            break;
	                    }
						
	                }
			    }
			    else 
                System.out.println("Invalid Password");
                break;
				
				
	
				
				//CUSTOMER PANEL
	
	
				case 2:
				System.out.println();
                System.out.print("Enter ID : ");
				int cId3=sc.nextInt();
				sc = new Scanner(System.in);
				System.out.print("Enter Your Password: ");String cpass2=sc.next();
				
				Customer c3 = a.searchCustomer(cId3);
				Customer c4 = a.searchCustomerByPass(cpass2);
				boolean repeat4 = true;
				
				while(repeat4)
				{
					if (c4!= null)
					{
						System.out.println("\n\nWELCOME! [ "+c3.getCustomerName()+" ]");
						System.out.println();
						System.out.println("\n-----------------------------------");
                        System.out.println("         CUSTOMER PANEL           ");
                        System.out.println("-----------------------------------\n\n");
						System.out.println();
						System.out.println();
						System.out.println("You have the following options : ");
						System.out.println("1. Book your Destination ");
						System.out.println("2. Check Bookings of your Destination ");
						System.out.println("3. Update your password ");
						System.out.println("4. Main Menu");
						System.out.println();
						System.out.println("Enter your options : ");
						int option3 = sc.nextInt();
						switch(option3)
						{
							case 1:
							   
							    a.showAllDestinations();
					        	System.out.print("Enter Destination ID:  "); int dId7=sc.nextInt();
								System.out.print("Enter Number Of Persons:  "); int nop1=sc.nextInt();
								System.out.print("Enter Number Of Days: "); int days1=sc.nextInt();
								Destination d7 = a.searchDestinationById(dId7);
								d7.setNumberOfPersons(nop1);
								d7.setNumberOfDays(days1);
								
								if(d7!=null)
								{
									a.showBookings(dId7 , cId3);
								}
								break;
								
							case 2:
							System.out.print("Enter Destination ID:  "); int dId8=sc.nextInt();
							Destination d8 = a.searchDestinationById(dId8);
                            if(d8!=null)
								{
									a.showBookings(dId8 , cId3);
								}
							
							break;
			                 
                         
							case 3:
							    
							    System.out.println("\n----------------------------------------"); 
								System.out.println("             UPDATE PASSWORD            ");
								System.out.println("----------------------------------------\n\n");
								System.out.println("1. Update Your Password");
								System.out.println("2. Go back");
								int option4= sc.nextInt();
								switch(option4) {
									case 1:
									System.out.print("Enter Previous Password: ");String cpass3=sc.next();
												
									if(cpass3.equals(c3.getCustomerPassword()))
									{
										System.out.print("Enter New Password: "); String cpass4=sc.next();	
										c3.setCustomerPassword(cpass4);
										System.out.println("Password Updated Successfully!!!!\n");
									}												
								break;	
												
								}
							
							break;
							
							case 4:
							  
								System.out.println("You chose to go back. ");
								repeat4 = false;
							break;
							
							default: 
							
                            System.out.println("Invalid choice.");
                            break;
						
						}
						
					}
					else{repeat4=false;System.out.println("Incorrect ID or Name or Password");}
				}
				break;
				
                //EXIT 
                case 3: 
				
                System.out.println("\n You Chose to END the program"); 
                repeat1=false;
                break;	 
			
			
            }
        }			
    }			
}
