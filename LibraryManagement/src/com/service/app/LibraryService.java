package com.service.app;

import java.util.Scanner;

import com.model.app.BookDetails;

public class LibraryService {
	static Scanner scan = new Scanner(System.in);

	public void setBookDetails(BookDetails[] book, int noOfBook) {

		for (int i = 0; i < noOfBook; i++) {
			System.out.println("Enter the book Name");
			String bookName = scan.nextLine();
			System.out.println("Enter the book publisher name");
			String bookPublisher = scan.nextLine();
			System.out.println("Enter the book authoer name");
			String bookAuthor = scan.nextLine();
			System.out.println("Enter the no. of copies");
			int noOfCopies = scan.nextInt();
			book[i] = new BookDetails(bookName, bookPublisher, bookAuthor, noOfCopies);
			scan.nextLine();
		}
	}

	public void getBookDetails(BookDetails[] book, int noOfBook) {
		System.out.println("------------------------Library details-----------------------------");
		for (int i = 0; i < noOfBook; i++) {
			System.out.println("Book Id: " + book[i].getBookId());
			System.out.println("Book Name: " + book[i].getBookName());
			System.out.println("Book Publisher: " + book[i].getPublisherName());
			System.out.println("Book Author: " + book[i].getAuthorName());
			System.out.println("No of copies: " + book[i].getNoOfCopies());
			System.out.println("--------------------------------------------------------------------");
		}

	}

	public int searchBook(String bookName, BookDetails[] book, int noOfBook) {
		int low = 0;
		int high = book.length - 1;
		int result = binarySearch(book, low, high, bookName);
		System.out.println(result);
		return result;
	}

	private int binarySearch(BookDetails[] book, int low, int high, String bookName) {
		int mid = (low + high) / 2;
		while (low <= high) {
			if (book[mid].getBookName().compareTo(bookName) == 0) {
				return 0;
			} else if (book[mid].getBookName().compareTo(bookName) < 0) {
				low = mid + 1;
			} else if (book[mid].getBookName().compareTo(bookName) > 0) {
				high = mid - 1;
			}
		}
		return 1;
	}

	public String validateBookName(String bookName) {
		String result = "";
		for (int i = 0; i < bookName.length(); i++) {
			if (i % 2 != 0) {
				int value = bookName.charAt(i);
				char c = (char) ((value + 1) - 32);
				result = result + c;
			} else {
				result = result + bookName.charAt(i);
			}
		}
		return result;
	}

	/*
	 * Selection Sort
	 */
	public BookDetails[] selectionSort(BookDetails[] book, int noOfBook) {
		int min;
		for (int i = 0; i < noOfBook - 1; i++) {
			min = i;
			for (int j = i + 1; j < noOfBook; j++) {
				if (book[j].getAuthorName().compareTo(book[i].getAuthorName()) < 0) {
					min = j;
				} else if (book[j].getAuthorName().compareTo(book[i].getAuthorName()) == 0) {
					if (book[j].getBookName().compareTo(book[i].getBookName()) < 0) {
						min = j;
					}
				}
			}
			BookDetails temp = book[i];
			book[i] = book[min];
			book[min] = temp;

		}
		return book;
	}
	
	public BookDetails[] insertionSort(BookDetails[] book,int noOfBook) {
	
		for(int i=1;i<noOfBook;i++)
		{
			BookDetails temp=book[i];
			String key=book[i].getAuthorName();
			int j=i-1;
			while(j>=0&&book[j].getAuthorName().compareTo(key)>0)
			{
				book[j+1]=book[j];
				j--;
			}
			book[j+1]=temp;
		}
		return book;
	}

	/*
	 * Binary Search
	 */
	public boolean searchBookId(String bookId, BookDetails[] book, int noOfBook) {
		book = selectionSort(book, noOfBook);
		int first = 0;
		int last = noOfBook;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (book[mid].getBookId().compareTo(bookId) < 0) {
				first = mid + 1;
			} else if (book[mid].getBookId().compareTo(bookId) > 0) {
				last = mid - 1;
			} else if (book[mid].getBookId().equals(bookId)) {
				return true;
			}
		}
		return false;
	}

	public int updateBookDetails(BookDetails[] book, String bookId, int noOfCopies, int noOfBook) {
		for (int i = 0; i < noOfBook; i++) {
			if (book[i].getBookId().equals(bookId)) {
				book[i].setNoOfCopies(noOfCopies);
				return 1;
			}
		}
		return 0;
	}

}
