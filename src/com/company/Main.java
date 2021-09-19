package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//Homework 2: (main)
    for (int i = 1; i <= 20; i++) {
        System.out.print(sumUpTo(i) + " ");
    }
        System.out.println(" ");

    //Homework 3: (main)
    int[] int_array_1 = {1, 2, 3, 4, 5, 6};
    int[] int_array_2 = {10, 20, 30, 40, 1};
        System.out.println(contains(int_array_1, 2));
        System.out.println(any(int_array_1, int_array_2));

    //Homework 4: (main)
    System.out.println(prime(29));
    System.out.println(" ");

    //Primes smaller than 100
    for (int i = 1; i <= 100; i++) {
        if (prime(i))
            System.out.print(i + " ");
    }

    //First 100 primes
    int count_of_primes = 0;
        for (int i = 1; i < 1000000 && count_of_primes <= 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
                count_of_primes++;
            }
        }
        System.out.println(" ");

    //Homework 5: (main)
    int[] int_array_3 = {3, 6, 9, 12, 15, 18};
    for (int v : reverse(int_array_3))
        System.out.print(v + " ");

    int[] int_array_4 = {3, 6, 9, 12, 15, 100};
        System.out.println(equal(int_array_3, int_array_4));

    int[] palindrome_array = {1, 2, 3, 4, 3, 2, 1};
    boolean is_palindrome = equal(reverse(palindrome_array), palindrome_array);
    System.out.println(is_palindrome);

    //Homework 6: (main)
    int[] remove_array = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
    int[] new_remove_array = new int[remove_array.length];
    int x_being_removed = 4;
    remove(remove_array, new_remove_array, x_being_removed);
    System.out.println(Arrays.toString(remove(remove_array, new_remove_array, x_being_removed)));

    //Homework 7: (main)
    int[] array_to_be_alternated = {2, 4, 6, 8, 10, 12};
    System.out.println(Arrays.toString(alternate(array_to_be_alternated)));

    }

    //Homework 2:
    static int sumUpTo (int n) {
    return (n*(n+1))/2;
    }

    //Homework 3:
    static boolean contains (int[] array, int value) {
    for (int n : array) {
        if (n == value)
            return true;
    }
    return false;
    }

    static boolean any (int[] a, int[] b) {
        for (int one_value : a) {
            for (int another_value : b) {
                if (one_value == another_value)
                    return true;
            }
        }
        return false;
    }

    //Homework 4:
    static boolean prime (int n) {
        for (int j = 2; j <= n/2; j++) {
            if ((n % j == 0)){
                return false;
            }
        }
        return true;
    }

    //Homework 5:
    static int[] reverse (int[] a) {
    int[] reversed_a = new int[a.length];
    int index_of_reversed = 0;
    for (int i = a.length - 1; i >= 0; i--) {
        reversed_a[index_of_reversed] = a[i];
        index_of_reversed++;
    }
    return reversed_a;
    }

    static boolean equal (int[] a, int[] b) {
        boolean is_equal = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i] || a.length != b.length) {
                is_equal = false;
                break;
            }
        }
        return is_equal;
    }

    //Homework 6:
    /*
    Pseudocode:

     */
    static int[] remove (int[] in, int[] out, int x) {
    int count_of_out = 0;
        for (int v : in) {
            if (v != x) {
                out[count_of_out] = v;
                count_of_out++;
            }
        }

    for (int i = count_of_out; i < in.length; i++) {
        out[i] = 0;
    }
    return out;
    }

    //Homework 7:
    static int[] alternate (int[] a) {
    int[] alternated_array = new int[a.length];
    int j = 0;
        for (int i = 0; i <= a.length / 2 && j < a.length; i++) {
            alternated_array[j] = a[i];
            alternated_array[j + 1] = a[a.length - 1 - i];
            j = j + 2;
        }

    return alternated_array;
    }

}
