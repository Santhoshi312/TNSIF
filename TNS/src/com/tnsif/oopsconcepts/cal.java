package com.tnsif.oopsconcepts;
// Compile time
//Constructor overloading
public class cal {
 String message;
 int num;

 // Constructor 1
 cal(String message) {
     this.message = message;
 }

 // Constructor 2
 cal(int num) {
     this.num = num;
 }

 void display() {
     System.out.println(message);
 }

 void print() {
     System.out.println(num);
 }

 // Method Overloading
 public int add(int a, int b) {
     return a + b;
 }

 public float add(float a, float b) {
     return a + b;
 }

 public static void main(String[] args) {
	 cal obnew = new cal("this is constructor overloading");
     obnew.display();
     cal ob = new cal(312);
     ob.print();
     System.out.println(ob.add(2.8f,1.4f));
     System.out.println(ob.add(5,5));
 }
}
