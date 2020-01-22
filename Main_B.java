package hw34;

import java.util.ArrayList;
import java.util.Random;

public class Main_B {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random i = new Random();
        System.out.print("\nРандомные числа :");
        for (int j = 0; j <50 ; j++) {
            list.add(i.nextInt(100-1)+1);
            System.out.print(list.get(j)+" ");

        }
        ArrayList<Integer> even =  new ArrayList<>();
        System.out.print("\nЧетные :");
        for ( int a : list ) {
            if ( a % 2== 0 ){
                even.add(a);
                System.out.print( a +"," );
            }
        }

        ArrayList<Integer> odd =  new ArrayList<>();
        System.out.print("\nНечетные :");
        for ( int b : list ) {
            if ( b % 2== 1 ){
                odd.add(b);
                System.out.print( b +"," );
            }
        }

    }
}
