import java.util.*;
import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner pobierz = new Scanner(System.in);
    double a,b;
    System.out.println("Liczba");
      a = pobierz.nextInt();
    System.out.println("Druga liczba");
      b = pobierz.nextInt();
    {
      double wynik;
      wynik = Math.sqrt(a) + Math.sqrt(b);
      System.out.println(wynik); 
    }  
    }
}
