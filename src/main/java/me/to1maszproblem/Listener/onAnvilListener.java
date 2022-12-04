package me.to1maszproblem.Listener;

import me.to1maszproblem.util.ChatUtil;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class onAnvilListener implements Listener {
    @EventHandler
    public void onAnvil(PlayerInteractEvent e){
        Action action = e.getAction();
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();


        if(action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.ANVIL)) {
                e.setCancelled(true);

                if (!p.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND), 1)) {
                    p.sendTitle(ChatUtil.fixColor("&4Brak przedmiotów!"), "§cNie posiadasz §71 DIAMENTA §cdo naprawy", 20, 50, 20);
                    return;
                }
                p.getInventory().removeItem(new ItemStack(Material.DIAMOND, 1));
                p.sendTitle(ChatUtil.fixColor("&6NAPRAWIONO!"), "§aPrzedmiot został naprawiony!", 20, 50, 20);
                p.getItemInHand().setDurability((short) 0);
                p.playSound(p, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            }
        }
    }
}
