package Lectures.StackAndQueue.Programs.Stack;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayDeque<String> historyStack=new ArrayDeque<>();

        String input=s.nextLine();
        while(!input.equals("Home")){

            if(!input.equals("back")){
                historyStack.push(input);
                System.out.println(historyStack.peek());
            }else{
                if(historyStack.size()>1){
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                }
                else{
                    System.out.println("no previous URLs");
                }
            }




            input=s.nextLine();

        }


    }
}
