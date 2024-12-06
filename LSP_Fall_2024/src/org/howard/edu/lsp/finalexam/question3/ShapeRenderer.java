package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    private ShapeFactory shapeFactory;

    public ShapeRenderer() {
        shapeFactory = ShapeFactory.getInstance();
    }

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.getShape(shapeType);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Circle
        renderer.renderShape("rectangle"); // Output: Rectangle
        renderer.renderShape("triangle");  // Output:Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}
