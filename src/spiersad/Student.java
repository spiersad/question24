package spiersad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: spiers
 * Date: 5/21/13
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private int ID;
    private List<Integer> scores = new ArrayList<Integer>();
    private double average;

    Student(String studentName, int studentID){
        name =  studentName;
        ID = studentID;
    }

    public void getAverage(){
        average = 0;
        for (int i = 0; i < scores.size(); i++) {
            average += scores.get(i);
        }
        average /= scores.size();
    }

    public String toString(){
        this.getAverage();
        return "Name: " + name + " ID: " + ID + " Average: " + average;
    }

    public boolean equals(Student rightSide){
        return ID == rightSide.ID;
    }

    public int compareTo(Student rightSide){
        getAverage();
        rightSide.getAverage();
        if (average == rightSide.average)
            return 0;
        else if (average < rightSide.average)
            return -1;
        else
            return 1;
    }
}