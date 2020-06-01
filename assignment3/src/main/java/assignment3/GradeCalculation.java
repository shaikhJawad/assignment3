package assignment3;

public class GradeCalculation {
	
	public String calculateGrade(int marks)
	{
		if(marks >= 90)
		{
			return "A+";
		}
		else if(marks >= 80 && marks < 90)
		{
			return "A";
		}
		else if(marks >= 70 && marks < 80)
		{
			return "B";
		}
		else if(marks >= 60 && marks < 70)
		{
			return "C";
		}
		else if(marks >= 50 && marks < 60)
		{
			return "D";
		}
		else
		{
			return "Fail";
		}
	}

}
