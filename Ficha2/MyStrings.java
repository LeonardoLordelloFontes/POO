import java.util.Arrays;

public class MyStrings {
    String[] strings;
    public MyStrings(String[] strings) {
        this.strings = strings;
    }

    // 5 a)

    public String[] semRepetidas() {
        String[] temp = new String[strings.length];
        int pos = 0;
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            while (i < strings.length - 1 && strings[i].equals(strings[i+1])) {
                i++;
            }
            temp[pos++] = strings[i];
        }
        String[] new_string = new String[pos];
        System.arraycopy(temp, 0, new_string, 0, pos);
        return new_string;
    }

    // 5 b)

    public String maiorString() {
        int max = strings[0].length();
        String max_string = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                max_string = strings[i];
            }
        }
        return max_string;
    }

    // 5 c)

    public String[] temRepetidas() {
        String[] temp = new String[strings.length];
        int pos = 0;
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            boolean temRepetidos = false;
            while (i < strings.length - 1 && strings[i].equals(strings[i+1])) {
                i++;
                temRepetidos = true;
            }
            if (temRepetidos) temp[pos++] = strings[i];
        }
        String[] new_string = new String[pos];
        System.arraycopy(temp, 0, new_string, 0, pos);
        return new_string;
    }

    // 5 d)

    public int stringOcorre(String string) {
        int r = 0;
        for (String elem: strings) {
            if (elem.equals(string)) r++;
        }
        return r;
    }
}
