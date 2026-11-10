package FirstProgram;

public class String7 {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()) {

            System.out.println("Length doesn't match, not an anagram");

        } else {

            boolean[] used = new boolean[s2.length()];
            boolean isAnagram = true;

            for(int i = 0; i < s1.length(); i++) { 

                boolean found = false;

                for(int j = 0; j < s2.length(); j++) {

                    if(s1.charAt(i) == s2.charAt(j) && !used[j]) {

                        used[j] = true;
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    isAnagram = false;
                    break;
                }
            }

            if(isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
    }
}