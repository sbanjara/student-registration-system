
package banjara_project.pkg1;

import java.time.LocalTime;


public class TraditionalCourse extends Course{
   
    private LocalTime startingTime;
    private LocalTime endingTime;
    private String meetingDays;
    private String location;
   
    
    public TraditionalCourse(String cName, int crn, String coNum, String sec,
            int cHrs, String cType, String instr, LocalTime startT, 
            LocalTime endT, String mDays, String loc) {
        
        super(cName, crn, coNum, sec, cHrs, cType, instr);
        this.startingTime = startT;
        this.endingTime = endT;
        this.meetingDays = mDays;
        this.location = loc;
        
    }

    public LocalTime getStartingTime() {
        return startingTime;
        
    }

    public LocalTime getEndingTime() {
        return endingTime;
        
    }

    public String getMeetingDays() {
        return meetingDays;
        
    }

    public String getLocation() {
        return location;
        
    }
    
    
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        s.append( "#" ).append( getCrn() ).append( ": " );
        s.append( getCourseNumber() ).append( "-" ).append( getSection() );
        s.append( " (" ).append( getCourseName() ).append( "), " );
        s.append( getInstructor() ).append( ", " ).append( getClassType() );
        s.append( ", " ).append( getStartingTime() ).append( " - " );
        s.append( getEndingTime() ).append( ", " ).append( getMeetingDays() );
        s.append( ", " ).append( getLocation() );
       
        return s.toString();
        
    }
    
    
    @Override
    public boolean conflictWith(Course x) {
        
        boolean conflictWith = false;
        
        if ( x instanceof TraditionalCourse ) {
            
            String a = this.getMeetingDays();
            String b = ( (TraditionalCourse)x ).getMeetingDays();
            LocalTime startA = this.getStartingTime();
            LocalTime stopA = this.getEndingTime();
            LocalTime startB = ( (TraditionalCourse)x ).getStartingTime();
            LocalTime stopB = ( (TraditionalCourse)x ).getEndingTime();

            for( int i = 0; i < a.length(); ++i ) {
                
                for( int j = 0; j < b.length(); ++j ) {
                    
                    if( a.charAt(i) == b.charAt(j) ) {
                        
                        if( 
                                
                            ( startA.isBefore(startB) && stopA.isAfter(startB) ) ||  
                            ( startA.isAfter(startB) && startA.isBefore(stopB) ) || 
                            ( startA.equals(startB) ) ||
                            ( startB.isAfter(startA) && stopB.isBefore(stopA) )  
                                
                          ){
                            
                            conflictWith = true;
                            break;
                            
                        }  
                    }
                }
            }
        }
        return conflictWith;    
    }
    
    
}
