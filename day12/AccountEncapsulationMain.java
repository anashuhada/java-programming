package day12;

public class AccountEncapsulationMain {

	public static void main(String[] args) {
		
		AccountEncapsulation accEnc = new AccountEncapsulation();
		accEnc.setAccNo(1001); // pass the value
		accEnc.setName("David");
		accEnc.setAmount(50000);
		System.out.println(accEnc.getAccNo() + " " + accEnc.getName() + " " + accEnc.getAmount()); // read the value
	}

}
