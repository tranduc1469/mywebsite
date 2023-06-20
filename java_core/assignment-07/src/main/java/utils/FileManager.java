package utils;

import java.io.File;
import java.io.IOException;

public class FileManager {
    private static final String FILE_EXISTS = "Error! File Exist.";
    private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
    private static final String PATH_NOT_FOLDER = "Error! Path is not folder.";
    private static final String SOURCE_FILE_NOT_EXISTS = "Error! Source File Not Exist.";
    private static final String DESTINATION_EXISTS = "Error! new Path has File same name.";
    public static boolean isFileExists(String path){
        File file = new File(path);
        return file.exists();
    }

    public static boolean createNewFile(String path) throws IOException {
        if (isFileExists(path)){
            throw new IllegalStateException(FILE_EXISTS);
        }
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean deleteFile(String path){
        if (!isFileExists(path)){
            throw new IllegalStateException(FILE_NOT_EXISTS);

        }
        File file = new File(path);
        return file.delete();
    }
    public static boolean isFolder(String path){
        File file = new File(path);
        return file.isDirectory();
    }
    public static boolean isFile(String path){
        File file = new File(path);
        return file.isFile();
    }


    public static String[] getAllFileName(String path){
        if (!isFolder(path)){
            throw new IllegalStateException(PATH_NOT_FOLDER);
        }
        File file = new File(path);
        return file.list();
    }
    public static boolean copyFile(String from, String to){
        if(!isFileExists(from) ){
            throw new IllegalStateException(SOURCE_FILE_NOT_EXISTS);
        }
        if(isFileExists(to)){
            throw new IllegalStateException(DESTINATION_EXISTS);
        }
        File source = new File(from);
        File destination = new File(to);
        return source.renameTo(destination);
    }
}
