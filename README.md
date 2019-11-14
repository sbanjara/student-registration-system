# Student Registration System!!

## Description
   This program is an implementation of Student Registration System using Java.
   This program allows,
   
   1. Looking up an offering for a particular course
   2. Registering a course 
   3. Viewing a trialschedule/registered courses
   
   It has an input file which has the course offering information for a particular semester. This program reads the input file, gets the    course information line by line, and adds it to a Course object. The Course object is an abstract class which holds general information    about a course, namely course name, crn number, course number, section, credit hours, instructor, and class type (Traditional or          Online). Also there are TraditionalCourse and OnlineCourse classes which extends the Course class. TraditionalCourse has more fields      like meeting location, starting time, and stopping time than the OnlineCourse. It is implemented using Model-View-Controller pattern.
   
   In the coming days, I will be transforming it to a web application. I will be using Java (java server page, java servlet, java beans) to handle server-side operations and HTML, CSS, JavaScript, and jQuery to handle client-side operations.
   
## How to Run this Program
   It is written in Java 8 and is intended to run via Netbeans. If you don't have Java 8 and/or Netbeans installed, you can install those by following instructions below,
   
   ### Java Development Kit (JDK) Setup Instructions
   
   http://adoptopenjdk.net/releases.html (Links to an external site.)

   This is a direct link to the official Java SE download page from the AdoptOpenJDK projct; it includes a link to Java 8, the version of Java that we are currently using in the lab.

   When you are ready to install Java on your personal computer, open this link, select the most recent version of Java 8 if it is not selected already, and be sure to select the correct platform.  For example, if you are running a 64-bit version of Windows (which you probably are if you have a fairly recent computer), click the "Windows x64" link to download the 64-bit installer.  If you have a 32-bit computer, download the "Windows x86" version instead.

   NOTE: During the installation, be sure that the "Set JAVA_HOME Variable" feature is enabled in the "Custom Setup" screen; to do this, click the drop-down list of options next to this feature and choose "Will be installed on local hard drive."

   If you have already completed the installation, and if you subsequently have trouble getting NetBeans and other Java applications to find your JDK, you may need to set this variable manually.  Fortunately, this is not difficult; see the instructions below:

   #### Installation in Microsoft Windows

   Open the File Explorer, then right-click "This PC" in the list of locations on the left, and choose "Properties."  The "System" window should appear, showing information about your version of Windows.

   Click the "Advanced system settings" link on the left to open the "System Properties" window; in the "Advanced" tab of this window, click the "Environment Variables" button.  Yet another window will open, showing a list of environment variables at the top and system variables at the bottom.

   You should see a "New..." button near the bottom of this window; click this button, and when prompted, enter "JAVA_HOME" as the variable name and "C:\Program Files\AdoptOpenJDK\jdk-8.0.222.10-hotspot\" as the variable value.  Enter both without the double-quotes.

