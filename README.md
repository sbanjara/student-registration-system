# Student Registration System!!

## Description
   This program is an implementation of a Student Registration System using Java.
   This program allows,
   
   1. Looking up an offering for a particular course
   2. Registering a course 
   3. Viewing a trialschedule/registered courses
   
   It has an input file (csv file) which has the course offering information for a particular semester. This program reads the input file, gets the course information line by line, and adds it to a Course object. The Course object is an abstract class which holds general information about a course, namely course name, crn number, course number, section, credit hours, instructor, and class type (Traditional or Online). Also there are TraditionalCourse and OnlineCourse classes which extend the Course class. TraditionalCourse has more fields like meeting location, starting time, and stopping time than the OnlineCourse. It is implemented using a Model-View-Controller pattern.
   
   In the coming days, I will be transforming it to a web application.
##   
## How to Run this Program
   It is written in Java 8 and is intended to run via Netbeans. If you don't have Java 8 and/or Netbeans installed, you can install those by following instructions below,
   ###
   ### Java Development Kit (JDK) Setup Instructions
   
   http://adoptopenjdk.net/releases.html (Links to an external site.)

   This is a direct link to the official Java SE download page from the AdoptOpenJDK projct; it includes a link to Java 8, the version of Java that we are currently using in the lab.

   When you are ready to install Java on your personal computer, open this link, select the most recent version of Java 8 if it is not selected already, and be sure to select the correct platform.  For example, if you are running a 64-bit version of Windows (which you probably are if you have a fairly recent computer), click the "Windows x64" link to download the 64-bit installer.  If you have a 32-bit computer, download the "Windows x86" version instead.

   NOTE: During the installation, be sure that the "Set JAVA_HOME Variable" feature is enabled in the "Custom Setup" screen; to do this, click the drop-down list of options next to this feature and choose "Will be installed on local hard drive."

   If you have already completed the installation, and if you subsequently have trouble getting NetBeans and other Java applications to find your JDK, you may need to set this variable manually.  Fortunately, this is not difficult; see the instructions below:
   ####
   #### Installation in Microsoft Windows

   Open the File Explorer, then right-click "This PC" in the list of locations on the left, and choose "Properties."  The "System" window should appear, showing information about your version of Windows.

   Click the "Advanced system settings" link on the left to open the "System Properties" window; in the "Advanced" tab of this window, click the "Environment Variables" button.  Yet another window will open, showing a list of environment variables at the top and system variables at the bottom.

   You should see a "New..." button near the bottom of this window; click this button, and when prompted, enter "JAVA_HOME" as the variable name and "C:\Program Files\AdoptOpenJDK\jdk-8.0.222.10-hotspot\" as the variable value.  Enter both without the double-quotes.

(Note that this is the version of OpenJDK that is currently in use in the lab.  Your version number may be slightly different, so you should click "Browse Directory" and then browse the filesystem on your "C:" drive to find the installation folder under "C:\Program Files\AdoptOpenJDK\"; if the folder name is different, use it instead.)

   Click "OK" in each of the open windows to commit your changes, and after they have all been closed, test your OpenJDK installation again.
   ###
   ### Netbeans 8.2 Installation Instructions
   
   https://netbeans.org/downloads/8.2/ (Links to an external site.)

   This is a direct link to the official NetBeans 8.2 installer.  Before installing NetBeans, make sure that you have Java 8 installed (this version of NetBeans does not support Java 9 or above).  Choose the "Download" button beneath the "Java EE" version of NetBeans, which includes Web application functionality that we will be using in subsequent assignments.  Launch the installer after it has downloaded, and accept the default options provided by the installation wizard.
   ##
   ## Post Installation
   
   After the installation as stated above is completed, you can clone the repository by using the command
   ###
   **"git clone https://github.com/sbanjara/student-registration-system"** in the command prompt
   ###
   Once the source file is cloned in your workstation, you can create a netbeans project with existing sources (the source file that is cloned). Finally, you can build it and run!!!
      
