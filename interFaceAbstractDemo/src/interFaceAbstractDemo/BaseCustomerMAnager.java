package interFaceAbstractDemo;

public abstract class BaseCustomerMAnager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db" +  customer.firstName);
		
	}

}