(Note that this is the version of OpenJDK that is currently in use in the lab.  Your version number may be slightly different, so you should click "Browse Directory" and then browse the filesystem on your "C:" drive to find the installation folder under "C:\Program Files\AdoptOpenJDK\"; if the folder name is different, use it instead.)

   Click "OK" in each of the open windows to commit your changes, and after they have all been closed, test your OpenJDK installation again.
   
   ### Netbeans 8.2 Installation Instructions
   
   https://netbeans.org/downloads/8.2/ (Links to an external site.)

   This is a direct link to the official NetBeans 8.2 installer.  Before installing NetBeans, make sure that you have Java 8 installed (this version of NetBeans does not support Java 9 or above).  Choose the "Download" button beneath the "Java EE" version of NetBeans, which includes Web application functionality that we will be using in subsequent assignments.  Launch the installer after it has downloaded, and accept the default options provided by the installation wizard.

   After the installation is complete, follow the post-install configuration steps corresponding to your operating system platform to integrate the Apache Tomcat server with NetBeans.  The installation instructions given below assume that you already have Apache Tomcat 8.5.x installed and configured on your workstation; if you do not, complete the installation instructions for Tomcat before proceeding.

   IF YOU ALREADY HAVE NETBEANS 8.2 INSTALLED: You should not need to reinstall NetBeans, so you can skip the instructions given below, but you should double-check to ensure that the necessary plugins and libraries are installed for developing web applications.  Launch NetBeans, and from the "Tools" menu, choose "Plugins."  Open the "Available Plugins" tab and select the following three items:

   Java EE Base
   RESTful Web Services
   EJB and EAR

   Click the "Install" button, and allow any necessary dependencies to be installed as well.  If these plugins are not listed in the "Available Plugins" tab, look for them in the "Installed" tab; if all three are listed there, then the plugins are already installed, and there is nothing more that you need to do to.

   ### Installation in Microsoft Windows

   1. Launch NetBeans 8.2.  From the "Tools" menu, choose "Servers."

   2. Click the "Add Server ..." button in the lower-left.  In the "Choose Server" dialog box, choose "Apache Tomcat or TomEE" from the list of servers and click "Next."

   3. In the "Installation and Login Details" dialog box, enter the following location in the "Server Location" field:

   C:\Program Files\Apache Software Foundation\Tomcat 8.5

   In the "Username" and "Password" fields, enter the username "admin" and the password "3^3@yer$".  (Recall that these are the same credentials given in the Apache Tomcat installation instructions.)  Click "Finish."

   4. Now, we must test starting and stopping the server, and deploying applications to the server, from within NetBeans. From the "File" menu, choose "New Project."  In the "New Project" dialog box, choose "Java Web" from the list of categories on the left, and "Web Application" from the list of projects on the right.  Click "Next", accept the default project name and location, then click "Next" again.  In the "Server and Settings" dialog box, choose "Apache Tomcat or TomEE" from the list of servers.  Click "Finish" to create the project.

   5. Click the "Browser" button in the toolbar (to the left of the "Build Project" button), and in the drop-down menu, change the browser choice from "IDE Default" to your preferred browser; on the lab workstations, the browser should be preset to Firefox.  From the "Run" menu, choose "Clean and Build", then open the "Run" menu again and choose "Run Project."  If Tomcat is configured correctly within NetBeans, additional tabs should appear in the "Output" window for the Apache Tomcat service and logs.  At this point, you might get a prompt from Windows Firewall; if you do, select "Allow Access."  Shortly afterward, a Web browser should open and a placeholder web page containing the text " TODO write content" should appear.

   6. This indicates that the application was successfully deployed to Tomcat.  Close the browser, and in the "Apache Tomcat or TomEE" tab in the "Output" window, click the red "Stop" button to stop the Tomcat service.  Close NetBeans.

 ### Installation in Mac OS X

   1. Launch NetBeans 8.2.  From the "Tools" menu, choose "Services."
   
   2. Click the "Add Server ..." button in the lower-left.  In the "Choose Server" dialog box, choose "Apache Tomcat or TomEE" from the list of servers and click "Next."

   3. In the "Installation and Login Details" dialog box, enter the following location in the "Server Location" field:

   /usr/local/Cellar/tomcat@8/8.5.38/libexec

   (Depending on your installation of Tomcat, the version number may be slightly different, so confirm the location and make any necessary changes.)

   In the "Username" and "Password" fields, enter the username "admin" and the password "3^3@yer$".  (Recall that these are the same credentials given in the Apache Tomcat installation instructions.)  Click "Finish."

   4. From the "NetBeans" menu, choose "Preferences."  In the "General" tab, look for the "Proxy Settings" area, and ensure that the "No Proxy" option is selected.  Click "Apply", then "OK."

   5. Now, we must test starting and stopping the server, and deploying applications to the server, from within NetBeans. From the "File" menu, choose "New Project."  In the "New Project" dialog box, choose "Java Web" from the list of categories on the left, and "Web Application" from the list of projects on the right.  Click "Next", accept the default project name and location, then click "Next" again.  In the "Server and Settings" dialog box, choose "Apache Tomcat or TomEE" from the list of servers.  Click "Finish" to create the project.

   6. Click the "browser" button in the toolbar (to the left of the "Build Project" button), and in the drop-down menu, change the browser choice from "IDE Default" to your preferred browser; on the lab workstations, the browser should be preset to Firefox.  From the "Run" menu, choose "Clean and Build", then open the "Run" menu again and choose "Run Project."  If Tomcat is configured correctly within NetBeans, additional tabs should appear in the "Output" window for the Apache Tomcat service and logs.  Shortly afterward, a Web browser should open and a placeholder web page containing the text "TODO write content" should appear.

   7. This indicates that the application was successfully deployed to Tomcat.  Close the browser, and in the "Apache Tomcat or TomEE" tab in the "Output" window, click the red "Stop" button to stop the Tomcat service.  Close NetBeans.
