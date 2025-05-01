package com.tnsif.oopsconcepts;
public class EmpMain {
    public static void main(String[] args) {
        Employee ob = new Employee();
        
        ob.setEid(101);
        System.out.println(ob.getEid());
        
        ob.setEname("kavya");
        System.out.println(ob.getEname());
        
        ob.setSal(400.0f);
        System.out.println(ob.getSal());
    }
}
