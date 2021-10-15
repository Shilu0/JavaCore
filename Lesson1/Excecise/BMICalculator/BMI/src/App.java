public class App {
    public static void main(String[] args) throws Exception {

        BMI bmi = new BMI();

        System.out.println("Tính chỉ số BMI cho người cân nặng 70kg, cao 1.8m");
        
        System.out.print("Chỉ số BMI (theo phương thức trả về void) là: ");
        bmi.BMICalculatorVoid();
        
        System.out.println("Chỉ số BMI (theo phương thức trả về double) là: " + bmi.BMICalculatorDouble());
        
        System.out.println("Chỉ số BMI (theo phương thức trả về double có truyền parameters) là: " + bmi.BMICalculatorParameter(70,1.8));
    }
}
// Tính theo phương thức trả về double có truyền parameters là tốt nhất vì có thể tùy chỉnh tham số đưa vào trước khi chạy chương trình tại main (không phải điều chỉnh class tham chiếu)
