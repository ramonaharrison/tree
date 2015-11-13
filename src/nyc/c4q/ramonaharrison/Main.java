package nyc.c4q.ramonaharrison;

import java.io.File;

public class Main {

    public static void main(String[]args)
    {
        File curDir = new File(".");
        getAllFilse(curDir);
    }
    private static void getAllFilse(File curDir) {

        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                //System.out.println("FOLDER:" + f.getName());
                getAllFilse(f);
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }

    }

}
