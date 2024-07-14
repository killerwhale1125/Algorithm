package 백준.brute_force._2309_일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 9
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arr = new int[9];

        for(int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for(int k=2; k<9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
