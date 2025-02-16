package Lectures.Generics.ArrayCreator_02;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int length, T item){

        //T[] array=(T[])new Object[length];
        T[] array=(T[]) Array.newInstance(item.getClass(), length);
        for (int i=0;i<array.length;i++){array[i]=item;}

        return array;
    }
    public static <T> T[] create(Class<T> clazz, int length, T item){
        T[] array=(T[]) Array.newInstance(item.getClass(), length);

        for (int i=0;i<array.length;i++){
            array[i]=item;
        }
        return array;
    }
}
