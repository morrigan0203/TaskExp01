package com.jexp1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[]{4,8,16,32,64,128};
        int[] b1 = new int[]{2,2,2,2,2,2};
        int[] a2 = new int[]{4,8,16,32,64};
        int[] b2 = new int[]{2,2,2,2,2,2};
        int[] a3 = new int[]{4,8,16,32,64,128};
        int[] b3 = new int[]{2,2,2,2,2,0};
        int[] a4 = new int[]{4,8,16,32,64,128};
        int[] b4 = null;

        //should calculate
        printSub(a1, b1);
        printDiv(a1, b1);
        System.out.println("------------");

        //should ArrayIndexOutOfBoundsException
        printSub(a2, b2);
        printDiv(a2, b2);
        System.out.println("------------");

        //should ArithmeticException
        printSub(a3, b3);
        printDiv(a3, b3);
        System.out.println("------------");

        //should NullPointerException
        printSub(a4, b4);
        printDiv(a4, b4);
        System.out.println("------------");
    }

    public static void printSub(int[] a, int[] b) {
        try {
            System.out.println(Arrays.toString(sub(a, b)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printDiv(int[] a, int[] b) {
        try {
            System.out.println(Arrays.toString(div(a, b)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] sub(int[] a, int[] b) {
        try {
            if (a.length != b.length) {
                throw new ArrayIndexOutOfBoundsException("Lengths of both arrays should be equals.");
            }
            int[] res = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                res[i] = a[i] - b[i];
            }
            return res;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ArithmeticException e) {
            throw new RuntimeException(e.getMessage());
        } catch (NullPointerException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static int[] div(int[] a, int[] b) {
        try {
            if (a.length != b.length) {
                throw new ArrayIndexOutOfBoundsException("Lengths of both arrays should be equals.");
            }
            int[] res = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                res[i] = a[i]/b[i];
            }
            return res;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ArithmeticException e) {
            throw new RuntimeException(e.getMessage());
        } catch (NullPointerException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}