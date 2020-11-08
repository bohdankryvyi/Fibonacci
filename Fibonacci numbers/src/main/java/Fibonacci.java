import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
    public static void calculateFibo(int k, int l, int n) {
// method for calculate Fibonacci
        int i = 1, t1 = 0, t2 = 1;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        while (i <= n) {
            if (t1 >= k && t1 <= l) {
                System.out.print(t1 + "  ");
                // to divide odd and even elements
                if (t1 % 2 == 0)
                    even.add(t1);
                else
                    odd.add(t1);
            }


            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
// Show even and odd elements
        Collections.sort(even, Collections.reverseOrder());
        System.out.println("Even elements in descending order:");
        for (Integer str : even) {
            System.out.println(str);
        }

        System.out.println("Odd elements in ascending order:");
        for (Integer str1 : odd) {
            System.out.println(str1);
        }
        // Call methods for summing odd and even elements
        System.out.println("Sum of shown odd elements is " + sumArrayelements.sum(odd));
        System.out.println("Sum of shown even elements is " + sumArrayelements.sum(even));

    }
}
