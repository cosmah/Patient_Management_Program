package patients;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //scanner api
        Scanner scanner = new Scanner(System.in);

        //patient information
        Patient patient = new Patient("John",23);
        
        //eye diagnosis
        Eyes eyes = new Eyes("Blue", "Photo-sensitivity");

        //arm diagnostic
        Arms arms = new Arms(2, "left hand", "Broken bone");

        System.out.println("========DOCTOR WHO======");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        System.out.println("==========Select Body Part Diagnosis========");

        while (true) {
            // Choices
            System.out.println(" 1.Arms \n 2.Eyes  \n 3.Heart \n 4.Kidney \n 5.Legs \n 6.Stomach \n 7.Quit");

            // User choice
            byte choice = scanner.nextByte();
            byte back = scanner.nextByte();

            switch (choice) {
                case 1:
                    // Implement logic for Arms
                    System.out.println("Number of arms: " + arms.getNumberOfArms() );
                    System.out.println("Faulty side: " + arms.getSideWithProblem());
                    System.out.println("Diagnosis: " + arms.getDiagnosis());
                    System.out.println("Click 3 to go back");
                    if (back == 3) {
                        continue; // This will go back to the beginning of the loop
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    // Implement logic for Eyes
                    System.out.println("Eye color: " + eyes.getEyeColor());
                    System.out.println("Diagnosis: " + eyes.getDiagnosis());
                    System.out.println("Click 3 to go back");

                    if (back == 3) {
                        continue; // This will go back to the beginning of the loop
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 3:
                    // Implement logic for Heart
                    break;
                case 4:
                    // Implement logic for Kidney
                    break;
                case 5:
                    // Implement logic for Legs
                    break;
                case 6:
                    // Implement logic for Stomach
                    break;
                case 7:
                    System.out.println("Quitting program...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice, please select a valid option.");
            }
        }
    }
}

