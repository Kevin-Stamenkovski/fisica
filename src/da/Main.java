package da;
import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float v, s ,t;
        int a;
        boolean flag = false;
        System.out.println("select which one you want to find: ");
        System.out.println("1) V");
        System.out.println("2) S");
        System.out.println("3) T");

        while(!flag){
            a = input.nextInt();
            switch(a){
                case 1:
                    System.out.println("input S:");
                    s = input.nextFloat();
                    System.out.println("input T:");
                    t = input.nextFloat();
                    v = s / t;
                    System.err.println("V is: " + v);
                    // V = S / T;
                    flag = true;
                    break;
                case 2:
                    System.out.println("input V:");
                    v = input.nextFloat();
                    System.out.println("input T:");
                    t = input.nextFloat();
                    s = v / t;
                    System.err.println("S is: " + s);
                    // S = V * T;
                    flag = true;
                    break;
                case 3:
                    System.out.println("input S:");
                    s = input.nextFloat();
                    System.out.println("input v:");
                    v = input.nextFloat();
                    t = s / v;
                    System.err.println("t is: " + t);
                    // T = S / V;
                    flag = true;
                    break;
                default:
                    System.out.println("Wtf bro?");
                    break;
            }


        }
        System.out.println("finish");

    }
}
