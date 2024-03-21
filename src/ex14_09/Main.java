package ex14_09;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                // Lấy ngày hiện tại của hệ thống
        LocalDateTime now = LocalDateTime.now();
                System.out.println("Ngày hiện tại của hệ thống: " + now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                // Lấy ngày hiện tại ở Tokyo
        LocalDateTime tokyoTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
                System.out.println("Ngày hiện tại ở Tokyo: " + tokyoTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                // Lấy ngày hiện tại ở Sydney
        LocalDateTime sydneyTime = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
                System.out.println("Ngày hiện tại ở Sydney: " + sydneyTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                // Lấy ngày hiện tại ở Sao Paulo
        LocalDateTime saoPauloTime = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
                System.out.println("Ngày hiện tại ở Sao Paulo: " + saoPauloTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        LocalTime currentTime = LocalTime.now();
        System.out.println("Thời gian hiện tại: " + currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày đầu tiên (yyyy-MM-dd): ");
        String firstDateString = scanner.next();
        System.out.print("Nhập ngày thứ hai (yyyy-MM-dd): ");
        String secondDateString = scanner.next();

        // Chuyển đổi các chuỗi thành đối tượng LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateString);
        LocalDate secondDate = LocalDate.parse(secondDateString);

        // Tính toán số ngày giữa hai ngày
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        // In kết quả
        System.out.println("Số ngày giữa hai ngày là: " + Math.abs(daysBetween));

        LocalDate currentDate = LocalDate.now();
        // Lấy số ngày trong tháng hiện tại
        int daysInMonth = YearMonth.of(currentDate.getYear(), currentDate.getMonth()).lengthOfMonth();
        // In kết quả
        System.out.println("Số ngày trong tháng hiện tại: " + daysInMonth);

        LocalDate curDate = LocalDate.now();
        // Lấy số ngày trong năm hiện tại
        int daysInYear = curDate.lengthOfYear();
        // In kết quả
        System.out.println("Số ngày trong năm hiện tại: " + daysInYear);

//       bài6
        System.out.print("Nhập chuỗi ngày (yyyy-MM-dd): ");
        String dateString = scanner.next();

        // Chuyển đổi chuỗi ngày sang đối tượng LocalDate
        LocalDate date = LocalDate.parse(dateString);
        // In kết quả
        System.out.println("Đối tượng LocalDate: " + date);


        LocalDate ngay = LocalDate.now();
        // Định dạng đối tượng LocalDate thành chuỗi ngày (dd/MM/yyyy)
        String formattedDate = ngay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // In kết quả
        System.out.println("Chuỗi ngày: " + formattedDate);




        // Bài tập 8: Chuyển đổi LocalDateTime sang chuỗi ngày(dd/MM/yyyy HH:mm:ss)
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("LocalDateTime: " + dateTime);
        System.out.println("Chuỗi ngày: " + formattedDateTime);


        // Bài tập 9: So sánh hai ngày LocalDate
        LocalDate date1 = LocalDate.of(2024, 3, 21);
        LocalDate date2 = LocalDate.of(2024, 3, 20);
        int comparisonResult = date1.compareTo(date2);
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Kết quả so sánh: " + comparisonResult);


        // Bài tập 10: So sánh hai thời gian LocalTime
        LocalTime time1 = LocalTime.of(10, 30, 0);
        LocalTime time2 = LocalTime.of(9, 0, 0);
        comparisonResult = time1.compareTo(time2);
        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Kết quả so sánh: " + comparisonResult);



        // Bài tập 11: Thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào
        LocalDateTime originalDateTime = LocalDateTime.now();
        LocalDateTime modifiedDateTime = originalDateTime.plusDays(1).minusHours(2).plusMinutes(30);
        System.out.println("Ngày và thời gian ban đầu: " + originalDateTime);
        System.out.println("Ngày và thời gian sau khi chỉnh sửa: " + modifiedDateTime);



        // Bài tập 12: Tính toán ngày tiếp theo hoặc ngày trước đó của một ngày
        LocalDate originalDate = LocalDate.now();
        LocalDate nextDate = originalDate.plusDays(1);
        LocalDate previousDate = originalDate.minusDays(1);
        System.out.println("Ngày ban đầu: " + originalDate);
        System.out.println("Ngày tiếp theo: " + nextDate);
        System.out.println("Ngày trước đó: " + previousDate);

        // Bài tập 13: Tính toán thời gian tiếp theo hoặc thời gian trước đó của một thời gian
        LocalTime originalTime = LocalTime.now();
        LocalTime nextTime = originalTime.plusHours(1);
        LocalTime previousTime = originalTime.minusHours(1);
        System.out.println("Thời gian ban đầu: " + originalTime);
        System.out.println("Thời gian tiếp theo: " + nextTime);
        System.out.println("Thời gian trước đó: " + previousTime);



    }
}


