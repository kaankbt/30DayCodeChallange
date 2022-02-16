package day16;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner scan = new Scanner(System.in);) {
            int input = Integer.parseInt(scan.nextLine());
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}