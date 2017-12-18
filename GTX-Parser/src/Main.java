import java.io.File;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import guitartex2.GTXParser;
import java.nio.charset.StandardCharsets;
import java.io.FileInputStream;


public class Main {

  public static Path recursiveRootSearch(File file){
    if(file.getParentFile().getName().equals("gtx")){
      return file.getParentFile().getParentFile().toPath();
    }
    else return recursiveRootSearch(file.getParentFile());
  }

  public static void main(String[] args) {
    if (args.length != 3) {
              if (args[0].equals("-o")){
                String inputFileName = args[1];
                  if (!inputFileName.equals("")) {
                    try{
                      File inputFile = new File(inputFileName);
                      String content = new Scanner(new FileInputStream(inputFile),"UTF-8").useDelimiter("\\Z").next();
                      System.out.println(content);
                      GTXParser mGTXParser = new GTXParser(content);
                      mGTXParser.convertToTeX();
                      String output = mGTXParser.getMyTeXFile();
                      if (inputFileName.endsWith(".gtx")||inputFileName.endsWith(".gtb")){
                        // split filename into root, folders and filename and add outputfile to a tex folder
                        String rootname = recursiveRootSearch(inputFile).toString();
                        System.out.println("Rootname: "+rootname);
                        inputFileName = inputFile.getName();
                        String baseName = inputFileName.substring(0,inputFileName.length()-4);                
                        System.out.println("Basename: " +baseName);
                        
                        try{
                          Files.write(Paths.get(rootname,"tex",baseName+".tex"), output.getBytes("UTF-8"));
                          // everything went fine
                          System.exit(0);
                        } catch (IOException e){
                          e.printStackTrace();
                        }
                      } else {
                        System.out.println("File should end on .gtx or .gtb");
                      }   
                    } catch (FileNotFoundException e) {
                      e.printStackTrace();
                    }                              
                  }
                }
                     
    } else{
      System.out.println("Syntax is: java Main -o <inputfilename>");
    }
  }
}

