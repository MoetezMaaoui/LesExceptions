package EX3;

public class jourinvalid extends Exception {
	public String getMessage() {
		return "le nbr de jour dois etre entre 1 et 31";
	}
}
