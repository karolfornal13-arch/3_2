import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj dwie liczby do sumowania:");
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    System.out.println(a);
    StringBuilder wynik = new StringBuilder();
      for (char znak : a.toCharArray()) {
          if (Character.isUpperCase(znak)) {
              wynik.append(Character.toLowerCase(znak));
          } else if (Character.isLowerCase(znak)) {
              wynik.append(Character.toUpperCase(znak));
          } else {
              wynik.append(znak); // cyfry, spacje i znaki interpunkcyjne bez zmian
          }
      }

      System.out.println(wynik.toString());
  }
}