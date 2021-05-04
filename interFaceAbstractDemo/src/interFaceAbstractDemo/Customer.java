package interFaceAbstractDemo;

public class Customer {
    int id;
    String firstName;
    String lastName;
    String dateOfBirth;
    String nationalityId;

    public Customer(){

    }

	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


}
