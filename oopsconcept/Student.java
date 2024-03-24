package oopsconcept;

import java.time.LocalDateTime;

import javax.swing.plaf.basic.BasicListUI.ListSelectionHandler;

public class Student {
    private String name;
    private int roll;
    private int age;
    private String uni;
    public Student(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



    //polymorphism
    public void read(){
        System.out.println("Student is reading");
    }
    public void read(String value){
        System.out.println("Student is reading "+ value);
    }
    public void read(String value,LocalDateTime time){
        System.out.println("Student is reading"+ value+ "at"+ time);
    }

}

