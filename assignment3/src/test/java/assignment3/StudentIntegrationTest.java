package assignment3;

import static org.junit.Assert.*;

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

}
