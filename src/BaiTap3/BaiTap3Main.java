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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        // TODO code application logic here
        
        
        
         ShapeFactory shape = new ShapeFactory();

            Shape circle1 = shape.createShape(ShapeType.Circle);
            circle1.setBrush("Vẽ bút chì");
            circle1.setPaper("Vẽ trên giấy a4");
            circle1.setFrame("Vẽ không khung");
            System.out.println(circle1.toString());

          
            Shape rectangle1 = shape.createShape(ShapeType.Rectangle);
            rectangle1.setBrush("Vẽ bút màu");
            rectangle1.setPaper("Vẽ trên giấy a3");
            rectangle1.setFrame("Vẽ có khung");
            System.out.println(circle1.toString());
            
            Shape triangle1 = shape.createShape(ShapeType.Triangle);
            triangle1.setBrush("Vẽ bằng cọ");
            triangle1.setFrame("Vẽ không cần khung");
            triangle1.setPaper("Vẽ trên tường");
            System.out.println(triangle1.toString());
            
            

            
    }
    
}
