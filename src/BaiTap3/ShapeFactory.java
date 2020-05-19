/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cam Ly
 */
public class ShapeFactory 
{

    Shape circle1;
    public Shape createShape(ShapeType Type)
    {
        Shape shape;
        switch(Type)
        {
            case Rectangle: return shape = Rectangle.createInstance();
            case Circle : return shape = Circle.createInstance();
            case Triangle: return shape = Triangle.createInstance();
        }
        return null;
    }
}
