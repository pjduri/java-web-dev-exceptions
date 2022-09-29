package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        // Write code here!
        int z;
        x = 6;
        if (y == 0) {
            try {
                new ArithmeticException("You can't divide by 0!!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        z = x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.contains(".java")) {
            return 1;
        } else if (!fileName.contains(".java")) {
            return 0;
        }

    }

}
