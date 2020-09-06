package exams_generation;


import exams_generation.exercise_generator.ExerciseGenerator;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;

import static exams_generation.RandomUtil.randomItem;

public class ReflectionExerciseFactory {
    private final Reflections scanner = new Reflections("exams_generation.exercise_generator");
    private final List<Class<? extends ExerciseGenerator>> classes =
            new ArrayList<>(scanner.getSubTypesOf(ExerciseGenerator.class));


    @SneakyThrows
    public Exercise createNewExercise() {
        return randomItem(classes).getDeclaredConstructor().newInstance().generate();
    }
}
