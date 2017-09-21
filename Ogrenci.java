/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenci;

/**
 *
 * @author Cem Okan
 */
public class Ogrenci implements Comparable<Ogrenci> {
    private int ID;
    private String name;
    private String surname;
    private int age;
    private double gpa;
    private String birthplace;
    
    //constructs a student info
    public Ogrenci (int ID) {
       this.ID = ID;
       this.name = name;
    }
    /**toString overriding
     * return a string
     */
    public String toString(){
        return (getID()+ " " + getName() + " " + getSurname() + " " + getAge() + " " + getGpa() + " " + getBirthplace());
    }
    
    public int compareTo (Ogrenci other){
        return(this.getID() - other.getID());
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * @param birthplace the birthplace to set
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    
    
}
