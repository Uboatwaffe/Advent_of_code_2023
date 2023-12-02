package org.main;

import java.util.Scanner;

/**
 * @author Maciek
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chain;
        StringBuilder pre = new StringBuilder(2);
        int pre_sum;
        int sum = 0;

        for (int j = 0; j < 1000; j++) {

            chain = sc.nextLine();

            for (int i = 0; i < chain.length(); i++) {
                try {
                    Integer.parseInt(String.valueOf(chain.charAt(i)));
                    pre.append(chain.charAt(i));
                    break;
                } catch (Exception ignore) {
                }
            }

            for (int i = chain.length(); i >= 0; i--) {
                try {
                    Integer.parseInt(String.valueOf(chain.charAt(i)));
                    pre.append(chain.charAt(i));
                    break;
                } catch (Exception ignore) {
                }
            }

            pre_sum = Integer.parseInt(pre.toString());
            pre.delete(0, pre.length());

            sum += pre_sum;
        }

        System.out.println("Suma to: " + sum);
    }
}
