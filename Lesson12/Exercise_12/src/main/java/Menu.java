import java.util.Scanner;

public class Menu
{
    public static void pick()
    {
        ProductsRepo pRepo=new ProductsRepo();
        pRepo.products= pRepo.productsData();

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập yêu cầu in thông tin sản phẩm:");
        System.out.println("Số 1 - In thông tin theo danh mục sản phẩm");
        System.out.println("Số 2 - In thông tin theo hãng");
        System.out.println("Số 3 - In thông tin theo mức giá");
        System.out.println("Số 4 - In thông tin sản phầm cần tìm");
        System.out.println("Số 0 - Thoát chương trình");

        int number = sc.nextInt();

        switch(number)
        {
            case 1: categoryPick();
                break;
            case 2: manufacturerPick();
                break;
            case 3: pricePick();
                break;
            case 4:
                System.out.print("Nhập sản phầm cần tìm: ");
                sc.nextLine();
                String searchName = sc.nextLine();
                pRepo.printSearch(searchName);
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }

    }

    public static void categoryPick()
    {
        ProductsRepo pRepo=new ProductsRepo();
        pRepo.products= pRepo.productsData();

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập danh mục cần in sản phầm:");
        System.out.println("Số 1 - Điện thoại");
        System.out.println("Số 2 - Laptop");
        System.out.println("Số 3 - Apple");
        System.out.println("Số 4 - Phụ kiện");
        System.out.println("Số 0 - Thoát chương trình");

        int number=sc.nextInt();

        switch(number)
        {
            case 1: pRepo.printCategory(Category.PHONE);
                break;
            case 2: pRepo.printCategory(Category.LAPTOP);
                break;
            case 3: pRepo.printCategory(Category.APPLE);
                break;
            case 4: pRepo.printCategory(Category.ACCESSORY);
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }
    }

    public static void manufacturerPick()
    {
        ProductsRepo pRepo=new ProductsRepo();
        pRepo.products= pRepo.productsData();

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập hãng cần in các sản phẩm:");
        System.out.println("Số 1 - Vsmart");
        System.out.println("Số 2 - Apple");
        System.out.println("Số 3 - Samsung");
        System.out.println("Số 4 - Dell");
        System.out.println("Số 5 - Anker");
        System.out.println("Số 6 - Acer");
        System.out.println("Số 0 - Thoát chương trình");

        int number=sc.nextInt();

        switch(number)
        {
            case 1: pRepo.printManufacturer("Vsmart");
                break;
            case 2: pRepo.printManufacturer("Apple");
                break;
            case 3: pRepo.printManufacturer("Samsung");
                break;
            case 4: pRepo.printManufacturer("Dell");
                break;
            case 5: pRepo.printManufacturer("Anker");
                break;
            case 6: pRepo.printManufacturer("Acer");
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }
    }

    public static void pricePick()
    {
        ProductsRepo pRepo=new ProductsRepo();
        pRepo.products= pRepo.productsData();

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mức giá cần in các sản phẩm:");
        System.out.println("Số 1 - Dưới 2 triệu");
        System.out.println("Số 2 - Từ 2 - 4 triệu");
        System.out.println("Số 3 - Từ 4 - 7 triệu");
        System.out.println("Số 4 - Từ 7 - 13 triệu");
        System.out.println("Số 5 - Trên 13 triệu");
        System.out.println("Số 0 - Thoát chương trình");

        int number=sc.nextInt();

        switch(number)
        {
            case 1: pRepo.printPrice(0,2000000);
                break;
            case 2: pRepo.printPrice(2000000,4000000);
                break;
            case 3: pRepo.printPrice(4000000,7000000);
                break;
            case 4: pRepo.printPrice(7000000,13000000);
                break;
            case 5: pRepo.printPrice(13000000,Long.MAX_VALUE);
                break;
            case 0: System.exit(0);
            default:
                System.out.println("Số nhập không phù hợp");
        }
    }


}
