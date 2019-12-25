/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six.teacher;

import six.Person;


public class Teacher extends Person{

    private String fieldOfInterest;
    
    public Teacher(String name, String surname, String param3) {
        super(name, surname);
        this.fieldOfInterest = param3;
    }
    
    public void printTeacherInfo(){
        System.out.println("Name = " + name +", Surname = " + surname + ", Field of interest = " + fieldOfInterest);
    }
    
}
