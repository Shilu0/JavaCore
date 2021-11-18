import java.util.ArrayList;

public class PlayersRepo
{
    ArrayList<Players> players;
    public ArrayList<Players> playersData()
    {
        players=new ArrayList<>();
        players.add(new Players(1,"Bùi Tấn Trường",Position.GK));
        players.add(new Players(23,"Trần Nguyên Mạnh",Position.GK));
        players.add(new Players(12,"Nguyễn Văn Hoàng",Position.GK));
        players.add(new Players(13,"Hồ Tấn Tài",Position.DF));
        players.add(new Players(16,"Nguyễn Thành Chung",Position.DF));
        players.add(new Players(2,"Đỗ Duy Mạnh",Position.DF));
        players.add(new Players(7,"Nguyễn Phong Hồng Duy",Position.DF));
        players.add(new Players(17,"Vũ Văn Thanh",Position.DF));
        players.add(new Players(5,"Phạm Xuân Mạnh",Position.DF));
        players.add(new Players(3,"Quế Ngọc Hải",Position.DF));
        players.add(new Players(4,"Bùi Tiến Dũng",Position.DF));
        players.add(new Players(21,"Bùi Hoàng Việt Anh",Position.DF));
        players.add(new Players(19,"Nguyễn Quang Hải",Position.MF));
        players.add(new Players(15,"Phạm Đức Huy",Position.MF));
        players.add(new Players(6,"Lương Xuân Trường",Position.MF));
        players.add(new Players(20,"Phan Văn Đức",Position.MF));
        players.add(new Players(14,"Nguyễn Hoàng Đức",Position.MF));
        players.add(new Players(8,"Lê Văn Xuân",Position.MF));
        players.add(new Players(11,"Nguyễn Tuấn Anh",Position.MF));
        players.add(new Players(9,"Nguyễn Văn Toàn",Position.FW));
        players.add(new Players(22,"Nguyễn Tiến Linh",Position.FW));
        players.add(new Players(10,"Nguyễn Công Phượng",Position.FW));
        players.add(new Players(18,"Hà Đức Chinh",Position.FW));

        return players;
    }

    public void printTeam()
    {
        for (Players p: players)
        {
            System.out.println(p);
        }
    }
}
