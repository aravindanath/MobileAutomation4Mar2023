package Mobile_Day5;

import mobile_day1.AppLaunch_GS;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExtractPageSource  extends AppLaunch_GS {

    @Test
    public void test1() throws IOException {

        String path = System.getProperty("user.dir")+File.separator+"src.xml";

        File file = new File(path);
        if(file.exists()){
            System.out.println("File exists");
        }else{
            file.createNewFile();
        }
        BufferedWriter bf = new BufferedWriter(new FileWriter(file));
       String pgSrc =  driver.getPageSource();

        bf.write(pgSrc);
        bf.flush();
        bf.close();
    }
}
