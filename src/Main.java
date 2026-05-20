import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();

        System.out.println("Introduce 5 nombres: ");
        for (int i = 0; i < 5; i++) {
            nombres.add(sc.nextLine());
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}