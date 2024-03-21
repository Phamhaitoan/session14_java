package ex14_07;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        cho người dùng nhập giá trị x,y
        System.out.println("nhập giá trị x là : ");
        int x = scanner.nextInt();
        System.out.println("nhập giá tr y là: ");
        int y = scanner.nextInt();
//        sử dụng range
        IntStream.rangeClosed(x,y).forEach(System.out::println);
    }
}
