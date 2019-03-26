package pkgShape;

public class Rectangle extends Shape{
	private int length;
	private int width;
		
	public Rectangle(int len, int wid) {
			
		if(len<=0||wid<=0) {
			throw new IllegalArgumentException();
		}
			
		length = len;
		width = wid;
	}
		
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2*length + 2*width;
	}
		
	public int compareTo(Object rec) {
		return (int)(this.area()-((Rectangle)rec).area());
	}
		

}

