
package banjara_project.pkg1;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Model {
     
    public static final int TRADITIONAL_FIELDS = 11;
    public static final int ONLINE_FIELDS = 7;
    
    private static final String INPUT_FILE = "project1input.csv";
    
    private ArrayList<Course> catalog;
    private ArrayList<Course> section;
    private ArrayList<Course> trialschedule;
    
    public Model() {
    
        catalog = readCourseData(); 
        section = new ArrayList<>();
        trialschedule = new ArrayList<>();
        
    }
    
    private ArrayList<Course> readCourseData() {
        
        ArrayList<Course> courses = new ArrayList<>();
        String line;
        ArrayList<String> file;

        try {

            /* 
            IT ADDS THE INPUT FILE TO THE ARRAYLIST CALLED "DATA" WHICH CONSISTS OF
            BOTH THE TRADITIONAL AND ONLINE COURSES. LOOPS UNTIL THERE ARE NO DATA 
            TO READ FROM THE FILE. 

            */
            Scanner in = new Scanner(Paths.get(INPUT_FILE), "UTF-8");
            while ( in.hasNextLine() ) {

                line = in.nextLine();
                file = new ArrayList(Arrays.asList(line.split("\t")));

                String courseName = file.get(0);
                int crn = Integer.parseInt( file.get(1) );
                String courseNum = file.get(2);
                String section = file.get(3);
                int creditHours = parseInt( file.get(4) );

                if( file.size() == TRADITIONAL_FIELDS ) {

                    String classType = file.get(9);
                    String instructor = file.get(10);
                    String meetingDays = file.get(7);
                    String location = file.get(8);

                    String[] startTime = file.get(5).split(":");
                    int startHour = parseInt( startTime[0] );
                    int startMinutes = parseInt( startTime[1] );
                    LocalTime startingTime = LocalTime.of(startHour, startMinutes);

                    String[] endTime = file.get(6).split(":");
                    int endHour = parseInt( endTime[0] );
                    int endMinutes = parseInt( endTime[1] );
                    LocalTime endingTime = LocalTime.of( endHour, endMinutes );

                    courses.add( new TraditionalCourse( courseName, crn, courseNum, 
                            section, creditHours, classType, instructor, 
                            startingTime, endingTime, meetingDays, location ) );

                }

                else if( file.size() == ONLINE_FIELDS ) {

                    String classType = file.get(5);
                    String instructor = file.get(6);

                    courses.add( new OnlineCourse( courseName, crn, courseNum, section,
                            creditHours, classType, instructor ) );

                }

            }

        }
        
        catch (Exception e) {
            
            System.err.println(e.toString());
            
        }
        
        return courses;

    }
    
    public ArrayList<Course> getSections(String number) {
        
        for(Course course : catalog) {
        
            if( course.getCourseNumber().equals(number) ) {
                section.add(course);
            }
        }
        return (ArrayList<Course>)section.clone(); 
        
    }
    
    public boolean addCourse(int crn) {
        
        for(Course course : catalog) {
            
            if(course.getCrn() == crn && trialschedule.isEmpty()) {
                trialschedule.add(course);
                return true;
            }
            else if(course.getCrn() == crn && !trialschedule.isEmpty()) {
                
                for(Course c: trialschedule) {
                    if (course.conflictWith(c)) {
                        return false;
                    }
                    else {
                        trialschedule.add(course);
                        return true;
                    }
                }
                
            }
        }
        return false;
        
    }
    
    public Course getCourse(int crn) {
        
        Course course = null;
        
        for (Course c : catalog) {     
            
            if (c.getCrn() == crn) {
                
                course = c;
                
            }
            
        }
        
        return course;
        
    }
    
    public ArrayList<Course> getSchedule() {
        
        return (ArrayList<Course>)trialschedule.clone();
        
    }   
    
}
