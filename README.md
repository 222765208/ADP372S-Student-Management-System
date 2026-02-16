# ADP372S-Student-Management-System
### Student Name: Sinazo Ntsimbi  

## Project Overview
This assignment implements a Student Management System in Java.  

The system demonstrates:
- The Builder Design Pattern  
- Inheritance and Polymorphism  
- Application of SOLID principles  
- Clean, modular, and extensible object-oriented design  

The system supports two types of students:
- Undergraduate Student  
- Graduate Student  
Each student type calculates tuition differently and includes specific attributes.

## Builder Design Pattern
-The Builder Pattern is used to construct student objects that contain both required and optional attributes.
-Instead of creating constructors with many parameters, each subclass provides its own static `Builder` class.
-Example usage from `Main.java`:
   Student undergraduate = new UndergraduateStudent.Builder()
        .studentId("U123")
        .name("Sinazo Ntsimbi")
        .email("sinazo@example.com")
        .department("Information Technology")
        .creditHours(20)
        .scholarshipAmount(2000)
        .build();
    
-The Builder Pattern was used to:
  -Improve readability
  -Avoid telescoping constructors
  -Make object creation flexible
  -Keep the code clean and maintainable

·The abstract base class:
  public abstract class Student
    -This class defines common attributes:
         studentId
         name
         email
         department
   -It also defines abstract methods:
         public abstract double calculateTuition();
         public abstract String getStudentType();
         public abstract void displayStudentDetails();


·The subclasses extend the Student class:
         public class UndergraduateStudent extends Student
         public class GraduateStudent extends Student
-This promotes code reuse and proper object-oriented structure.

·Polymorphism is achieved through method overriding.
   -Each subclass provides its own implementation of:
        calculateTuition()
        getStudentType()
        displayStudentDetails()
-In 'Main.java', both objects are referenced using the base class type:
      Student undergraduate = new UndergraduateStudent.Builder()...build();
      Student graduate = new GraduateStudent.Builder()...build();
-Even though they are different student types, they are treated as Student objects and this demonstrates runtime polymorphism.

SOLID Principles Applied

1. The Single Responsibility Principle states that a class should have only one reason to change.
In this project:
   -Students handle common student properties.
   -UndergraduateStudent handles undergraduate-specific logic.
   -GraduateStudent handles graduate-specific logic.
   -Builder classes are responsible only for constructing objects.
-For example, tuition calculation logic for graduates is handled only in GraduateStudent:
  @Override
  public double calculateTuition() {
     double baseTuition = 10000.0;
     if (researchAssistant) {
        return baseTuition - stipend;
    }
    return baseTuition;
 }
-Each class focuses on one responsibility, making the system easier to maintain and extend.


2.The Open/Closed Principle states that software should be open for extension but closed for modification.
The Student class is designed to be extended by new student types without modifying existing code., if a new PartTimeStudent class is needed:
   public class PartTimeStudent extends Student {
       // Custom implementation
   }
-No changes are required in the existing Student, UndergraduateStudent, or GraduateStudent classes.

·The principle states that objects of a superclass should be replaceable with objects of its subclasses without affecting correctness.
-In this system:
  Student student = new UndergraduateStudent.Builder()...build();
   or
  Student student = new GraduateStudent.Builder()...build();
-Both subclasses can be used wherever a Student object is expected and the program behaves correctly.

· How to Run the Program
  -Open the project in a Netbeans IDE 
  -Run Main.java.
Student details and calculated tuition will display in the console.

·This project demonstrates:
  -Proper implementation of the Builder Pattern
  -Effective use of Inheritance and Polymorphism
  -Application of SOLID principles 
  -Clean and extensible object-oriented design
The system is modular and can easily be extended to support additional student types in the future.

·Author 
Sinazo Ntsimbi
