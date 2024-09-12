public class GradeCalculator
{
  static double listAverage(double[] list){
    double var = 0;
    for (double i : list){
      var += i;
    }
    var /= list.length;
    return var;
  }

  public static void main(String[] args)
  {
    String courseName = "Fortnite 90 Cranking Bootcamp";
    int courseMinutesWeekly = 333;
    int[] homeworkScores = new int[]{58, 80, 100, 67};
    double[] quizScores = new double[]{70.8, 88.9};
    double finalScore = 60.5;

    System.out.println(courseName);
    System.out.println("Average time spent: " + (int)(courseMinutesWeekly/60) + " hours, " + courseMinutesWeekly % 60 + " minutes.");
    System.out.println(listAverage(homeworkScores));
    System.out.println(listAverage(quizScores));
  }
}
