# **E-Learning System**

**How to run the Project:**
1. Clone this repo using 
   - `https://github.com/kunjankanani/E-Learning-System.git`
2. Install Netbeans 8.2
3. Use WAMP server.
4. First create the MySql database on XAMPP server using the sql file in the repo
5. And then build and run the LoadingScreen.java or Main.java file from the IDE. 

**Login Information** <br>
 ```
 username : admin
 password: admin 
 ```
 note: Super admin can add new admins
 
# INTRODUCTION: <br>
E-Learning System is a desktop-based Windows application developed in Java with Swing and AWT. This project aims at serving Students and Teachers in Online based learning. 
Admins can add subjects, Teachers can add courses in a particular subject and Students can Enroll courses and study them, and also Students can message other participants in a particular course except the Teacher teaching that course.

**Hardware and software tools:**<br>
The system services and goals are established by consultation with system user. They are then defined in details and serve as a system specification. System requirement are those on which the system runs.<br><br>

💻    Software Requirements:<br>
*   Windows Operating system.<br>
*   JRE and JDK.<br>	
*   MySQL server (WAMP)<br>

# IMPLEMENTATION <br>
**Description on Implementation**<br>
The goal of this application is to manage the Students, Teachers, Courses and various functions of E-Learning System.

**List of modules with use cases:**<br>
This Java project consists of 3 major modules
*  ***Admin***<br>
   * Admin Login with Username & Password<br>
   * View Profile<br>
   * View Account Information<br>
   * Delete Account<br>
   * Manage Account (Change email, change name, change profile, change password)<br>
   * Admin Adds Subject<br>
   * Admin Deletes Subject<br>
   * View All Teachers Details and Delete Teacher<br>
   * View All Students Details and Delete Student<br>
   * View All Courses Details<br>
   * Add New Admin<br>
   * Logout<br>
*  ***Teacher***<br>
   *  Signup<br>
   *  Teacher Login with Username & Password<br>
   *  View Profile<br>
   *  View Account Information<br>
   *  Delete Account<br>
   *  Manage Account (Change email, change name, change profile, change password)<br>
   *  Teacher Adds Course<br>
   *  Teacher Adds Mcq<br>
   *  View My Students in a Particular course.<br>
   *  View My Courses<br>
   *  Update My Course<br>
   *  Logout<br>
*  ***Student***<br>
   *  Signup<br>
   *  Student Login with Username & Password<br>
   *  View Profile<br>
   *  View Account Information<br>
   *  Delete Account<br>
   *  Manage Account (Change email, change name, change profile, change password)<br>
   *  Student Enrols Courses<br>
   *  Student Study Courses<br>
   *  Student Withdraw Courses<br>
   *  Student Views Participants in a particular course.<br>
   *  Student can Message any participant in a particular course except Teacher.<br>
   *  Logout<br>



