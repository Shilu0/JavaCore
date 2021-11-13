import java.util.ArrayList;

public class ProductsRepo
{
    ArrayList<Products> products;
    public ArrayList<Products> productsData()
    {
        products=new ArrayList<>();
        products.add(new Products("PH01","Aris Pro","8bg/128gb",6500000,35,52,"Vsmart",Category.PHONE));
        products.add(new Products("LT01","XPS 15","15\"/i7/8gb/SSD512",23000000,16,11,"Dell",Category.LAPTOP));
        products.add(new Products("AP01","Iphone 13","128gb",25000000,37,41,"Apple",Category.APPLE));
        products.add(new Products("AS01","Pin dự phòng AK20","20.000mah",1200000,43,48,"Anker",Category.ACCESSORY));
        products.add(new Products("PH02","Galaxy Z Fold3","5bg/256gb",39500000,27,38,"Samsung",Category.PHONE));
        products.add(new Products("AP02","Ipad Air 2020","4bg/64gb 10.9",20900000,47,53,"Apple",Category.APPLE));
        products.add(new Products("LT02","Acer Nitro 2021","15\"/i7 11800H/8gb/SSD512",27900000,24,15,"Acer",Category.LAPTOP));
        products.add(new Products("PH03","POCO X3 Pro","8gb/256gb",7290000,23,18,"POCO",Category.PHONE));
        products.add(new Products("AS02","Ốp lưng iphone 13","silicon/chống sốc",99000,135,87,"EOM",Category.ACCESSORY));
        products.add(new Products("LT03","Levono ThinkBook G3","R7/8gb/512gb",19990000,15,9,"Levono",Category.LAPTOP));
        products.add(new Products("AP03","Macbook Air M1","8gb/256gb",28999000,39,27,"Apple",Category.APPLE));
        products.add(new Products("AS03","Loa bluetooth A3121","3W/20Hz",750000,22,25,"Anker",Category.ACCESSORY));
        products.add(new Products("AS04","Thẻ MicroSD M203","32gb/100mb/s",250000,19,17,"Toshiba",Category.ACCESSORY));
        products.add(new Products("PH04","POVA 2","4gb/64gb",4090000,13,16,"POVA",Category.PHONE));
        products.add(new Products("LT04","Dell Inspiron N3502","15\"/Celeron 4gb/ssd 128gb",10999000,9,13,"Dell",Category.LAPTOP));
        products.add(new Products("AS05","Miếng dán điện thoại Oppo A9","Chống trầy, cảm biến nhạy",190000,35,27,"YVS",Category.ACCESSORY));
        products.add(new Products("LT05","HP Envy 13","i7/8gb/SSD512",29019000,7,8,"HP",Category.LAPTOP));
        products.add(new Products("AS06","Tai nghe Mi basic","Earbud/3.5mm",150000,16,15,"Xiaomi",Category.ACCESSORY));

        return products;
    }

    public void printList()
    {
        for (Products p: products)
        {
            System.out.println(p);
        }
    }

    public void printCategory(Category c)
    {
        int count=0;
        for (Products p: products)
        {
            if(p.getCategory()==c)
            {
                System.out.println(p);
                count++;
            }
        }
        if (count==0)
            System.out.println("Không có sản phầm phù hợp");
    }

    public void printManufacturer(String m)
    {
        int count=0;
        for (Products p: products) {
            if(p.getManufacturer()==m) {
                System.out.println(p);
                count++;
            }
        }
        if (count==0)
            System.out.println("Không có sản phầm phù hợp");
    }

    public void printPrice(long l, long h)
    {
        int count=0;
        for (Products p: products) {
            if(p.getPrice()>=l && p.getPrice()<h) {
                System.out.println(p);
                count++;
            }
        }
        if (count==0)
            System.out.println("Không có sản phầm phù hợp");
    }

    public void printSearch(String n)
    {
        int count=0;
        for (Products p: products)
        {
            for (int i=0; i<=p.getName().length()-n.length(); i++)
            {
                String str=p.getName().substring(i,i+n.length());
                if (str.equalsIgnoreCase(n))
                {
                    System.out.println(p);
                    count++;
                }
            }
        }
        if (count==0)
            System.out.println("Không có sản phầm phù hợp");
    }
}
