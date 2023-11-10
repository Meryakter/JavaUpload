package AssignmentJava2;




public class WhileLoop {
    public static void main(String[] args) {

int totalTime= 0;
int limit =300;
        int movieDuration =120;
        while (totalTime + movieDuration <=limit){
            totalTime+=movieDuration;
            System.out.println("Enjoy the movie");
        }
        System.out.println("Total movie time exceeds the limit " );


    }
}//checking condition printout the line
//if its true gives answer