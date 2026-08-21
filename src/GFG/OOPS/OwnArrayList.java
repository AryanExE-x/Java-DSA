package GFG.OOPS;
import java.util.*;
class Arraylist{ /*user defined data structure*/
    int[] arr;
    int idx=0;
    int size=0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }
    int get(int idx){
        return arr[idx];
    }
    void capacityIncrease(){
        int[] bigArr= new int[arr.length*2];
        for(int i=0;i<arr.length;i++){ //? copying el from arr to bigArr
            bigArr[i]=arr[i];
        }
        arr=bigArr; /****this means arr is pointing-> to bigArr*/ /*!SUPERIMPORTANT*/
    }
    void add(int ele){
        if(idx==arr.length){ //? it means array is full
            capacityIncrease();
        }
        arr[idx]=ele;  /*initially idx=0 it will add element and increment index and size*/
        idx++;
        size++;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    public static void main(String[] args){
        Arraylist arr = new Arraylist(4);
        System.out.println(arr.capacity());
        System.out.println(arr.size);
        arr.add(5);arr.add(6);arr.add(9);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(0));
    }
}
