import java.util.ArrayList;

public class KitchenRepo
{
    ArrayList<Kitchen> kitchens;
    public ArrayList<Kitchen> kitchensData()
    {
        kitchens=new ArrayList<>();
        kitchens.add(new Kitchen("KC01","Công Phượng",25,5000000,3500000));
        kitchens.add(new Kitchen("KC02","Đức Chinh",26,4500000,2500000));
        kitchens.add(new Kitchen("KC03","Tuấn Anh",25,5500000,3000000));
        kitchens.add(new Kitchen("KC04","Park Hang Seo",65,15000000,6500000));

        return kitchens;
    }

    public void printList()
    {
        for (Kitchen k:kitchens)
        {
            System.out.println(k);
        }
    }
}
