import java.util.Scanner;
public class Main {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      int eingabe = scanner.nextInt();
      switch(eingabe) {
        case 1: {
            System.out.println("The mandalorian");
            break; 
        }
        case 2: {
            System.out.println("The joker");
            break;
        }
        case 3: {
            System.out.println("Kingsman");
            break;
        }

      }
    }
}