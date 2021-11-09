import java.util.Scanner;

public class Menu
{
    public static void pick()
    {
        ProductRepository pRepo= new  ProductRepository();
        pRepo.products=pRepo.productsData();

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập yêu cầu cần kiểm tra");
        System.out.println("Số 1 - Thông tin tất cả sản phẩm");
        System.out.println("Số 2 - Thông tin sản phẩm có giá lớn hơn 100.000");
        System.out.println("Số 3 - Thông tin sản phẩm theo số lượng bán được");
        System.out.println("Số 4 - Sản phẩm bán chạy nhất");
        System.out.println("Số 5 - Thông tin sản phẩm theo danh mục");
        System.out.println("Số 6 - Tìm kiếm sản phẩm");
        System.out.println("Số 0 - Thoát chương trình");

        int number = sc.nextInt();

        switch(number)
        {
            case 1: System.out.println("Danh mục tất cả sản phẩm");
                pRepo.printList();
                break;
            case 2: pRepo.printLimitedPrice(100000);
                break;
            case 3: pRepo.compareSoldQuantity();
                break;
            case 4: pRepo.mostSold();
                break;
            case 5: pRepo.arrangeProduct();
                break;
            case 6: pRepo.search();
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }
    }
}
