/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven.abstraction;

public class ShapeUser {
    private Shape rectangle;

    public ShapeUser(Shape rectangle) {
        this.rectangle = rectangle;
    }
    
    public void shapeUse(){
        rectangle.draw();
        rectangle.calculateArea();
    }
}
