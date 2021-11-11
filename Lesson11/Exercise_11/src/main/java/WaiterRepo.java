import java.util.ArrayList;

public class WaiterRepo
{
    ArrayList<Waiter> waiters;
    public ArrayList<Waiter> waitersData()
    {
        waiters=new ArrayList<>();
        waiters.add(new Waiter("WT01","Quang Hải",25,5000000,3000000));
        waiters.add(new Waiter("WT02","Đức Huy",26,4500000,2500000));
        waiters.add(new Waiter("WT03","Tiến Linh",22,5000000,2500000));
        waiters.add(new Waiter("WT04","Ngọc Hải",28,6000000,3500000));

        return waiters;
    }

    public void printList()
    {
        for (Waiter w:waiters)
        {
            System.out.println(w);
        }
    }
}
