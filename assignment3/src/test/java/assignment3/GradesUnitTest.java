package assignment3;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class GradesUnitTest {

	@Test
	public void testGradeCalc() {
		//Boundary value test
		int marks = new Random().nextInt(50); // as maximum marks before fail is 50
		String expected = "Fail";
		GradeCalculation _gC = new GradeCalculation();
		Assert.assertEquals(expected, _gC.calculateGrade(marks));
		
	}

}
