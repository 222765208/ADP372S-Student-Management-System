/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studentmanagementsystem;

/**
 *
 * @author Sinazo Ntsimbi
 */
public class UndergraduateStudent extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        super(builder);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double tuitionPerCredit = 500.0;
        return (creditHours * tuitionPerCredit) - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: " + scholarshipAmount);
        System.out.println("Total Tuition: " + calculateTuition());
        System.out.println("--------------------------------------");
    }

    // Builder
    public static class Builder extends Student.Builder<Builder> {

        private int creditHours;
        private double scholarshipAmount;

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
    
    
    
    
    
    
