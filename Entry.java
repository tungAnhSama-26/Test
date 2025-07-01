package algorithm;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character = sc.nextLine();
        character = ' ' + character;
        int count = 0;
        for (int i = 1; i < character.length(); i++) {
            if (character.charAt(i) != ' ' && character.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

}
