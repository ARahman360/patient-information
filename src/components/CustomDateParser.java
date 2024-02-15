package components;

public class CustomDateParser {
	public int year;
	
	public CustomDateParser(String dateString) {
		this.year = Integer.valueOf(dateString.split("-")[2]);
	}

	public String getBenifitMessage() {
	    if (year > 70) {
	        return "You'll receive a free meal when you visit hospital!";
	    } else if (year < 18) {
	    	return "You must be accompanied by an adult.";
	    } else if (year < 13) {
	    	return "You must be accompanied by an adult and a paediatrically specialised doctor will be assigned.";
	    } else return "See you soon!";
	}
}