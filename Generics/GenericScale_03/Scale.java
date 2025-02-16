package Lectures.Generics.GenericScale_03;


public class Scale <T extends Comparable>{
    private T left;
    private T right;


   public Scale(T left,T right){
       this.left=left;
       this.right=right;
   }

   public  T getHeavier() {
   int result=left.compareTo(right);
       //0 -> when the objects are equals;
       // 1 -> when the first object is bigger than the second
       // -1 -> when the second object in bigger than the first

       if(result==0){
           return null;
       }else if(result==1){
           return left;
       }else return right;
   }
}
