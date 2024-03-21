package ex14_08;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        tạo mảng số nguyên ngâu nhiên
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000)*2+1;
        }
        System.out.println(Arrays.toString(arr));

//   kiểm tra

        OptionalInt check = Arrays.stream(arr).filter((value -> value % 2 == 0)).findFirst();
        System.out.println("các số chắn là: " + check.orElseThrow(()-> new RuntimeException("không tồn tại số chẵn nào")));
    }
}
