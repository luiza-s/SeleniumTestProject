/**
 * Created by luiza.suryan on 10/10/2018.
 */

import java.util.ArrayList;
public class NarekiXndir {

    static void NarekiXndir() {
        /*Nareki xndiry - kisel trvac array, skzbum tpel 2rd kesi elemntnery heto arajin kesiny 1 arrayum*/

        final int n = 11;
        int[] arr = {15, 1, 88, 2, 15, 34, 24, 15, 25, 15, 44};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int L = arr.length;
// erb arraji elemnetneri qanaky zujg e
        if (L % 2 == 0) {
            for (int j = L / 2; j < L; ++j) {
                list.add(arr[j]);
            }
            for (int j = 0; j < L / 2; ++j) {
                list.add(arr[j]);
            }
            System.out.println(list);
// erb arraji elemnetneri qanaky kent e
        }
        else if (L % 2 != 0) {
            for (int i = (int) Math.ceil(L / 2); i < L; ++i) {
                list.add(arr[i]);
            }
            for (int i = 0; i < (int) Math.ceil(L / 2); ++i) {
                list.add(arr[i]);
            }
            System.out.println(list);
        }

    }
    public static void main(String[] args) {

        NarekiXndir();
    }
}
