package three.control;
//Odavdne počinje sljedeće predavanje

import javax.swing.JOptionPane;

public class IfElseIfDemo {
    public static void main(String[] args) {
        System.out.println("Profa unesite broj poena na ispit:");
        String profaUnio = JOptionPane.showInputDialog("Unesi profa broj poena:");
        int score = Integer.parseInt(profaUnio);
        char grade;
        if(score>=90){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >= 70 ){
            grade = 'C';
        }else if(score >=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Ocjena = " + grade);
    }
}
