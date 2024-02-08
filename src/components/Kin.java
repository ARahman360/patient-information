package components;

public class Kin {
	private String firstName;
	private String surName;
	private String relation;
	private String mobile;
	private String email;
	private String address;
	
	public Kin(String firstName, String surName, String relation, String mobile, String email, String address) {
		this.firstName = firstName;
		this.surName = surName;
		this.relation = relation;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	
	public boolean isError(){
		if (this.firstName == "" && this.surName == "" && this.relation == "" && this.mobile == "" && this.email == "" && this.address == "" ) {
			return false;
		} else {			
			return true;
		}
    }
}
