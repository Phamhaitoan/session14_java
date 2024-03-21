package ex14_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        tạo mảng số nguyên ngâu nhiên
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
// cho người dùngg nhập vào một số
        Scanner scanner = new Scanner(System.in);
        System.out.println("người dùng nhập vào một giá trị xác định");
        int a = scanner.nextInt();
//        sử dụng stream
        Arrays.stream(arr).filter((number -> number > a)).forEach(System.out::println);

    }
}
