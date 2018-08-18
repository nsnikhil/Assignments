import util.GenericUtil;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static util.PrintUtil.newLine;

public final class Diamond extends ShapeDrawer {

    public static void main(String[] args) throws IOException {
        final Diamond diamond = new Diamond();
        diamond.printIsoscelesTriangle(GenericUtil.takeIntegerInput());
        diamond.printDiamond(GenericUtil.takeIntegerInput());
        diamond.printDiamondWithName(GenericUtil.takeIntegerInput(), GenericUtil.takeStringInput());
    }

    @Override
    void printVertical(int size) {
        super.printVertical(size);
    }

    private void printUtility(int seed, UnaryOperator<Integer> hasNext, int size, Consumer<Integer> consumer) {
        Stream.iterate(seed, hasNext)
                .limit(size)
                .forEach(consumer);
    }

    private void printIsoscelesTriangle(int size) {
        printUtility(0, i -> i + 1, size, integer -> {
            printVerticalSpace(size - integer - 1);
            printVertical((integer * 2) + 1);
            newLine();
        });
    }

    private void printDiamond(int size) {
        printIsoscelesTriangle(size);
        printBottom(size);
    }

    private void printBottom(int size) {
        printUtility(size, i -> i - 1, size - 1, integer -> {
            printVerticalSpace((size - integer) + 1);
            printVertical((integer * 2) - 3);
            newLine();
        });

    }

    private void printDiamondWithName(int size, String name) {
        printUtility(0, i -> i + 1, size - 1, integer -> {
            printVerticalSpace(size - integer - 1);
            printVertical((integer * 2) + 1);
            newLine();
        });
        System.out.println(name);
        printBottom(size);
    }

}
