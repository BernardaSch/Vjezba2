import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj = 1;
        int zbroj = 0;

        while(broj != 0) {
            System.out.println("Unesite broj: ");
            broj = sc.nextInt();
            zbroj = zbroj + broj;
        }
        System.out.println("Zbroj brojeva je: " + zbroj);
    }
}