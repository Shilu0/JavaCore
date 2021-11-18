import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Chọn sơ đồ chiến thuật ra sân");
        System.out.println("Chọn 1 - Đội hình 4-4-2");
        System.out.println("Chọn 2 - Đội hình 4-3-3");
        System.out.println("Chọn 3 - Đội hình 3-5-2");
        System.out.println("Chọn 0 - Thoát chương trình");

        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        switch (number)
        {
            case 1: Formation.selectTeam(4,4,2);
                break;
            case 2: Formation.selectTeam(4,3,3);
                break;
            case 3: Formation.selectTeam(3,5,2);
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }
    }
}
