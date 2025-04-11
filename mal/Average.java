import java.util.Scanner;

public class Average {
    private int noOfStudents = 0;
    private double totalMarks = 0;
    private double avg;
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // LicenseTestAverage myObj = new LicenseTestAverage();
        
        // while (myObj.getNoOfStudents() < 10) {
        //     System.out.print("Enter marks for student #" + (myObj.getNoOfStudents()+1) + ": ");
        //     int grade = input.nextInt();
        //     switch (grade) {
        //         case 1:
        //             myObj.setPassedStudents(myObj.getPassedStudents() + 1);
        //             break;
        //         case 2:
        //             myObj.setFailedStudents(myObj.getFailedStudents() + 1);
        //             break;
        //         default:
        //             System.out.println("Invalid entry. Please enter again.");
        //             continue;
        //     }
        //     myObj.setNoOfStudents(myObj.getNoOfStudents() + 1);
        // }

        // myObj.displaySummary();
        // if(myObj.getPassedStudents() > 8) {
        //     System.out.println("Instructor deserves a bonus!");
        // }

        // input.close();
    }
}

class LicenseTestAverage {
    private int noOfStudents = 0;
    private int passedStudents = 0;
    private int failedStudents = 0;

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void setPassedStudents(int passedStudents) {
        this.passedStudents = passedStudents;
    }

    public void setFailedStudents(int failedStudents) {
        this.failedStudents = failedStudents;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public int getPassedStudents() {
        return passedStudents;
    }

    public int getFailedStudents() {
        return failedStudents;
    }

    public void displaySummary() {
        System.out.printf("Total Students: %d \nNo. of passed students: %d \n No. of failed Students: %d\n", noOfStudents, passedStudents, failedStudents);
    }

}