import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //1. test pluralize

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        //2. test flipNHeads(2);
        flipNHeads(3);

        //3. test clock()
        clock();


    }


    public static String pluralize(String name, int n){
        if(n == 0 || n > 1){
            return  name + "s";
        }
        else{
            return name;
        }
    }

    public static void flipNHeads(int n){
        double toss;
        int heads = 0;
        int allFlips = 0;
        while(heads < n){
            // random number between 0 and 1
            toss = Math.random();
            allFlips+=1;
            if(toss > 0.5) {
                System.out.println("head");
                heads += 1;

            }else{
                heads = 0;
                System.out.println("tail");
            }
        }//end of while loop
        System.out.println("It took " + allFlips + " flips to flip " + n + " heads in a row.");
    }

    public static void clock(){
        LocalDateTime timeNow = LocalDateTime.now();
        int seconds = timeNow.getSecond();
        String time = "";
        while(true){
            timeNow = LocalDateTime.now();
            time = timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(timeNow.getSecond() - seconds == 0) {
                continue;
            }
            seconds = timeNow.getSecond();
            System.out.println(time);
        }
    }

}
