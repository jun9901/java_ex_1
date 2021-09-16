package ch05;

public class GenericMethod {

	// 함수 만들기1
	public static <X, Y> int makeRectangle1(Point<X, Y> p1, Point<X, Y> p2) {

		// 사각형 넓이 구하는 공식 (가로 * 세로)
		int left = (Integer) p1.getX();
		int right = (Integer) p2.getX();

		int top = (Integer) p1.getY();
		int bottom = (Integer) p2.getY();

		int width = right - left;
		int height = bottom - top;

		return width * height;
	}

	public static <X, Y> double makeRectangle2(Point<X, Y> p1, Point<X, Y> p2) {

		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();

		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;

		return width * height;
	}
	
	// 문제 3. 삼각형의 널빙를 구하는 함수를 만들어라.

	public static void main(String[] args) {

		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point(10, 10);

		int size = makeRectangle1(p1, p2);
		System.out.println("size :" + size);
		
		System.out.println("------------------");
		
		Point<Integer, Double> p3 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p4 = new Point<Integer, Double>(20, 20.0);
		double size2 = makeRectangle2(p3, p4);
		System.out.println("size :" + size2);
	}

}
