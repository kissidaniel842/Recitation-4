public class Recitation4 {


    public static String explode(String word) {
        StringBuilder sb = new StringBuilder();
        int duplicateValue;

        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (Character.isLetter(ch)) {
                duplicateValue = index + 1;
            } else if (Character.isDigit(ch)) {
                duplicateValue = Integer.parseInt("" + ch);
            } else {
                // Append the characters up to but not including the non-alphanumeric character
                sb.append(word.substring(0, index));
                return sb.toString();
            }

            for (int count = 0; count < duplicateValue; count++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}




