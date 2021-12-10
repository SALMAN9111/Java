package com.monocept.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileTest {

  public static void main(String[] args) {
    
                 
    try {
      Files.walk(Paths.get("D:\\swabha Tech"))
       .sorted((o1, o2) -> {
        try {
          return Long.signum(Files.size(o2) - Files.size(o1));
        } catch (IOException e) {
          e.printStackTrace();
        }
        return 0;
      })
       .limit(10)
       .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
