public class Recitation4 {

    public static String explode(String word) {
        StringBuilder sb = new StringBuilder();
        int duplicateValue;
        int index = 0;


        for (; index < word.length(); index++) {
            char ch = word.charAt(index);

            if (Character.isLetter(ch)) {
                duplicateValue = index + 1;
            } else if (Character.isDigit(ch)) {
                duplicateValue = Character.getNumericValue(ch);
            } else {
                break;
            }

            for (int count = 0; count < duplicateValue; count++) {
                sb.append(ch);
            }
        }

        sb.append(word.substring(index));

        return sb.toString();
    }
}
