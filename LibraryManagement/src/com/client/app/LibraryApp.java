package com.client.app;

import java.util.Scanner;

import com.model.app.BookDetails;
import com.service.app.LibraryService;

public class LibraryApp {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		LibraryService library=new LibraryService();
		System.out.println("Enter the total no. of books details to be stored");
		int noOfBook=scan.nextInt();
		BookDetails book[]=new BookDetails[noOfBook];
		byte choice;
		do
		{
			menu();
			choice=scan.nextByte();
			switch(choice)
			{
			case 1:
				library.setBookDetails(book,noOfBook);
				break;
			case 2:
				library.getBookDetails(book,noOfBook);
				break;
			case 3:
				scan.nextLine();
				System.out.println("Enter the book name to be search");
				String bookName=scan.nextLine();
				int result=library.searchBook(bookName,book,noOfBook);
				if(result==0)
				{
					bookName=library.validateBookName(bookName);
					System.out.println("Present Book is: "+bookName);
				}
				else
				{
					System.out.println("Book not found");
				}
				break;
			case 4:
				book=library.insertionSort(book,noOfBook);
				System.out.println("Books sorted Based on author");
				library.getBookDetails(book,noOfBook);
				break;
			case 5:
				scan.nextLine();
				System.out.println("Enter the book id to be updated");
				String bookId=scan.nextLine();
				if(library.searchBookId(bookId,book,noOfBook))
				{
					System.out.println("Enter the new copies total");
					int noOfCopies=scan.nextInt();
					int flag=library.updateBookDetails(book,bookId,noOfCopies,noOfBook);
					if(flag>0)
					{
						System.out.println("Updated successfully");
					}
					else
					{
						System.out.println("Failed to update");
					}
				}
				else
				{
					System.out.println("Book not found");
				}
				break;
			case 6:
				System.out.println("Exited successfully");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=0);
	}
	private static void menu() {
		System.out.println("----------------------------Library Management----------------------------");
		System.out.println("1. Add book details");
		System.out.println("2. Display book details");
		System.out.println("3. Search book");
		System.out.println("4. Display book details based on author name");
		System.out.println("5. Update book details");
		System.out.println("6. Exit");
		System.out.println("--------------------------------------------------------------------------");
	}

}
