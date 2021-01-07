package functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Settings {
    
    @SuppressWarnings("unused")
    public void loadtest() {
        Properties prop = new Properties();
        String fileName = "hero.config";
        String path = "src/resources/Config/hero.conf";
        InputStream is = null;
        try {
            is = new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            prop.load(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(prop.getProperty("app.name"));
        System.out.println(prop.getProperty("app.version"));
    }
}
