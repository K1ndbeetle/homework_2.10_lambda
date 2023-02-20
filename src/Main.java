import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        Predicate<Integer> predicateA = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };
        System.out.println(predicateA.test(-11));
        System.out.println(predicateA.test(11));
        System.out.println();

        Predicate<Integer> predicateL = x -> x >= 0;
        System.out.println(predicateL.test(11));
        System.out.println(predicateA.test(-11));
        System.out.println();

        System.out.println("Задание №2");

        Consumer<String> consumerA = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println("Здравствуйте" + ", " + s + "!");
            }
        };
        consumerA.accept("Дарья");
        System.out.println();

        Consumer<String> consumerL = x -> System.out.println("Здравствуйте" + ", " + x + "!");
        consumerL.accept("Юлия");
        System.out.println();

        System.out.println("Задание №3");

        Function<Double, Long> functionA = new Function<>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };
        System.out.println(functionA.apply(41.1234567));
        System.out.println();

        Function<Double, Long> functionL = x -> Math.round(x);
        System.out.println(functionL.apply(29.7654321));
        System.out.println();

        System.out.println("Задание №4");

        Supplier<Integer> supplierA = new Supplier<>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(supplierA.get());
        System.out.println();

        Supplier<Integer> supplierL = () -> (int) (Math.random() * 100);
        System.out.println(supplierL.get());
        System.out.println();

    }
}