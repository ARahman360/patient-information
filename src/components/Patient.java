package components;

public class Patient {
	private String firstName;
	private String surName;
	private String dob;
	private String mobile;
	private String email;
	private String address;
	
	public Patient(String firstName, String surName, String dob, String mobile, String email, String address) {
		this.firstName = firstName;
		this.surName = surName;
		this.dob = dob;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	
	public boolean isError(){
		if (this.firstName == "" && this.surName == "" && this.dob == "" && this.mobile == "" && this.email == "" && this.address == "" ) {
			return false;
		} else {			
			return true;
		}
    }
}
