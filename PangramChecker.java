public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.replaceAll(" ", "").toLowerCase();

        boolean[] alphabetPresent = new boolean[26];
        int count = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true;
                    count++;
                }
            }
        }

        boolean isPangram = (count == 26);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

