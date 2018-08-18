package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class GenericUtil {

    private static BufferedReader bufferedReader;

    private static BufferedReader getBufferedReader() {
        if (bufferedReader == null) bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader;
    }

    public static int takeIntegerInput() throws IOException {
        return Integer.parseInt(takeStringInput());
    }

    public static String takeStringInput() throws IOException {
        return getBufferedReader().readLine();
    }

}
