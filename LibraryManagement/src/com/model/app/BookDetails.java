package com.model.app;

public class BookDetails {
	private String bookId;
	private String bookName;
	private String publisherName;
	private String authorName;
	private int noOfCopies;
	private static int id=110;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public BookDetails(String bookName, String publisherName, String authorName, int noOfCopies) {
		super();
		this.bookId="BID"+id;
		id++;
		this.bookName = bookName;
		this.publisherName = publisherName;
		this.authorName = authorName;
		this.noOfCopies = noOfCopies;
	}
	
	
}
