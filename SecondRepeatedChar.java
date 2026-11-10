package FirstProgram;

public class SecondRepeatedChar {

    public static void main(String[] args) {

        String str = "aabbcccdddd";

        int max = 0;
        int second = 0;
        char secondChar = ' ';

        boolean[] visited = new boolean[str.length()];

        for(int i = 0; i < str.length(); i++) {

            if(visited[i]) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            if(count > max) {

                second = max;
                max = count;

            } else if(second < count && max > count) {

                second = count;
                secondChar = str.charAt(i);
            }
        }

        System.out.println("Second repeated character: " + secondChar);
    }
}