package assignment3;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class StudentIntegrationTest {

	@Test
	public void integrationStudentGrade() {
		Student s = new Student();
		GradeCalculation g = new GradeCalculation();
		
		int marks = 87;
		String _grade = g.calculateGrade(marks);
		s.setGrade(_grade);
		
		Assert.assertEquals("A", s.getGrade());
	}
	@Test
	public void integrationStudentAge() {
		Student s = new Student();
		ageCalculation a = new ageCalculation();
		
		SimpleDateFormat sd = new SimpleDateFormat();
		Date dob;
		try {
			dob = sd.parse("2020-01-01");
			int age = a.calcAge(dob);
			s.setAge(age);
			Assert.assertEquals(30, s.getAge());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
