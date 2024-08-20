import java.util.Scanner;

public class Main {
    static B10toBinary binary=new B10toBinary();

    static void teste(Integer A){
        B10toBinary.B10toB2(A);
    }

    public static void main(String[] args) {
        System.out.print("Escolha o número: ");
        Scanner scanner = new Scanner(System.in);
        Integer Number = scanner.nextInt();
        teste(Number);
        scanner.close();
    }
  }