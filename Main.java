/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Ogrenci> data = new ArrayList<Ogrenci>();
    
    public static void main(String [] args) throws IOException{
        boolean control =false;
        int ID = 0;
        String name = " ";
        String surname = " ";
        int age = 0;
        double gpa = 0;
        String birthplace = "";
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a file name to read: ");
        String fileName = scan.next();
        Scanner fileReader = readFile (fileName);
        int counter = 0;
        while(fileReader.hasNext())
        {
            Ogrenci newStudent = new Ogrenci (ID);
            data.add(newStudent);
            ID = fileReader.nextInt();
            name = fileReader.next();
            surname = fileReader.next();
            age = fileReader.nextInt();
            gpa = fileReader.nextDouble();
            birthplace = fileReader.next();
            data.get(counter).setName(name);
            data.get(counter).setSurname(surname);
            data.get(counter).setID(ID);
            data.get(counter).setAge(age);
            data.get(counter).setGpa(gpa);
            data.get(counter).setBirthplace(birthplace);
            counter++;
        }
        
        while(!control)
        {
            System.out.println("1.Display students\n 2.Change gpa of a student\n 3.Sort the students in increasing order of ID\n 4.Save the available students to a file\n 5.quit\n 6.bonus:ogrenci ekle");
            String answer = scan.next();
            System.out.println("Selection: " + answer);
            if(answer.equals("1"))
            {
                System.out.println("Students available: ");
                displayStudents(data);
                System.out.println();
                System.out.println("**********");
                control = false;
            }
            else if(answer.equals("2"))
            {
                System.out.println("Please enter the index of the student: ");
                int index = scan.nextInt();
                System.out.println("Please enter the new gpa of" + data.get(index).getName() + " " + data.get(index).getSurname()+ ": ");
                double newGpa = scan.nextDouble();
                data.get(index).setGpa(newGpa);
                System.out.println("***********");
                control = false;
            }
            else if(answer.equals("3"))
            {
                Collections.sort(data);
                System.out.println("Sorting is completed");
                control = false;
            }
            else if(answer.equals("4"))
            {
                Scanner yazici = readFile(fileName);
                System.out.println("Enter the name of the file to write: ");
                String newFileName = scan.next();
                PrintWriter outputFile = new PrintWriter(newFileName);
                for(int i = 0; i <data.size(); i++)
                {
                    outputFile.println(data.get(i));
                }
                outputFile.flush();
                System.out.println("**********");
                control = false;
            }
            else if (answer.equals("6"))
            {
                System.out.print("ID: ");
                ID = scan.nextInt();
                System.out.print("Name: ");
                name = scan.next();
                System.out.print("Surname ");
                surname = scan.next();
                System.out.print("Age: ");
                age = scan.nextInt();
                System.out.print("Gpa: ");
                gpa = scan.nextDouble();
                System.out.print("Birthplace: ");
                birthplace = scan.next();
            }
            else
                System.exit(0);
        }
    }
    
    public static Scanner readFile (String fileName) throws IOException{
        File inputFile = new File (fileName);
        Scanner textScan = new Scanner (inputFile);
        return textScan;
    }
    public static void displayStudents(ArrayList<Ogrenci> studentData){
        for(int i = 0; i < studentData.size(); i++)
            System.out.println(studentData.get(i));
    }
}
