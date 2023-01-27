/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan27.java;

/**
 *
 * @author Max Matthew
 */
public class PartTimeStudent extends Jan27Java {
    
    private int numOfCourse;
    
    public PartTimeStudent(int numOfCourses, String studentName) {
        this.numOfCourse = numOfCourses;
    }

        public int getNumOfCourse() {
        return numOfCourse;
    }
        
    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }
}
