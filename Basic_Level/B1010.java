package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class B1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = input.readLine().split("\\s+");
        input.close();
 
        int[] numbers = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            numbers[i] = Integer.parseInt(temp[i]);
        } 
        differentiate(numbers);
        printer(numbers);
    }
 
    private static void differentiate(int[] numbers) {
        for (int i = 0; i < numbers.length; i += 2) {
            numbers[i] *= numbers[i + 1];
            numbers[i + 1]--;
        }
    }
 
    private static void printer(int[] A) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length; i += 2) {
            if (A[i] != 0)
                sb.append(A[i] + " " + A[i + 1] + " ");
        } 
        if (sb.length() == 0){
            sb.append("0 0 ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
