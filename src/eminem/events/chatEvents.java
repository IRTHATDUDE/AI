package eminem.events;

import eminem.emotion;
import eminem.main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Matthew on 9/5/2016.
 */
public class chatEvents implements Listener {
    @EventHandler
    public void welcomeBackEvent (PlayerJoinEvent e) {
        String namerino = main.format(main.configConfig.getString("Turing.main.chat")) + main.format(main.configConfig.getString("Turing.main.name"));
        Player player = e.getPlayer();

        if (player.hasPlayedBefore() == false){
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main.instance, new Runnable() {
                public void run() {
                    Bukkit.broadcastMessage(namerino + "Yo Welcome " + player.getName());

                }

            }, 20);

        }
        if (player.hasPlayedBefore() == true){
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(main.instance, new Runnable() {
                public void run() {
                    Bukkit.broadcastMessage(namerino + "wb");

                }

            }, 20);

        }



    }
    
}
