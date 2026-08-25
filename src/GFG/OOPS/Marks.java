package GFG.OOPS;

import xCHALLENGES_01.StudentScoreTernary;


public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int [s];
        }
        void print(){
            for(int i=0;i<this.marks.length;i++){
                System.out.print(this.marks[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        StudentData s1 = new StudentData(5);
        StudentData s2 = new StudentData(2);
        s1.marks[0]=89;
        s1.marks[1]=91;
        s1.marks[2]=98;
        s1.marks[3]=90;
        s1.marks[4]=80;
        s1.print();

    }
}
