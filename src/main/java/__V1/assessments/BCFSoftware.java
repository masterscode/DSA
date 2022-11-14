package __V1.assessments;

public class BCFSoftware {

    public static String StringChallenge(String[] strArr) {
        // code goes here

        String word = strArr[0];
        int rows = Integer.parseInt(strArr[1]);
        if (rows < 1) return word;

        StringBuilder result = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            boolean up = true;
            int idx = row;
            while (idx < word.length()) {
                result = result.append(word.charAt(idx));

                if (row == 0 || row == rows - 1) {
                    idx += (2 * rows - 2);
                } else {

                    if (up) {
                        idx += (2 * (rows - row) - 2);
                    } else {
                        idx += row * 2;
                    }
                    up ^= true;
                }
            }
        }


        result = new StringBuilder(result.toString().concat("9bxnu2k453"));

        for (int i = 1; i < result.length(); i++) {
            if (i % 4 == 0) {
                result.setCharAt(i - 1, '_');
            }
        }
        return result.toString();
    }

}
