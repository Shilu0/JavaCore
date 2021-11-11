public class Main
{
    public static void main(String[] args)
    {
        WaiterRepo wRepo=new WaiterRepo();
        wRepo.waiters=wRepo.waitersData();
        System.out.println("Thông tin các nhân viên bồi bàn:");
        wRepo.printList();

        KitchenRepo kRepo=new KitchenRepo();
        kRepo.kitchens=kRepo.kitchensData();
        System.out.println("\nThông tin các nhân viên đứng bếp:");
        kRepo.printList();
    }
}
