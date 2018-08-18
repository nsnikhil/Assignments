import java.util.stream.Stream;

public class FizzBuzzGame {

    public static void main(String[] args) {
        new FizzBuzzGame().FizzBuzz();
    }

    private void FizzBuzz() {
        Stream.iterate(1, i -> i + 1)
                .limit(100)
                .forEach(integer -> System.out.println(printUtil(integer)));
    }

    private String printUtil(int no) {
        if (no % 3 == 0) return "Fizz";
        if (no % 5 == 0) return "Buzz";
        return String.valueOf(no);
    }
}
