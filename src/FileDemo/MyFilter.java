package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by ITEA on 11.12.2014.
 */
public class MyFilter implements FilenameFilter {
    public boolean accept(File dir, String name ){
       File file = new File(dir.getAbsolutePath()+"\\"+name);
        return file.isDirectory();
       /*
        if(name.contains(".")) {
            System.out.println(name);
            return true;
        }else
            return false;
            */

    }
}
