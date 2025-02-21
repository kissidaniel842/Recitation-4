public class Recitation4 {


    public static String explode(String word) {
        StringBuilder sb = new StringBuilder();
        int duplicateValue;

        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);

            if (Character.isLetter(ch)) {
                duplicateValue = index + 1;
            } else if (Character.isDigit(ch)) {
                duplicateValue = Character.getNumericValue(ch);
            } else {
                break;  // Stop processing at first non-alphanumeric character
            }

            for (int count = 0; count < duplicateValue; count++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
