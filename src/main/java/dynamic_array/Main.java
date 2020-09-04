package homework;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArrayImp myArray = new DynamicIntegerArrayImp();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        for (int i = 0; i < 10; ++i) {
            myArray.add(i);
        }
        System.out.println(myArray.size());
        System.out.println(myArray.get(0) + " " +myArray.get(myArray.size()/2)+ " " + myArray.get(myArray.size()-1));
        System.out.println(myArray);

    }
}
