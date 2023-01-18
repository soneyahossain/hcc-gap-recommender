package util;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Util {
    public static void search(final String pattern, final File slice_dir, List<String> all_slices) {

        for (final File f : slice_dir.listFiles()) {
            if (f.isDirectory()) {
                search(pattern, f, all_slices);
            }
            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    if (f.length() != 0) {
                        if (f.getAbsolutePath().contains("new_slices")) continue;
                        all_slices.add(f.getAbsolutePath());
                    }
                }
            }
        }
    }
}