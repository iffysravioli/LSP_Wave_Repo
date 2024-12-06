package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeRendererTest {

    @Test
    public void testRenderCircle() {
        ShapeRenderer renderer = new ShapeRenderer();
    
        renderer.renderShape("circle"); // Expected output: a Circle
       
    }

    @Test
    public void testRenderRectangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("rectangle"); // Expected output:  a Rectangle
     
    }

    @Test
    public void testRenderTriangle() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("triangle"); // Expected output: Triangle

    }

    @Test
    public void testUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("hexagon"); // Expected output: Unknown shape type: hexagon

    }

    @Test
    public void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "ShapeFactory should be a singleton");
    }
}
