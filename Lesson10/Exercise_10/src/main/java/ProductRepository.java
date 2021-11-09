import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductRepository
{
    ArrayList<Products> products;
    public ArrayList<Products> productsData()
    {
        products=new ArrayList<>();
        products.add(new Products("MP01","Kem chống nắng",200000, Category.COSMETICS.getCategory(),55,56));
        products.add(new Products("TP01","Mực một nắng",550000, Category.FOOD.getCategory(),10,21));
        products.add(new Products("TP02","Salami",230000, Category.FOOD.getCategory(),23,37));
        products.add(new Products("TT01","Quần bơi nam",360000, Category.FASHION.getCategory(),14,24));
        products.add(new Products("TT02","Mũ bơi",210000, Category.FASHION.getCategory(),25,16));
        products.add(new Products("GD01","Mở bia đa năng",65000, Category.HOUSEWARE.getCategory(),12,17));
        products.add(new Products("MP02","Bọt cạo râu",90000, Category.COSMETICS.getCategory(),33,23));
        products.add(new Products("TT03","Áo đi biển",400000, Category.FASHION.getCategory(),16,9));
        products.add(new Products("GD02","Đá Inox",170000, Category.HOUSEWARE.getCategory(),8,19));
        products.add(new Products("TP03","Phomai dây",80000, Category.FOOD.getCategory(),25,27));
        products.add(new Products("GD03","Cốc bia bọc xốp",75000, Category.HOUSEWARE.getCategory(),38,63));
        products.add(new Products("TT04","Dép xốp đi biển",70000, Category.FASHION.getCategory(),34,41));
        products.add(new Products("MP03","Dầu gội",180000, Category.COSMETICS.getCategory(),19,36));

        return products;
    }

    public void printList()
    {
        for (Products p: products)
        {
            System.out.println(p);
        }
    }

    public void printLimitedPrice(long pr)
    {
        System.out.println("Danh sách sản phẩm có giá >"+pr);
        for (Products p : products) {
            if (p.getPrice() > pr)
                System.out.println(p);
        }
    }

    public void compareSoldQuantity()
    {
        Collections.sort(products, new Comparator<Products>()
        {
            public int compare(Products o1,Products o2)
            {
                return o1.getSoldQuantity() - (o2.getSoldQuantity());
            }
        });
        System.out.println("Danh sách sản phẩm theo số lượng bán được:");
        printList();

    }

    public void mostSold()
    {
        Collections.sort(products, new Comparator<Products>()
        {
            public int compare(Products o1,Products o2)
            {
                return o2.getSoldQuantity() - (o1.getSoldQuantity());
            }
        });
        System.out.println("Sản phẩm bán chạy nhất:");
        System.out.println(products.get(0));
    }

    public void arrangeProduct()
    {
        System.out.println("Đồ gia dụng");
        for (Products p: products) {
            if(p.getCategory()=="Đồ gia dụng")
                System.out.println(p);
        }
        System.out.println("Thời trang");
        for (Products p: products) {
            if(p.getCategory()=="Thời trang")
                System.out.println(p);
        }
        System.out.println("Mỹ phẩm");
        for (Products p: products) {
            if(p.getCategory()=="Mỹ phẩm")
                System.out.println(p);
        }
        System.out.println("Thực phẩm");
        for (Products p: products) {
            if(p.getCategory()=="Thực phẩm")
                System.out.println(p);
        }
    }

    public void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên sản phầm cần tìm kiếm: ");
        String name=sc.nextLine();
        int count=0;

        for (Products p: products ) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                count++;
            }
        }
        if (count==0)
            System.out.println("Không có sản phẩm cần tìm");
    }
}
