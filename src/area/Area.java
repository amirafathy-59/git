/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASD
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        double area= 0.0;
        
        if (args.length == 0){ //no arguments
        System.out.println("Using default square side lenght= 4: ");
                area= 4*4;
        System.out.print("Area = " + area);
        
        }
        
        if( args.length==2 || args.length==3){
            String shape= args[0];
            
            // For Square
            if(shape.compareToIgnoreCase("square")==0){
            System.out.println("Square side length= "+ args[1]);
            double side= Double.parseDouble(args[0]);
            area= side*side;
            System.out.println("Area of square = " + area);
            }  
            
            //Rectangle
            else if(shape.compareToIgnoreCase("rectangle")==0){
                    if (args.length==3){
                    System.out.println("Rectangle length = " + args[1]);
                    double length= Double.parseDouble(args[1]);
                    System.out.println("Rectangle width = " + args[2]);
                    double width= Double.parseDouble(args[2]);
                    
                   area= length*width;
                   System.out.println("Area of rectangle = " + area);
                    }
                    }
            
            
            
            //circle
            else if(shape.compareToIgnoreCase("circle")==0){
                if(args.length==2){
                System.out.println("Radius of the circle = " + args[1]);
                double radius=Double.parseDouble(args[1]);
                area= (22/7)*(radius*radius);
                System.out.println("Area of the circle = " + area);
               
                }
            //if the user didn't write circle or rectangle or square
            else{
            System.out.println("Undefined shape");
            }
                
            }
                
                
                
            
            }
        else{
        System.out.println("Wrong number of arguments");
        }
    
        }
            
        
    }
    
    

