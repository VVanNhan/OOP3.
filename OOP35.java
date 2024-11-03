public class OOP35 {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 2, 28);
        System.out.println("Ngày ban đầu: " + date);
        System.out.println("Ngày tiếp theo: " + date.nextDay());
        System.out.println("Ngày trước đó: " + date.previousDay());
        System.out.println("Tháng tiếp theo: " + date.nextMonth());
        System.out.println("Tháng trước đó: " + date.previousMonth());
        System.out.println("Năm tiếp theo: " + date.nextYear());
        System.out.println("Năm trước đó: " + date.previousYear());
        try {
            MyDate invalidDate = new MyDate(2024, 2, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Ngày không hợp lệ: " + e.getMessage());
        }
        System.out.println("Định dạng chuỗi: " + date.toString());
        MyDate specificDate = new MyDate(2024, 11, 3);
        System.out.println("Ngày cụ thể: " + specificDate);
        System.out.println("Ngày trong tuần: " + MyDate.DAYS[specificDate.getDayOfWeek(2024, 11, 3)]);
    }
}
