import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Formation
{
    public static void selectTeam(int m, int n, int p)
    {
        PlayersRepo pRepo=new PlayersRepo();
        ArrayList<Players> allPlayers = pRepo.playersData();

            ArrayList<Players> selectedTeam=new ArrayList<>();
            Random general = new Random();
            int goalKeeperSize=0;
            int defenderSize=0;
            int midFielderSize=0;
            int forwarderSize=0;

            while (goalKeeperSize<1)
            {
                int rdGoalKeeper= general.nextInt(22);
                if (allPlayers.get(rdGoalKeeper).getPosition().equals(Position.GK))
                {
                    selectedTeam.add(allPlayers.get(rdGoalKeeper));
                    goalKeeperSize++;
                }
            }

            while (defenderSize<m)
            {
                int rdDefender =general.nextInt(22);
                if (allPlayers.get(rdDefender).getPosition().equals(Position.DF) && !selectedTeam.contains(allPlayers.get(rdDefender)))
                {
                    selectedTeam.add(allPlayers.get(rdDefender));
                    defenderSize++;
                }

            }

            while (midFielderSize<n)
            {
                int rdMidFielder =general.nextInt(22);
                if (allPlayers.get(rdMidFielder).getPosition().equals(Position.MF) && !selectedTeam.contains(allPlayers.get(rdMidFielder)))
                {
                    selectedTeam.add(allPlayers.get(rdMidFielder));
                    midFielderSize++;
                }

            }

            while (forwarderSize<p)
            {
                int rdForwarder =general.nextInt(22);
                if (allPlayers.get(rdForwarder).getPosition().equals(Position.FW) && !selectedTeam.contains(allPlayers.get(rdForwarder)))
                {
                    selectedTeam.add(allPlayers.get(rdForwarder));
                    forwarderSize++;
                }
            }

            System.out.println("ĐỘI HÌNH RA SÂN ("+m+"-"+n+"-"+p+")");

            for (Players player: selectedTeam)
            {
                System.out.println(player);
            }
    }

}
