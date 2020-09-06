package exams_generation.exercise_generator;

import exams_generation.Exercise;
import exams_generation.Operator;
import exams_generation.RandomUtil;

import java.util.Random;

public class SubstractionExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        BinaryOperationGenerator generator = new BinaryOperationGenerator();
        generator.generateNumbers();
        return (Exercise.builder()
                .a(generator.getA())
                .b(generator.getB())
                .operator(Operator.MINUS)
                .answer(generator.getA() - generator.getB())
                .build());
    }
}
