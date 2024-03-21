package ex14_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        tạo một danh sách chuỗi
        List<String> lists = Arrays.asList("Apple","Samsung","Sony","nokia","motorola","blackberry");
//        sử dụng stream và map
        lists.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
