package ohtu;

public class Submission {

    private String student_number;
    private int week;
    private int hours;
    private Boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getWeek() {
        return week;
    }

    public int getHours() {
        return hours;
    }

    public int nroOfExercisesDone() {
        int sum = 0;
        int[] exercises = exercises();
        for (int i = 0; i < exercises.length; i++) {
            sum += exercises[i];
        }
        return sum;
    }
    
    private int[] exercises() {
        int [] exercises = new int[12];
        exercises[1] += toInt(a1);
        exercises[2] += toInt(a2);
        exercises[3] += toInt(a3);
        exercises[4] += toInt(a4);
        exercises[5] += toInt(a5);
        exercises[6] += toInt(a6);
        exercises[7] += toInt(a7);
        exercises[8] += toInt(a8);
        exercises[9] += toInt(a9);
        exercises[10] += toInt(a10);
        exercises[11] += toInt(a11);
        return exercises;
    }

    private int toInt(Boolean b) {
        if (b != null && b) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int[] exercises = exercises();
        sb.append("viikko ").append(week).append(": tehtyjä tehtäviä yhteensä: ").append(nroOfExercisesDone()).append(", aikaa kului ").append(hours).append(" tuntia, tehdyt tehtävät: ");
        for (int i = 0; i < exercises.length; i++) {
            if (exercises[i] == 1) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }
}
