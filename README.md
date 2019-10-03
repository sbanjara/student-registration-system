# Student Registration System. 

## Description
   This program is an implementation of Student Registration System.
   This program allows,
   
   1. Looking up an offering for a particular course
   2. Registering a course 
   3. Viewing a trialschedule/registered courses
 
## Working
   It has an input file which has the course information for a particular semester. This program reads the input file, gets course information line by line and adds it to a Course object. The Course object is an abstract class which holds general information about a course, namely course name, crn number, course number, section, credit hours, instructor, and class type (Traditional or Online). Also there are TraditionalCourse and OnlineCourse classes which extends the Course class. TraditionalCourse has more fields like meeting location, starting time, and stopping time than the OnlineCourse.
