/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.cput.studentmanagementsystem;

/**
 *
 * @author Sinazo Ntsimbi
 */
public class Main {

    public static void main(String[] args) {

        Student undergraduate = new UndergraduateStudent.Builder()
                .studentId("U123")
                .name("Sinazo Ntsimbi")
                .email("sinazo@example.com")
                .department("Information Technology")
                .creditHours(20)
                .scholarshipAmount(2000)
                .build();

        Student graduate = new GraduateStudent.Builder()
                .studentId("G456")
                .name("John Smith")
                .email("john@example.com")
                .department("Computer Science")
                .researchAssistant(true)
                .stipend(3000)
                .build();

        // Polymorphism in action
        undergraduate.displayStudentDetails();
        graduate.displayStudentDetails();
    }
}
