package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
        // private constructor to prevent instantiation
    }

    public static ShapeFactory getInstance1() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null;
    }

	public static ShapeFactory getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}