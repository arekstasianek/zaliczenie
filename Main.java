import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        char[] tablica1 = {'a', 'b', 'c', 'd', 'e'};
        char[] tablica2 = {'c', 'd', 'e', 'f', 'g'};

        ArrayList<Character> wspolneElementy = znajdzWspolneElementy(tablica1, tablica2);

        System.out.println("Wspólne elementy:");
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

 