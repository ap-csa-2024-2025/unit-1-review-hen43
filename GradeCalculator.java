public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "Fortnite 90 Cranking Bootcamp";
    int courseMinutesWeekly = 333;
    int hw1 = 58;
    int hw2 = 80;
    int hw3 = 100;
    int hw4 = 67;
    double quiz1 = 70.8;
    double quiz2 = 88.9;
    double final1 = 60.5;
    int avghw = (hw1 + hw2 + hw3 + hw4)/4;
    double avgquiz = (quiz1 + quiz2)/2;

    System.out.println(courseName);
    System.out.println("Average time spent: " + (int)(courseMinutesWeekly/60) + " hours, " + courseMinutesWeekly % 60 + " minutes.");
    System.out.println("Homework grades:");

    System.out.println("Average HW Grade: " + avghw);
    System.out.println("Average Quiz Grade: " + avgquiz);
    System.out.println("Final Exam Score: " + final1);
    
    System.out.println("Final Grade: " + (int)((avghw * 0.35)+(avgquiz * 0.15)+(final1 * 0.50)+0.5));
  }
}
