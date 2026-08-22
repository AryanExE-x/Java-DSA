package GFG.OOPS.RuntimePolymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Animal animal;
        System.out.println("Enter a choice among 1 and 2: ");
        int n = input.nextInt();

        if(n==1){
            animal = new Dog();
            animal.speak();
        }
        else{
            animal = new Cat();
            animal.speak();
        }
    }
}
