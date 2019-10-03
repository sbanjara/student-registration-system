
package banjara_project.pkg1;


public abstract class Course {
    
    private String courseName;
    private int crn;
    private String courseNumber;
    private String section;
    private int creditHours;
    private String classType;
    private String instructor;
   
    
    public Course(String courseName, int crn, String courseNumber, 
            String section, int creditHours, String classType, 
            String instructor) {
        
        this.courseName = courseName;
        this.crn = crn;
        this.courseNumber = courseNumber;
        this.section = section;
        this.creditHours = creditHours;
        this.classType = classType;
        this.instructor = instructor;
        
    }

    public String getCourseName() {
        return courseName;
        
    }

    public int getCrn() {
        return crn;
        
    }

    public String getCourseNumber() {
        return courseNumber;
        
    }

    public String getSection() {
        return section;
        
    }

    public int getCreditHours() {
        return creditHours;
        
    }

    public String getClassType() {
        return classType;
        
    }

    public String getInstructor() {
        return instructor;
        
    }
   
   public abstract boolean conflictWith(Course c);
    
    
}
