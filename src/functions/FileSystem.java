package functions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileSystem {
    /**
     * Creates local filesystem on computer and loads save files
     */

    String PCName;
    String OSName;
    Boolean isWin;
    String finalPath;
    Boolean fsExists;

     public void checkFS(String path) {

        boolean temp = new File(path).isFile();
        System.out.println("User file exists: " + temp); //PRINT User file exists
        fsExists = temp;

     }

     public void createFS() {
        getOS();
        createFsPath();

        //copyFiles("hero.conf", "Config");
        //copyFiles("enemy.conf", "Config");
        

     }

     private void copyFiles(String fileName, String type) {

        //Path source = null;
        System.out.println("Hello 1");
        //rwjsu.getOSVersion();
        String OS = OSName;
        String fullPath;
        
        fullPath = finalPath +fileName;

        System.out.println("Hello 2");

        Path destination = Paths.get(fullPath); //"C:\\Test\\TA\\Data\\" + fileName

        try (InputStream stream = ClassLoader.class.getResourceAsStream("src/resources/Config/hero.config")) { //Fsdfsd
            Files.copy(stream, destination);
            System.out.println("Copy complete");
        } catch (IOException e) {
            System.out.println("Copy failed");
            e.printStackTrace();
        }

    }


     private String getOS() {
        String os_name = null;
        os_name = System.getProperty("os.name");
        System.out.println("OS name is: " + os_name); //PRINT OS name is
        OSName= os_name;
        return os_name;
     }

     private void createFsPath() {
        String homePath;
        if (OSName.equals("Windows 10") || OSName.equals("Windows 8") || OSName.equals("Windows 7")) {
            homePath = "C:\\NPN\\Venture\\Data";
            isWin = true;
        } else {
            isWin = false;
            homePath = System.getProperty("user.home") + "/NPN/Venture/Data/";
        }

        System.out.println("Home dir path: " + homePath); //PRINT Home dir
        File fileDir = new File(homePath);
        if (!fileDir.exists()) fileDir.mkdirs(); //Might be an issue
        finalPath = homePath;
     }




     /*
    public void jsonPathMaker(String name) { //----------------------------JSON PATH MAKER---------------------------------
        String tempPath = "";
        if (osName.equals("Windows 10") || osName.equals("Windows 8") || osName.equals("Windows 7")) {
            tempPath = finalPath + "\\";
        } else {
            tempPath = finalPath + "/";
        }

        if ("User".equals(name)) {
            UserFilePath = tempPath + name + ".json";
        } else {
            System.out.println("jsonPathMaker can't detect file name"); //PRINT JPM cant detect file name
        }
        System.out.println(name +" JSON file path is: " +UserFilePath); //PRINT finalPath
    }
    */

    
}
