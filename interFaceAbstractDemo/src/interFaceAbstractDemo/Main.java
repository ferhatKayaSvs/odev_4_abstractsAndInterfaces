package interFaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
	    BaseCustomerMAnager customerManager = new StarbucksCustomerManager();
        Customer mehmet = new Customer(1, "Ferhat", "KAYA", "1987", "99999999999");
        customerManager.save(mehmet);

	}

}
