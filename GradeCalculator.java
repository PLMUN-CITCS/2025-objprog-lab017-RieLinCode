import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = getStudentScore();
        String grade = calculateGrade(score); 
        
        System.out.println("Your grade is: " + grade); 
    }
    
    public static int getStudentScore() {
        Scanner userInput = new Scanner(System.in);
        int score;
        
        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Integer.parseInt(userInput.nextLine());
                
                if (score < 0 || score > 100) {
                    System.out.println("Please enter a valid score between 0 and 100.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        
        return score;
    }
    
    public static String calculateGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}
