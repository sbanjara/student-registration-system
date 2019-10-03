
package banjara_project.pkg1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class View {
    
    public static final int SEARCH_COURSES = 1;
    public static final int REGISTER_FOR_COURSE = 2;
    public static final int VIEW_SCHEDULE = 3;
    public static final int QUIT = 4;
    
    Scanner in;
    
    public View() {
        
        in = new Scanner(System.in);
        
    }
    
    public void displayWelcomeMessgae() {
        
        System.out.println("Welcome to the Student Registration System!!");
        
    }
    
    public void displayAddCourseResult(boolean result) {
        
        if (result) {
            System.out.println("Course added successfully!\n");
        }
        else {
            System.out.print("ERROR: Either the course was not found, or it ");
            System.out.println("conflicts with your current schedule!\n");
        }
        
    }
    
    public int getCrnNumber() {
        
        System.out.print("Enter CRN number: ");
        return getNumber();
        
    }
    
    public String getCourseNumber() {
        
        String number = "";
       
        System.out.print("Enter course number in the format SS NNN(for example, CS 201): ");
        number = "CS " + getNumber();
        System.out.println();
        
        return number;
        
    }
    
    public void printCourseList(ArrayList<Course> c) {
        
        if(c.isEmpty()) {
            System.out.println("SORRY, You haven't registered any courses!!");
        }
        
        else {
            for (Course s : c) {
                System.out.println(s);
            }
        }
        
    }
    
    public int mainMenu() {
        
        int choice = 0;
        boolean valid_input = false;
     
        /* Displays Menu */
        
        while (!valid_input) {
            
            System.out.println();
            System.out.println("1) Search Courses ");
            System.out.println("2) Register for Classes");
            System.out.println("3) View Trial Schedule");
            System.out.println("4) QUIT");
            System.out.println();
            System.out.print("Your choice? ");
            choice = getNumber();
            valid_input = true;
            
        }
        
        return choice;
        
    }
    
    /* Reads an integer from standard input */
    
    private int getNumber() {
        
        while (!in.hasNextInt()) {
            in.next();
        }
        
        return in.nextInt();
        
    }
    
    /* Prints Exit Message */
    
    public void displayExitMessage() {
        
        System.out.print("\nThank you for using the Student Registration ");
        System.out.println("System!\n\n");
        
    }
    
    
}
