package org.cusey.Lambda;

public class Person {
	
	private String lastName;
	private String firstName;
	private String emailAddress;
	private String telephoneNaumber;
	private String gender;
	private int age;
	private String address;
	
	public Person(String lastName, String firstName, String emailAddress,
			String telephoneNaumber, String gender, int age, String address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.telephoneNaumber = telephoneNaumber;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName
				+ ", emailAddress=" + emailAddress + ", telephoneNaumber="
				+ telephoneNaumber + ", gender=" + gender + ", age=" + age
				+ ", address=" + address + "]";
	}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}

	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}

	public String getEmailAddress() {return emailAddress;}
	public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}
	
	public String getTelephoneNaumber() {return telephoneNaumber;}
	public void setTelephoneNaumber(String telephoneNaumber) {this.telephoneNaumber = telephoneNaumber;}
	
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
}
