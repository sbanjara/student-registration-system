
package banjara_project.pkg1;


public class OnlineCourse extends Course{
    
    
    public OnlineCourse(String cName, int crn, String coNum, String sec, 
            int cHrs, String cType, String instr) {
        
        super(cName, crn, coNum, sec, cHrs, cType, instr);
        
    }
    
    
    @Override
     public String toString() {
         
        StringBuilder s = new StringBuilder();
        
        s.append( "#" ).append( getCrn() ).append( ": " );
        s.append( getCourseNumber() ).append( "-" ).append( getSection() );
        s.append( " (" ).append( getCourseName() ).append( "), " );
        s.append( getInstructor() ).append( ", " ).append( getClassType() );
        
        return s.toString();
        
    }
    
    
    @Override
    public boolean conflictWith(Course x) {
        
        boolean conflictWith = false;
        if( x instanceof OnlineCourse ) {
            conflictWith = false;
            
        }
        return conflictWith;
        
    }
   
     
}
