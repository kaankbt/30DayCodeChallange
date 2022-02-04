package Day7;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ReversePrint(arr);

        bufferedReader.close();
    }

    private static void ReversePrint(List<Integer> arr) {

        int length = arr.size();

        for (int i = length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr.get(i) + " ");
            } else {
                System.out.print(arr.get(i));
            }
        }
    }
}
