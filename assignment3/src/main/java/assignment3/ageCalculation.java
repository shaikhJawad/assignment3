package assignment3;

import java.util.Date;

public class ageCalculation {
	public int calcAge(Date dob)
	{
		Date today = new Date();
		int age = today.getYear() - dob.getYear();
		return age;
	}
}
