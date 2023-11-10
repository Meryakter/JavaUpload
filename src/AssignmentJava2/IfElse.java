package AssignmentJava2;


import java.util.Scanner;
public class IfElse {

    public static void main(String[] args) {
        System.out.println("enter your score" + ": ");
        Scanner m=new Scanner(System.in);
        int score =m.nextInt();
        if (score<=100 && score>=90) {
            System.out.println("Your Grade is A");
        }
        else if(score<=89 && score>=80) {
            System.out.println("Your Grade is B");
        }
        else if (score<=79 && score>=70) {
            System.out.println("Your Grade is C");
        }
        else if (score<=69 && score>=50) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is fail");
        }
    }
}

