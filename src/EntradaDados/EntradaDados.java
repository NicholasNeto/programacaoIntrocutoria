package EntradaDados;

import java.util.Scanner;

public class EntradaDados {

    public int getDados(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        reader.close();
        return n;
    };
};


