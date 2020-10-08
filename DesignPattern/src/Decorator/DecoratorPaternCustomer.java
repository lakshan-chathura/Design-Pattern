package Decorator;

import java.util.Scanner;

public class DecoratorPaternCustomer {

    public static void main(String[] args) {
        System.out.print("========= Chrismas Tree ============ \n");



        System.out.print("Enter your choice: ");
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        while(a!=3){
            if(a==1){
                System.out.print("            1. Tinsel Tree.   \n");
                ChrismasTree chrismasTree=new Tinsel(new ChrismasTreeImple());
                System.out.println(chrismasTree.decorate());
                System.out.println();
            }else{
                System.out.print("            2. TreeTopper Food.\n");
                ChrismasTree chrismasTree=new TreeTopper(new ChrismasTreeImple());
                System.out.println(chrismasTree.decorate());
                System.out.println();
            }

        break;

        }
    }
}
