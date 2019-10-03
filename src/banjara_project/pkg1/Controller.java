
package banjara_project.pkg1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    
   
    Model model;
    View view;
    
    public Controller() {
        
        model = new Model();
        view = new View();
        
    }
    
    public void start() {
        
        boolean done = false;
        
        /* Main Menu */
        
        view.displayWelcomeMessgae(); 
        
        while ( !done ) {
            
            int choice = view.mainMenu();
            
            switch (choice) {

                case View.SEARCH_COURSES:
                    String number = view.getCourseNumber();
                    view.printCourseList(model.getSections(number));
                    break;

                case View.REGISTER_FOR_COURSE:
                    int crn = view.getCrnNumber();
                    view.displayAddCourseResult(model.addCourse(crn));
                    break;

                case View.VIEW_SCHEDULE:
                    view.printCourseList(model.getSchedule());
                    break;

                case View.QUIT:
                    done = true;
                    break;
                    
            }
                
        }
        
        view.displayExitMessage();
            
    }

    public static void main(String[] args) {
        
        ( new Controller() ).start();
        
    }
    
}
