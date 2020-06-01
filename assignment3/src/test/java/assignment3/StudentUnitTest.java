package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StudentUnitTest {

	@Test
	public void setNameTest() {
		// Happy Path Test
		Student _student = new Student();
		_student.setName("Jawad");
		Assert.assertEquals("Jawad", _student.name);
	}
	@Test
	public void getNameTest() {
		// Happy Path Test
		Student _student = new Student();
		_student.name = "Jawad";
		Assert.assertEquals("Jawad", _student.getName());
	}

}
