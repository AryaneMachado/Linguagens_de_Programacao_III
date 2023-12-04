package view;

import java.util.ArrayList;
import java.util.List;
import model.Shape;

public class Canvas {
	
	private List<Shape> shapes = new ArrayList<>();
	
	public void addShape(Shape shape) {
		if(shape != null) {
			shapes.add(shape);
		}
	}
	
	public void printShapes() {
		for(Shape shape : shapes) {
			String saida = String.format("Forma: %s - Área: %.2f\n", shape.name(), shape.area());
			System.out.println(saida);
		}
	}
	
}