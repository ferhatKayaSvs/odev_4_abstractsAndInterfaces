package interFaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerMAnager {

	@Override
	public void save(Customer customer) {
		checkIfRealPerson(customer);
		System.out.println("Saved to DataBase : " + customer.firstName);

	}

	public boolean checkIfRealPerson(Customer customer) {
		return true;

	}

}
