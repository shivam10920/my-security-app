package myCodePractice;

public class FrequencyCHK {

    public static void chkFrequency(String a) {
        char[] b = a.toCharArray();
        boolean[] c = new boolean[a.length()]; // To track processed characters

        for (int i = 0; i < b.length; i++) {
            if (c[i]) {
                continue; // Skip already processed characters
            }

            int count = 1; // Initialize count for the current character

            for (int k = i + 1; k < b.length; k++) {
                if (b[i] == b[k]) {
                    count++;
                    c[k] = true; // Mark duplicates as processed
                }
            }

            System.out.println("Count of " + b[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        chkFrequency("shivvvam");
    }
}
