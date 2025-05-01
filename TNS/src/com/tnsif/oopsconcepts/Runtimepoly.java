package com.tnsif.oopsconcepts;
//Override
class Demo {
 public void msg() {
     System.out.println("this is run time demo call from demo");
 }
}

class Sample extends Demo {
 @Override
 public void msg() {
     System.out.println("this is run time demo call from sample");
 }
}

public class Runtimepoly {
 public static void main(String[] args) {
     Demo o = new Demo();
     o.msg(); // calls Demo's version

     Sample s = new Sample();
     s.msg(); // calls Sample's overridden version
 }
}
