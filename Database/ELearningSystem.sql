-- Database Name = 'ELearningSystem'

Create Database ELearningSystem;

use ELearningSystem;

SET GLOBAL max_allowed_packet = 1024*1024*14;

create Table Admin(
Adminid int Not Null AUTO_INCREMENT,
fname varchar(150) Not Null,
lname varchar(150),
Email_ID varchar(250),
username varchar(20) Not Null Unique,
password varchar(20),
Gender varchar(10),
picture MEDIUMBLOB,
Primary Key (Adminid)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

Insert Into Admin (fname, lname, Email_ID, username, password, Gender)
Values('Kunjan', 'Kanani', 'Kunjan@admin.com', 'admin', 'admin', 'Male');


create Table Student(
stdID int Not Null AUTO_INCREMENT,
fname varchar(150) Not Null,
lname varchar(150),
Email_ID varchar(250),
username varchar(20) Not Null Unique,
password varchar(20),
Gender varchar(10),
Registration_Date Date Not Null,
Last_Login Datetime,
picture MEDIUMBLOB,
Primary Key (stdID)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;


create Table Teacher(
teacherID int Not Null AUTO_INCREMENT,
fname varchar(150) Not Null,
lname varchar(150),
Email_ID varchar(250),
username varchar(20) Not Null Unique,
password varchar(20),
Gender varchar(10),
Registration_Date Date Not Null,
Last_Login Datetime,
picture MEDIUMBLOB,
Primary Key (teacherID)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;


create Table Subjects(
Subject_ID int Not Null AUTO_INCREMENT,
Name varchar(150) Not Null Unique,
Primary Key (Subject_ID),
Adminid int Not Null,
CONSTRAINT Adminid_fk Foreign Key (Adminid) References Admin(Adminid) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

create Table Courses(
course_ID int Not Null AUTO_INCREMENT,
Name varchar(250) Not Null Unique,
Description varchar(1000) Not Null,
Content varchar(3000) Not Null,
teacherID int Not Null,
Subject_ID int Not Null,
Primary Key(course_ID),
CONSTRAINT teacherID_fk Foreign Key (teacherID) References Teacher(teacherID) ON DELETE CASCADE,
CONSTRAINT subjectID_fk Foreign Key (Subject_ID) References Subjects(Subject_ID) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

create Table Enrollments(
Enrollment_ID int Not Null AUTO_INCREMENT,
Enrollment_Date Date Not Null,
course_ID int Not Null,
stdID int Not Null,
CONSTRAINT courseID_fk Foreign Key (course_ID) References Courses(course_ID) ON DELETE CASCADE,
CONSTRAINT stdID_fk Foreign Key (stdID) References Student(stdID) ON DELETE CASCADE,
Primary Key(Enrollment_ID),
UNIQUE KEY unique_Enrollment(course_ID, stdID)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;


create Table Messages(
Message_ID int Not Null AUTO_INCREMENT,
message varchar(2000) Not Null,
time_Stamp Datetime Not Null,
User_ID int Not Null,
toUser_ID int Not Null,
Primary Key (Message_ID)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

create Table MessageUsers(
User_ID int Not Null,
Message_ID int Not Null,
CONSTRAINT message_ID_fk Foreign Key (Message_ID) References Messages(Message_ID) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

CREATE TABLE `mcq` (
  `question` varchar(300) DEFAULT NULL,
  `optionA` varchar(100) DEFAULT NULL,
  `optionB` varchar(100) DEFAULT NULL,
  `optionC` varchar(100) DEFAULT NULL,
  `optionD` varchar(100) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `sub` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
