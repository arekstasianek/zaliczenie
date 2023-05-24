import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj elementy 1 tablicy oddzielając je spacją: ");
        String input1 = scanner.nextLine();
        char[] tablica1 = input1.toCharArray();

        System.out.print("Podaj elementy 2 tablicy oddzielając je spacją: ");
        String input2 = scanner.nextLine();
        char[] tablica2 = input2.toCharArray();

        ArrayList<Character> wspolneElementy = znajdzWspolneElementy(tablica1, tablica2);

        System.out.println("Wspólne elementy tablic:");
        for (char element : wspolneElementy) {
            System.out.println(element);
        }
    }

    private static ArrayList<Character> znajdzWspolneElementy(char[] tablica1, char[] tablica2) {
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> wspolne = new ArrayList<>();

        for (char element : tablica1) {
            set.add(element);
        }

        for (char element : tablica2) {
            if (set.contains(element)) {
                wspolne.add(element);
            }
        }

        return wspolne;
    }
}
 