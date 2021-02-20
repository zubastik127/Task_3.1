import java.util.Arrays;

public class ThanosSorting {

    public static int[] sorting(int[] num) {

        double sum = 0;

        int min = 0;
        int max = num.length - 1;

        int[] arr = new int[num.length];

        int[] num1;
        int[] num2;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        double average = sum / num.length;

        for (int i = 0; i < num.length; i++) {
            if (num[i] <= average) {
                arr[min] = num[i];
                min++;
            } else {
                arr[max] = num[i];
                max--;
            }
        }

        if (min == num.length)
            return num;

        num1 = Arrays.copyOf(arr, min);
        num2 = new int[num.length - min];

        int count = 0;

        for (int i = arr.length - num2.length; i < arr.length; i++) {
            num2[count] = arr[i];
            ++count;
        }

        num1 = sorting(num1);
        num2 = sorting(num2);

        arr = Arrays.copyOf(num1, num.length);

        int count2 = num1.length;

        for (int i = 0; i < num2.length; i++) {
            arr[count2] = num2[i];
            ++count2;
        }

        return arr;
    }

}
