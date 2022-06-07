import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
  public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Market m=new Market();
		FileReadWriteDemo frwd=new FileReadWriteDemo();
        System.out.println("********************************************");

		System.out.println("Welcome to  Sami Shopping Centre");

        System.out.println("********************************************");
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println();
			System.out.println("Make a choice");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println();
			
			System.out.println();
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
            System.out.println();

		switch(choice)
			{
				case 1:
					System.out.println("You have Chosen Employee Management");
					System.out.println("********************************************");
					System.out.println();
					System.out.println("Your Available Options Are : \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search An Employee");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					System.out.println();

			switch(option1)
					{
						case 1:
							System.out.println("You have Chosen to Insert New Employee");
							System.out.println("********************************************");
							System.out.println();

							System.out.print("Enter Employee ID: ");
							String empId1  = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(m.insertEmployee(e1))
								{ 
									System.out.println("Employee Inserted with ID: "+e1.getEmpId());
								}
							else{
								    System.out.println("Employee Can Not be Inserted");
						        }
							
							break;


						case 2:
							System.out.println("You have Chosen to Remove An Existing Employee");
							System.out.println("***************************************************");
							System.out.println();
							
							System.out.print("Enter Employee ID : ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2))
									{ 
										System.out.println("Employee Removed with ID: "+e2.getEmpId());
							        }
								else
									{
										System.out.println("Employee Can Not be Removed");
									}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;

                        case 3:
						    System.out.println("You have  Chosen to See All Employee");
						    System.out.println("******************************************");
							System.out.println();
							
							m.showAllEmployees();
							
							break;
						
						case 4:
						    System.out.println("You have Chosen to Search An Employee");
						    System.out.println("********************************************");
							System.out.println();
							
							System.out.print("Enter ID of the Employee: ");							
							String empId3 = sc.next();
							System.out.println();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;

						case 5:
							System.out.println("You have Choosen to Go Back");
							System.out.println();
							
							
							break;
							
						default:
							System.out.println("Invalid Choice");
							break;
					}	
					
					break;

					case 2: 
					System.out.println("You have Chosen Shop  Management");
					System.out.println("*****************************************");			
					System.out.println();
					
					System.out.println("Your Available options are: \n");
					System.out.println();
							
					System.out.println("\t1. Insert New Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Show All Shops");
					System.out.println("\t4. Search A Shop");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
				switch(option2)
					{
						case 1:
							System.out.println("You Have Chosen to Insert A Shop");
							System.out.println("***************************************");							
							System.out.println();
							
							System.out.print("Enter New Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter New Shop Name: ");
							String name1 = sc.next();
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							
							if(m.insertShop(s1))
								{
									System.out.println("Shop Inserted with ID: "+s1.getSid());
						        }
							else 
								{
									System.out.println("Shop can not be inserted");
								}
							
							break;
							
						case 2: 

						    System.out.println("You Have Chosen to Remove A Shop");
						    System.out.println("***************************************");							
						    System.out.println();
							
							System.out.print("Enter Shop ID : ");
							String sid2 = sc.next();
							
							Shop s2 = m.searchShop(sid2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2))
									{ System.out.println("Shop Removed with SID: "+s2.getSid());
							}
								else
									{
										System.out.println("Shop Can Not be Removed");
									}
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}

							break;


						case 3:	
						    System.out.println("You have  Chosen to See All Shops");
						    System.out.println("***************************************");
							System.out.println();
							
							m.showAllShops();
							
							break;	

						case 4:
							System.out.println("You Have Chosen to Search a Shop");
							System.out.println("***************************************");							
							System.out.println();
							
							System.out.print("Enter  The Id of the Shop : ");
							String sid3 = sc.next();
							
							Shop s3 = m.searchShop(sid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found");
								System.out.println("Shop Name: "+s3.getName());
								System.out.println("Shop SID: "+s3.getSid());
								
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							break;


						case 5:

						       System.out.println("You Have Chosen to go back");
						       System.out.println();

						       break;

						default:  

						        System.out.println("Invalid Choice");

						        break;
                    }

                    break;

                case 3: 

					System.out.println("You have Chosen Shop Product Management");
					System.out.println("**********************************************");							
					System.out.println();
					
					System.out.println("Your Available options are: \n");
					System.out.println("\t1. Insert New Product");
					System.out.println("\t2. Remove Existing Product");
					System.out.println("\t3. Show All Products");
					System.out.println("\t4. Search A Product");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter Your Option: ");
					int option3 = sc.nextInt();
					Shop s=new Shop();

			    switch(option3)	
			       {	
			            case 1:
							System.out.println("You Have Chosen to Insert A Product");
							System.out.println("*******************************************");
							System.out.println();
							
							System.out.print("Enter New Product PID to Insert a Product: ");
							String pid1 = sc.next();
							System.out.println();	
							if(s.searchProduct(pid1) == null)
							{
								System.out.println("\tWhat type of Product do you want ?");
								System.out.println("\t1. Local Product");
								System.out.println("\t2. Imported Product");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Product  Type: ");
								int productType = sc.nextInt();
								System.out.println();
								
								if(productType == 1)
								{
									System.out.print("Enter Product Name: ");
									String name1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter Discount Rate: ");
									double dr1 = sc.nextDouble();
									
									LocalProduct lp = new LocalProduct();
									lp.setPid(pid1);
									lp.setName(name1);
									lp.setAvailableQuantity(aq1);
									lp.setPrice(p1);
									lp.setDiscountRate(dr1);
									

									System.out.print("Enter Existing Shop ID to add product to the Shop: ");
									String pid2 = sc.next();
									if((m.searchShop(pid2)!=null)) 
									{
										if(m.searchShop(pid2).insertProduct(lp))
									    {
										   System.out.println( name1 + " Product Inserted " + " with Product Id " + pid1 );
									    }
									    else
									    {
										    System.out.println("Product Can Not Be Inserted");
									    }	
									}
									else
									{
										System.out.println("Shop ID doesnt Exist, Product Can Not Be Inserted");
									}
									
								}
								else if(productType == 2)
								{
									System.out.print("Enter Product Id: ");
									String pid = sc.next();
									System.out.print("Enter Product Name: ");
									String name1 = sc.next();
									System.out.print("Enter Available Quantity: ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price: ");
									double p1 = sc.nextDouble();
									System.out.print("Enter Country Name: ");
									String cn1 = sc.next();
									
									ImportedProduct ip = new ImportedProduct();

									ip.setPid(pid1);
									ip.setName(name1);
									ip.setAvailableQuantity(aq1);
									ip.setPrice(p1);
									ip.setCountryName(cn1);

									System.out.print("Enter Existing Shop ID to add product to the Shop: ");
									String pid2 = sc.next();
									if((m.searchShop(pid2)!=null))
									{
								       if(m.searchShop(pid2).insertProduct(ip))
									    {
										   System.out.println(name1 + " Product Inserted " + " with Product Id "+ pid1 );
									    }
									   else
									    {
										   System.out.println("Product Can Not Be Inserted");
									    }
									}
									else
									{
									    System.out.println("Shop ID doesn't Exist, Product Can Not Be Inserted");
									}
									
								}
								else if(productType == 3)
								{
									System.out.println("Go Back");
								}
								else
								{
									System.out.println("Invalid Product Type");
								}
							}
							else
							{
								System.out.println("Pid Already Exists. Enter New Pid to Insert Product");
							}
							
							break;

					    case 2:
						
						    System.out.println("You have Chosen to Remove An Existing Product ");
						    System.out.println("****************************************************");
							System.out.println();
							
							System.out.print("Enter a Product ID to Remove: ");
							String pid2 = sc.next();
							
							Product  p2 = s.searchProduct(pid2);
							
							if(p2!= null)
							{
								if(s.removeProduct (p2))
								{ 
							        System.out.println("Product Removed with ID: "+p2.getPid());
							    }
								else
								{
									System.out.println("Product Can Not be Removed");
							    }
							}
							else
							{
								System.out.println("Product Does Not Exist");
							}
							break;

                        
	                    case 3:

						    System.out.println("You have  Chosen to See All Products");
						    System.out.println("*******************************************");
							System.out.println();
							
							s.showAllProducts();
							
							break;

					    case 4:
							System.out.println("You Have Chosen to Search a Product");
							System.out.println("*****************************************");
							System.out.println();
							
							System.out.print("Enter Product ID: ");
							String pid3 = sc.next();
							System.out.println();							
							Product p3 = s.searchProduct(pid3);
							
							if(p3 != null)
							{
								System.out.println("Product Found");
								System.out.println("Product ID: "+p3.getPid());
								System.out.println("Product  Name: "+p3.getName());
							}
							else
							{
								System.out.println("Product  Does Not Exist");
							}
								
							break;

					    case 5:

							System.out.println("You Have Chosen to Go Back");
							System.out.println();
							
							break;
							
						default:

							System.out.println("Invalid Option");
							break;
					}

					break;	

				case 4:
					System.out.println("You Have Chosen Product Quantity Add-Sell");
					System.out.println("***********************************************");
					System.out.println();
					
					System.out.println("Your Available Options Are: \n");
					System.out.println("\t1. Add Product");
					System.out.println("\t2. Sell Product");
					System.out.println("\t3. Show Add Sell History");
					System.out.println("\t4. Go Back");
					

					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();	
					System.out.println();

                switch(option4)
					{
						case 1: 

						    System.out.println("You have Chosen to Add New Product");
						    System.out.println("****************************************");
                            System.out.println();

                            System.out.print("Enter  Shop ID: ");
                            String sid1 = sc.next();
                               if(m.searchShop(sid1)!=null)
                               {
                               	System.out.print("Enter Product Id: ");
                               	String pid1=sc.next();

                               	if(m.searchShop(sid1).searchProduct(pid1)!= null)
                               	{
                               			System.out.print("Enter An Amount to Add Product: ");
                               			int amount=sc.nextInt();
                               			if(m.searchShop(sid1).searchProduct(pid1).addQuantity(amount))
                               			{
                               				System.out.println("Product Added  Successfully");
                               				frwd.writeInFile(amount +" Amount of "+ pid1 + " Product Has Been Added " );
                               			}
                               			else
                               			{
                               				System.out.println(" Can Not  Add Product ");
                               			}
                               	} 
                               	else
                               	{
                               		System.out.println("Invalid Product Id");
                               	}


                               }
                               else
                               {
                               	System.out.println("Shop Id Mismatch");
                               }

                               break;


                        case 2:

                            System.out.println("You have Chosen to Sell  Product");
                            System.out.println("*************************************");
                            System.out.println();

                            System.out.print("Enter  Shop ID: ");
                            String sid2 = sc.next();
                               if(m.searchShop(sid2)!=null)
                               {
                               	System.out.print("Enter Product Id: ");
                               	String pid2=sc.next();

                               	if(m.searchShop(sid2).searchProduct(pid2)!= null)
                               	{
                               			System.out.print("Enter An Amount to Sell Product: ");
                               			int amount=sc.nextInt();
                               			if(m.searchShop(sid2).searchProduct(pid2).sellQuantity(amount))
                               			{
                               				System.out.println("Product Sold  Successfully");
                               				frwd.writeInFile(amount +" Amount of "+ pid2 + " Product has been sold " );
                               			}
                               			else
                               			{
                               				System.out.println(" Product Can Not Be Sold ");
                               			}
                               	} 
                               	else
                               	{
                               		 System.out.println("Invalid Product Id");
                               	}


                               }
                               else
                               {
                               	System.out.println("Shop Id Mismatch");
                               }

                        break;


                       case 3:

                            System.out.println("You have Chosen to  See Add Sell History");
                            System.out.println("**********************************************");
                            System.out.println();
                            frwd.readFromFile();

                        break;

                        case 4:

							System.out.println("You Have Chosen to Go Back");
							System.out.println();

                        break;

                        default:

					        System.out.println("Invalid Choice.....");

					    break;
					}    
                    
                    break;
						case 5:
					        System.out.println("You Choose Exit");
					        System.out.println();
					        repeat = false;
					    break;
				    
				        default:
					        System.out.println();
					        System.out.println("Invalid Choice");
					
				        break; 
				         						
			}	
        }
	}
}