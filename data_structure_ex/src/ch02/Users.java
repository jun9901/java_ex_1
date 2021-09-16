package ch02;

public class Users {

	int id;
	String name;
	String userName;
	String email;
	String phone;
	String website;
	Address address;
	Company	company;
	Geo geo;
	
	public Users() {
		address = new Address();
		company = new Company();
		geo = new Geo();
	}
}

class Address{
	String street;
	String suite;
	String city;
	String zipcode;
}

class Company{
	String name;
	String catchPhrase;
	String bs;
	
}
class Geo {
	String lat;
	String lng;
}