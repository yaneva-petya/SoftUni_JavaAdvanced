package Lectures.Generics.ArrayCreator_02;

public class Main {
    public static void main(String[] args) {
       String[] nones= ArrayCreator.create(10, "none");
        Integer[] zeroes= ArrayCreator.create(10, 0);
        //printArray(nones);
        //printArray(zeroes);
        String[] nones1= ArrayCreator.create(String.class,10, "none");
        Integer[] zeroes1= ArrayCreator.create(Integer.class,10, 0);
       printArray(nones1);
       printArray(zeroes1);
    }

    public static <T> void printArray(T[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
