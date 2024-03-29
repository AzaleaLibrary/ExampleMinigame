package com.azalealibrary.example.teams;

import com.azalealibrary.azaleacore.api.MinigameTeam;
import com.azalealibrary.azaleacore.example.Registry;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class BlueTeam extends MinigameTeam {

    public BlueTeam() {
        super("Blue Team", "Kill all red players.", ChatColor.BLUE, Sound.ENTITY_VILLAGER_AMBIENT);
    }

    @Override
    public void prepare(Player player) {
        player.getInventory().clear();
        player.getInventory().addItem(Registry.BLUE_PLAYER_SWORD.getItemStack());
    }
}
