package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            String location = "C:/Users/alexander" +
                    ".gomez/Documents/TestTextFiles/CourseData .csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<Course>();

            while (input.hasNextLine()){
                String Line = input.nextLine();
                String[] splittedLine = Line.split(",");

                Course cObj = new Course();
                cObj.setCode(splittedLine[0]);
                cObj.setCourse_name(splittedLine[1]);
                cObj.setInstructor_name(splittedLine[2]);

                data.add(cObj);
            }

            for (Course c : data){
                System.out.println(c.getCode() + " | " + c.getCourse_name() +
                        "|" + c.getInstructor_name());
                System.out.println("======================================");
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}
