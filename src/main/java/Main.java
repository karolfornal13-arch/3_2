import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj dwie liczby do sumowania:");
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextFloat();
    scanner.nextLine();
    System.out.println(a);
  }
}