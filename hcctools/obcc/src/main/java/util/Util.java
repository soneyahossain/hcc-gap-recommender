package util;

import java.io.File;
import java.util.List;

public class Util {
    public static void search(final String pattern, final File slices, List<String> result) {

        for (final File f : slices.listFiles()) {
            if (f.isDirectory()) {
                search(pattern, f, result);
            }
            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    if (f.length() != 0) {
                        if(f.getAbsolutePath().contains("new_slices")) continue;
                        result.add(f.getAbsolutePath());
                    }
                }
            }
        }
    }
}