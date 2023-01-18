package util;

import java.io.File;
import java.util.List;

public class Util {

    public static void search(final String pattern, final File folder, List<String> result) {

        for (final File f : folder.listFiles()) {
            if (f.isDirectory()) {
                search(pattern, f, result);
            }
            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    if (f.length() != 0)
                        result.add(f.getAbsolutePath());
                }
            }
        }
    }
}
