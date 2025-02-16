package Excercises.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        StringBuilder text=new StringBuilder();
        ArrayDeque<String> stack=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            String[] command=s.nextLine().split("\\s+");
            int name=Integer.parseInt(command[0]);

            switch (name){
                case 1->{
                    stack.push(text.toString());
                    text.append(command[1]);
                }
                case 2->{
                    stack.push(text.toString());
                    int count=Integer.parseInt(command[1]);
                    int startIndex=text.length()-count;
                    text.delete(startIndex, text.length());
                }
                case 3->{
                    int index=Integer.parseInt(command[1])-1;
                    System.out.println(text.charAt(index));
                }
                case 4->{
                    text=new StringBuilder(stack.pop());
                }
            }
        }
    }
}
