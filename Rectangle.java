/**
 * class Rectangle
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints the average value of a set of areas, given by length and width.
 *   
 *   
 *
 */ 
 import java.io.*;
 
 public class Rectangle {
    public double length = 0.0, width = 0.0;
    
    public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
    }
    public double getLength() {
       return this.length;
    } 
    public double getWidth() {
       return this.width;
    } 
    public double area() {
       return this.getLength() * this.getWidth();
    }
 }
 