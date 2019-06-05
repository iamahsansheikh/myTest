# myTest


Clone Repository in local folder

Import in Eclipse using Maven
Run the project from Eclipse

Run the following command to run the project from Command Line:

1- mvn clean install
2- Run from Command Line
	mvn spring-boot:run
	
3- End Points:
  i - Get All Persons from Database
   	   localhost:5000/api/persons
   	   
  ii - Get All Persons with specific First Name
       localhost:5000/api/persons/firstname/ahsan
       
  iii - Get All Persons with specific Last Name
	    localhost:5000/api/persons/lastname/ijaz

Created the DB (MYSQL) instance on AWS
Records in DB are:

'1','Ahsan','Ijaz'
'2','Amina','Jatoi'
'3','Ahmad','Ijaz'
'4','Ijaz','Rashid'
'5','Joe','Root'
'6','Virat','Kohli'
'7','David','Warner'
'8','Steve','Smith'
'9','Kevin','Petersen'


