import java.util.Objects;
import java.util.Scanner;

public class University_Cost_App {

    static Scanner in = new Scanner(System.in);
    private static double accomodationCost;


    public static void main(String[] args) {
        String studentName = getStudentName();
        int yearOfStuudy = getYear();
        double costOfTextBooks = getCostOfTextbooks();
        int creditPerHours = getNumberOfCreditHours();
        double costPerCredit = getCostOfCredits();
        System.out.println("Are you staying in a dorm (yes/no)");
        String stayingDorm = in.next();
        if (Objects.equals(stayingDorm, "yes")) {
            accomodationCost = getStudentStay();
        } else {
            accomodationCost = 0;
        }
        double overallCost = (costOfTextBooks + (costPerCredit * creditPerHours) + accomodationCost);
        System.out.println("Hi " + studentName + " After your answers the total amount of your year " + yearOfStuudy + " will be: ");
        System.out.println(overallCost);
    }

    public static String getStudentName() {
        System.out.println("Enter your name: ");
        String studentName = in.next();
        return studentName;
    }

    public static int getYear() {
        System.out.println("Enter your year of study (in number): ");
        int yearOfStudy = in.nextInt();
        return yearOfStudy;
    }

    public static double getCostOfTextbooks() {
        System.out.println("Enter the cost of your textbooks: ");
        double costOfTextbooks = in.nextDouble();
        return costOfTextbooks;
    }

    public static int getNumberOfCreditHours() {
        System.out.println("Enter the number of credit hours: ");
        int numberOfCreditHours = in.nextInt();
        return numberOfCreditHours;
    }

    public static double getCostOfCredits() {
        System.out.println("Enter the cost of credits: ");
        double costOfCredits = in.nextDouble();
        return costOfCredits;
    }

    public static double getStudentStay() {
        System.out.println("Enter amount of weekly expenses: ");
        double costOfWeeklyExpenses = in.nextDouble();
        System.out.println("Enter how many weeks will you be living in the dorm: ");
        int weeksLivingInDorm = in.nextInt();
        double totalDormExpenses = costOfWeeklyExpenses * weeksLivingInDorm;
        return totalDormExpenses;
    }
}