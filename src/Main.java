import example.variables.Variables;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

         Variables score = new Variables();

         String note = JOptionPane.showInputDialog(null,"Insert the number");

         double calification = Integer.parseInt(note);


        System.out.println("The calification is " + calification);

    }
}