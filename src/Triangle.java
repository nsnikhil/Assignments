import util.GenericUtil;

import java.io.IOException;
import java.util.stream.Stream;

import static util.PrintUtil.newLine;

public final class Triangle extends ShapeDrawer {

    public static void main(String[] args) throws IOException {
        final Triangle triangle = new Triangle();

        triangle.printAsterisk();
        newLine();

        triangle.printVertical(GenericUtil.takeIntegerInput());
        newLine();

        triangle.printHorizontal(GenericUtil.takeIntegerInput());
        triangle.printRightTriangle(GenericUtil.takeIntegerInput());
    }

    private void printRightTriangle(int size) {
        Stream.iterate(0, i -> i + 1)
                .limit(size)
                .forEach(integer -> {
                    printVertical(integer + 1);
                    newLine();
                });
    }

}
