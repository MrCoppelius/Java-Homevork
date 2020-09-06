//doesn't use, but might be good idea ?
package exams_generation.exercise_generator;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;


public class BinaryOperationGenerator implements NumbersGenerator{
    @Getter
    private double a,b;
    private final Random random = new Random();
    @Override
    public void generateNumbers() {
        a = random.nextInt(1000);
        b = random.nextInt(1000);
    }
}
