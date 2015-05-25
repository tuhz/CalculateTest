package cn.edu.tju.scs.hongzhi.calculate;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {

	int[] a = {-1, 1, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
	int[] b = {1, 1, -1, -2};
 	
	@Test
	public void testAdd() {
		for (int i = 0; i< 5; i++) {
			assertEquals((long)a[i]+b[0], Calculate.add(a[i], b[0]));
		}
	}

	@Test
	public void testSubstract() {
		for (int i = 0; i< 5; i++) {
			assertEquals((long)a[i]-b[1], Calculate.substract(a[i], b[1]));
		}
	}

	@Test
	public void testMultiply() {
		for (int i = 0; i< 5; i++) {
			assertEquals((long)a[i]*b[2], Calculate.multiply(a[i], b[2]));
		}
	}

	@Test
	public void testDivide() {
		for (int i = 0; i< 5; i++) {
			assertEquals((double)a[i]/b[3], Calculate.divide(a[i], b[3]), 0.0001);
		}
	}

}
