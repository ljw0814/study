package ch06.sec08.exam04;
// 메서드 오버로딩하기
// 240p
public class Calculator {
	//정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

                  