import java.util.Scanner;

public class CustomerDetails {
	private int id;
	private String cust_name;
	private byte cust_age;
	private String medi_name;
	private int medi_count;
	private long medi_price;

	public CustomerDetails() {
		super();
	}

	public CustomerDetails(int id, String cust_name, byte cust_age, String medi_name, int medi_count, long medi_price) {
		super();
		this.id = id;
		this.cust_name = cust_name;
		this.cust_age = cust_age;
		this.medi_name = medi_name;
		this.medi_count = medi_count;
		this.medi_price = medi_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public byte getCust_age() {
		return cust_age;
	}

	public void setCust_age(byte cust_age) {
		this.cust_age = cust_age;
	}

	public String getMedi_name() {
		return medi_name;
	}

	public void setMedi_name(String medi_name) {
		this.medi_name = medi_name;
	}

	public int getMedi_count() {
		return medi_count;
	}

	public void setMedi_count(int medi_count) {
		this.medi_count = medi_count;
	}

	public long getMedi_price() {
		return medi_price;
	}

	public void setMedi_price(long medi_price) {
		this.medi_price = medi_price;
	}
	
		
	

}
