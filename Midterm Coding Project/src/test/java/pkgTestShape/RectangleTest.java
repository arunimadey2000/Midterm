package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void constructorTest() {
		Rectangle rec = new Rectangle(5,4);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void constructorTest2() {
		Rectangle rec = new Rectangle(-5,4);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void constructorTest3() {
		Rectangle rec = new Rectangle(5,-4);
	}
	
	@Test
	public void getLengthTest() {
		Rectangle rec = new Rectangle(5,4);
		assertTrue(rec.getLength()==5);
	}
	
	@Test
	public void setLengthTest() {
		Rectangle rec = new Rectangle(5,4);
		rec.setLength(34);
		assertTrue(rec.getLength()==34);
	}
	
	@Test
	public void getWidthTest() {
		Rectangle rec = new Rectangle(5,4);
		assertTrue(rec.getWidth()==4);
	}
	
	@Test
	public void setWidhtTest() {
		Rectangle rec = new Rectangle(5,4);
		rec.setWidth(56);
		assertTrue(rec.getWidth()==56);
	}
	
	@Test
	public void areaTest() {
		Rectangle rec = new Rectangle(5,4);
		assertTrue(rec.area()==20);
	}
	
	@Test
	public void perimeterTest() {
		Rectangle rec = new Rectangle(5,4);
		assertTrue(rec.perimeter()==18);
	}
	
	@Test
	public void compareToTest() {
		Rectangle rec = new Rectangle(5,4);
		Rectangle rec2 = new Rectangle(5,3);
		assertTrue(rec.compareTo(rec2)>1);
	}
	
	

}
