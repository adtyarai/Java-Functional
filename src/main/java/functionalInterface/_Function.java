package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main (String[] args) {

        //Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(increment);
        System.out.println(apply);

        int multiplyBy10 = multiplyByTenFunction.apply(apply);
        System.out.println(multiplyBy10);

        Integer andBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction).apply(4);
        System.out.println(andBy1AndThenMultiplyBy10);

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer, Integer> multiplyByTenFunction = n -> n * 10;

    static int incrementByOne (int number) {
        return number+1;
    }

    //for two arguments in a func we use BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            ( numberToIncrementByOne, numToMultiplyBy )
                    -> (numberToIncrementByOne+1) * numToMultiplyBy;

    static int incrementByOneAndMultiply (int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
