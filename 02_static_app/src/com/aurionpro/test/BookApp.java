package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.models.Book;


public class BookApp {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of Books: ");
		int nums  = scanner.nextInt();
		
		Book books[] = new Book[nums];//array
		
		int bookNumber = 1 ;
		
		for(int i = 0; i < books.length;i++) {
			
			System.out.println("===Enter Book "+bookNumber+" details===");
			
			System.out.print("Enter the book Id: ");
			int bookId = scanner.nextInt();
			
			System.out.print("Enter the book name: ");
			String  name = scanner.next();
			
			System.out.print("Enter the Author: ");
			String author = scanner.next();
			
			
			System.out.print("Enter the Prices: ");
			double price = scanner.nextDouble();
			
			
			
			
			books[i] = new Book(bookId,  name,  author,  price);
			
			bookNumber++;
			System.out.println(" ");
		}
		 displayBooks( books);
	
		
	}
	private static void displayBooks(Book[] books) {
		 //sorting the array
		 for (int i = 0; i < books.length; i++) {
	           
	            for (int j = 0; j < books.length - i - 1; j++) {
	                
	                if (books[j].getPrice() < books[j+1].getPrice() ) {
	                   
	                    Book temp = books[j];
	                    books[j] = books[j + 1];
	                    books[j + 1] = temp;
	                }
	            }
	        }
		
		 int count = 1;
		 // Display the books
		 for (int index = 0; index < books.length; index++) {
			    System.out.println("=============The books "+count+" detail=========");
			    System.out.println("The book Id is  : "+ books[index].getBookId());
				System.out.println("Book name is: "+ books[index].getName());
				System.out.println("Book price is: "+ books[index].getPrice());
				System.out.println("Book author is: "+ books[index].getAuthor());
				System.out.println(" ");
				count++;
		 }
		 

}
}
