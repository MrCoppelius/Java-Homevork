package exams_generation;

import exams_generation.exercise_generator.ExerciseGenerator;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        ReflectionExerciseFactory factory = new ReflectionExerciseFactory();
        for (int i = 0; i < amount; ++i) {
            exercises.add(factory.createNewExercise());
        }
        return exercises;
    }
}
