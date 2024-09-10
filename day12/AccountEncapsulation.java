package day12;

public class AccountEncapsulation {

	private int accNo;
	private String name;
	private double amount;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	// setter and getter - because the class variables are private
	// only accessible through methods - set and get
	
	/*// setter method
	void setAccNo(int accNo) {
		this.accNo = accNo; // this keyword represents the class variable
	}
	
	// getter method
	int getAccNo() {
		return accNo;
	}*/
	
	
	
	
}
