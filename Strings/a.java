package Strings;

public class a 
{
    public static void main(String[] args) {

        String[] words = {"avvj","dooe","exxj","diia"};
        int n = words.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {

                        if (i != j && i != k && i != l &&
                            j != k && j != l &&
                            k != l) {

                            System.out.println(
                                words[i] + " " +
                                words[j] + " " +
                                words[k] + " " +
                                words[l]
                            );
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("Total arrangements: " + count);
    }
}
