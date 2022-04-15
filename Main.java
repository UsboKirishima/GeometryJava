import java.util.Scanner;

public class Main {
  public static void genSquare() {
    for (int i = 0; i < 30; i++) {
      if (i == 0) {
        System.out.print("╔");
      } else if (i == 29) {
        System.out.print("╗");
      } else {
        System.out.print("═");
      }
    }
    System.out.print("\n");
    for (int i = 0; i < 12; i++) {
      System.out.print("║                            ║\n");
    }
    for (int i = 0; i < 30; i++) {
      if (i == 0) {
        System.out.print("╚");
      } else if (i == 29) {
        System.out.print("╝");
      } else {
        System.out.print("═");
      }
    }
  }

  public static void genTriangle() {
    int num = 30;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print((k == 0) ? "" : "/\\");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("1 - Square\n2 - Triangle");

    try (Scanner choose = new Scanner(System.in)) {
      final int opt = choose.nextInt();

      switch (opt) {
        case 1: {
          genSquare();
        }
          break;
        case 2: {
          genTriangle();
        }
          break;
        default: {
          System.out.println("love: option not found: " + opt);
        }
          break;
      }
    }
  }
}
