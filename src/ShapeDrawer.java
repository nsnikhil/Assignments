import util.PrintUtil;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static util.PrintUtil.ASTERISK;

class ShapeDrawer {

    void printAsterisk() {
        System.out.print(ASTERISK);
    }

    private void printMany(Supplier<String> supplier, int size, Consumer<String> consumer) {
        Stream.generate(supplier)
                .limit(size)
                .forEach(consumer);
    }

    void printVertical(int size) {
        printMany(() -> PrintUtil.ASTERISK, size, System.out::print);
    }

    void printHorizontal(int size) {
        printMany(() -> PrintUtil.ASTERISK, size, System.out::println);
    }

    void printVerticalSpace(int size) {
        printMany(() -> PrintUtil.SPACE, size, System.out::print);
    }

}