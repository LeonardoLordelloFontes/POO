import java.util.Arrays;
import java.lang.System;

public class Array {

    // 1 a)

    public static int minValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) min = elem;
        }
        return min;
    }

    // 1 b)

    public static int[] subArray(int[] array, int start, int end) {
        int[] sub_array = new int[end - start + 1];
        System.arraycopy(array, start, sub_array, 0,end - start + 1);
        return sub_array;
    }

    // 1 c)

    public static int[] intersection(int[] a1, int[] a2) {
        int[] temp = new int[Math.max(a1.length, a2.length)];
        int i = 0, j = 0, size = 0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i < a1.length && j < a2.length) {
            if (a1[i] > a2[j]) j++;
            else if (a1[i] < a2[j]) i++;
            else {
                if (size == 0 || a1[i] != a1[size-1])
                    temp[size++] = a1[i];
                i++;
                j++;
            }
        }
        int[] new_array = new int[size];
        System.arraycopy(temp, 0, new_array, 0, size);
        return new_array;
    }

    // 4 a)

    public void sort(int[] array) {
        Arrays.sort(array);
    }

    // 4 b)

    public int binarySearch(int[] array, int elem) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, elem);
    }
}
