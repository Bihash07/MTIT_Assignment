
package Book_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Book_consumer.BookConsumer;
import Book_producer.Book_ProducerInterface;

public class submethodConsumer {
	public static  List<Object> stringlist=new ArrayList<Object>();
	public static  List<Object> TotalInvoicelist=new ArrayList<Object>();
	public static float TotalPrice=0;
	
	public static void Book_producer(Book_ProducerInterface Book) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("\nSelect the type of Book Type\n1. Special Book\n2. Normal Book");
	    System.out.printf("Enter the number : ");
	    int BookType = myObj.nextInt();  
	    
	    if(BookType == 1) {
	    System.out.println("\nThe price of the  according to the type");
	    
		
		Scanner scan=new Scanner(System.in);
		BookConsumer u1 = new BookConsumer();
		Book.ListBooks_1();
		
		String user_option="yes";
		int total=0;
		
		do {

			System.out.println("\nSelect the type of Item\n1. Fantasy\n2. Horror\n3. Adventure\n4. Classics");
			System.out.printf("Enter the number : ");
			int size=scan.nextInt();
			
			if(size == 1) {
				System.out.println("/nYour selection for Double Horror item is successful ");				
			
				System.out.println("Current Bill: "+Book.items_1(size));
				total+=Book.items_1(size);
				
				u1.setPayment(Book.Fantasy);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += Book.items_1(size);
			}
			else if(size == 2) {
				System.out.println("\nYour selection for Horror item is successful ");				
			
				System.out.println("Current Bill: "+Book.items_1(size));
				total+=Book.items_1(size);
				
				u1.setPayment(Book.Horror);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += Book.items_1(size);
			}			
			else if(size == 3) {
				System.out.println("\nYour selection for Adventure item is successful ");				
				
				System.out.println("Current Bill: "+Book.items_1(size));
				total+=Book.items_1(size);
				
				u1.setPayment(Book.Adventure);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += Book.items_1(size);
			}
			else if(size == 4) {
				System.out.println("\nYour selection for Classics item is successful ");				
				
				System.out.println("Current Bill: "+Book.items_1(size));
				total+=Book.items_1(size);
				
				u1.setPayment(Book.Classics);
				;
				stringlist.add(u1.getPayment());
				
				TotalPrice += Book.items_1(size);
			}
			else 
				System.out.println("\nUnexpected error! Please try again");
			   
				u1.setPayment(total);
				stringlist.add(u1.getPayment());			
			
				total=0;
				System.out.println("\nDo you want to continue? 'yes' for YES \n 'no' for NO");
				user_option=scan.next();		
			}
		while(user_option.equals("yes")); 
		
		//printing the bill for Book Service
				System.out.println("\n\nCake Service Bill");
				System.out.println("--------------------------------------------------------");   
				System.out.println("   	Total Price: " +TotalPrice);
				System.out.println("--------------------------------------------------------");   
				System.out.println("        Thank you..!             ");
		
		stringlist.clear();
		
		u1.setPayment(TotalPrice);

		TotalInvoicelist.add(u1.getPayment());
		TotalPrice=0;
	    }else if(BookType == 2) {
	    	System.out.println("\nThe price of the Book according to the type");
		    
			
			Scanner scan=new Scanner(System.in);
			BookConsumer u1 = new BookConsumer();
			Book.ListBooks_2();
			
			String user_option="yes";
			int total=0;
			
			
			do {

				System.out.println("\nSelect the type of Item\n1. Comic\n2. GraphicNovel\n3. Mystery\n4. Detective");
				System.out.printf("Enter the number : ");
				int size=scan.nextInt();
				
				if(size == 1) {
					System.out.println("\nYour selection for Comic Book  item is successful ");				
				
					System.out.println("Current Bill: "+Book.items_2(size));
					total+=Book.items_2(size);
					
					u1.setPayment(Book.Comic);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += Book.items_2(size);
				}
				else if(size == 2) {
					System.out.println("\nYour selection for GraphicNovel Book item is successful ");				
				
					System.out.println("Current Bill: "+Book.items_2(size));
					total+=Book.items_2(size);
					
					u1.setPayment(Book.GraphicNovel);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += Book.items_2(size);
				}			
				else if(size == 3) {
					System.out.println("\nYour selection for Mystery Book item is successful ");				
					
					System.out.println("Current Bill: "+Book.items_2(size));
					total+=Book.items_2(size);
					
					u1.setPayment(Book.Mystery);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += Book.items_2(size);
				}
				else if(size == 4) {
					System.out.println("\nYour selection for Detective Book item is successful ");				
					
					System.out.println("Current Bill: "+Book.items_2(size));
					total+=Book.items_2(size);
					
					u1.setPayment(Book.Detective);
					;
					stringlist.add(u1.getPayment());
					
					TotalPrice += Book.items_2(size);
				}
				else 
					System.out.println("\nUnexpected error! Please try again");
				   
					u1.setPayment(total);
					stringlist.add(u1.getPayment());			
				
					total=0;
					System.out.println("\nDo you want to continue? 'yes' for YES \n 'no' for NO");
					user_option=scan.next();		
				}
			while(user_option.equals("yes")); 
			
			//printing the bill for Book Service
			System.out.println("\n\n Book Service Bill");
			System.out.println("--------------------------------------------------------");   
			System.out.println("   	Total Price: " +TotalPrice);
			System.out.println("--------------------------------------------------------");   
			System.out.println("        Thank you..!             ");
			
			stringlist.clear();
			
			u1.setPayment(TotalPrice);

			TotalInvoicelist.add(u1.getPayment());
			TotalPrice=0;
	    }
	}
	

}
