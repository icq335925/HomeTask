package FileDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by ITEA on 11.12.2014.
 */
public class FileDemo {
    static String path = "G:\\Work\\txt";

    public static void main(String[] args) {
        File file = new File(path);
        FilenameFilter filter = new MyFilter();
     //   File[] ar = file.listFiles(filter);
     //   System.out.println(Arrays.toString(ar));
        String[] arr1 = file.list(filter);// вызывается filter.accept(текущий_файл)
        System.out.println(Arrays.toString(arr1));

    }
}
