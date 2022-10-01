package com.example.plugin;

import com.azalealibrary.azaleacore.api.Minigame;
import com.azalealibrary.azaleacore.api.MinigameProperty;
import com.azalealibrary.azaleacore.api.WinCondition;
import com.azalealibrary.azaleacore.broadcast.Broadcaster;
import com.azalealibrary.azaleacore.broadcast.message.TitleMessage;
import com.azalealibrary.azaleacore.minigame.MinigameConfiguration;
import com.google.common.collect.ImmutableList;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

public class ExampleMinigame extends Minigame<ExampleRound> {

    private final MinigameProperty<Location> spawn;

    public ExampleMinigame(World world) {
        this.spawn = MinigameProperty.location("spawn", world.getSpawnLocation()).build();
    }

    public Location getSpawn() {
        return spawn.get();
    }

    @Override
    public String getName() {
        return "ExampleMinigame";
    }

    @Override
    public MinigameConfiguration getConfiguration() {
        return MinigameConfiguration.create(Main.INSTANCE).tickRate(20).build();
    }

    @Override
    public ImmutableList<WinCondition<ExampleRound>> getWinConditions() {
        return ImmutableList.of(new WinCondition<>(new TitleMessage("No players :("), 123, ExampleRound::allPlayersDead));
    }

    @Override
    public ExampleRound newRound(List<Player> players, Broadcaster broadcaster) {
        return new ExampleRound(players, broadcaster);
    }

    @Override
    public List<MinigameProperty<?>> getProperties() {
        return List.of(spawn);
    }
}
