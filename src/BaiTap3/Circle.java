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
public class Circle extends Shape
{
    public static Circle circle;
    
    @Override
    public String draw() 
    {
        return "circLe";
        
    }
    
    protected Circle()
    {}
     public Circle(String brush, String paper, String frame)
     {
         super(brush, paper, frame );
         
     }
     
     public static Circle createInstance()
     {
         if(circle == null)
         {
             circle = new Circle();
         }
         return circle;
     }
}
