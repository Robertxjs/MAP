import java.util.Arrays;

public class Aufgabe1 {
    public int[] failingGrades(int[] grades) {
        int[] failingGradesList = new int[grades.length];
        int ct = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                failingGradesList[ct] = grades[i];
                ct++;
            }
        }

        int result[] = new int[ct];
        for (int i = 0; i < ct; i++) {
            result[i] = failingGradesList[i];
        }

        return result;
    }

    public double averageGrade(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public int[] roundedGrades(int[] grades) {
       int[] roundedList = new int[grades.length];
       for (int i = 0; i < grades.length; i++) {
             int g = grades[i];
                if (g >= 38) {
                    int nextMultipleOf5 = ((g / 5) + 1) * 5;
                    if (nextMultipleOf5 - g < 3) {
                        g = nextMultipleOf5;
                    }
                }
                roundedList[i] = g;
       }
         return roundedList;
    }

    public int maxRoundedGrade(int[] grades) {
        int [] rounded = roundedGrades(grades);
        Arrays.sort(rounded);
        return rounded[rounded.length - 1];
    }
}
