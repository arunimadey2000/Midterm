package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {
	
	@Test
	public void ConstructorTest() {
		Cuboid cub = new Cuboid(2,7,9);

	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void ConstructorTest2() {
		Cuboid cub = new Cuboid(2,7,-9);
		
	}
	
	@Test
	(expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid cub = new Cuboid(2,7,9);
		cub.perimeter();
	}
	
	@Test
	public void getLengthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		assertEquals(cub.getLength(),2);
	}
	
	@Test
	public void setLengthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		cub.setLength(54);
		assertEquals(cub.getLength(),54);
	}
	
	@Test 
	public void getWidthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		assertEquals(cub.getWidth(),7);
		
	}
	
	@Test 
	public void setWidthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		cub.setWidth(45);
		assertEquals(cub.getWidth(),45);
		
	}
	
	@Test
	public void getDepthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		assertEquals(cub.getDepth(),9);
	}
	
	@Test
	public void setDepthTest() {
		Cuboid cub = new Cuboid(2,7,9);
		cub.setDepth(3);
		assertEquals(cub.getDepth(),3);
	}
	
	@Test
	public void areaTest() {
		Cuboid cub = new Cuboid(2,7,9);
		assertTrue(cub.area()==190);
	}
	
	@Test
	public void volumeTest() {
		Cuboid cub = new Cuboid(2,7,9);
		assertTrue(cub.volume()==126);
	}
	
	@Test
	public void sortByAreaTest() {
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
		Cuboid cub = new Cuboid(1,1,1);
		Cuboid cub2 = new Cuboid(2,2,2);
		Cuboid cub3 = new Cuboid(3,3,3);
		
		cubes.add(cub3);
		cubes.add(cub);
		cubes.add(cub2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cub);
		expected.add(cub2);
		expected.add(cub3);
		
		Collections.sort(cubes, new Cuboid.SortByArea());
		assertTrue(cubes.equals(expected));
	}
	
	@Test
	public void sortByVolumeTest() {
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
		Cuboid cub = new Cuboid(1,1,1);
		Cuboid cub2 = new Cuboid(2,2,2);
		Cuboid cub3 = new Cuboid(3,3,3);
		
		cubes.add(cub3);
		cubes.add(cub);
		cubes.add(cub2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cub);
		expected.add(cub2);
		expected.add(cub3);
		
		Collections.sort(cubes, new Cuboid.SortByVolume());
		assertTrue(cubes.equals(expected));
	}

}
