import util.GenericUtil;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeFactors {

    public static void main(String[] args) throws IOException {
        System.out.print(new PrimeFactors().generate(GenericUtil.takeIntegerInput()));
    }

    private List<Integer> generate(int n) {
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .filter(integer -> n % integer == 0)
                .sorted()
                .collect(Collectors.toList());
    }

}
