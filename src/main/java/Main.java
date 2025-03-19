// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Pisz: ");
    String text = scanner.nextLine();
    String upperCase = text.toUpperCase();
    System.out.println(upperCase);
    scanner.close();
  }
}

