package four;

import javax.swing.JOptionPane;

public class IfElseIfDemo {
    public static void main(String[] args) {
        String scoreTextInput = JOptionPane.showInputDialog("Profa unesi kolko sam poena postigao na ispitu");
        int testScore = Integer.parseInt(scoreTextInput);
        char grade;
        if(testScore>=90){
            grade = 'A';//10
        }else if(testScore >=80){
            grade = 'B';//9
        }else if(testScore >=70){
            grade = 'C';//8
        }else if(testScore >=60){
            grade = 'D';//7
        }else{
            grade = 'F';//6
        }
        System.out.println("Grade = " + grade);
    }
}
