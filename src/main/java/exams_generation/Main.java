package exams_generation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator exam = new Examinator();
        int amount = 10;
        List<Exercise> exercises = exam.generate(amount);
        for ( Exercise exercise : exercises){
            System.out.println(exercise.getA()+" "+exercise.getOperator()+" "+exercise.getB()+"="+exercise.getAnswer());
        }
    }
}
