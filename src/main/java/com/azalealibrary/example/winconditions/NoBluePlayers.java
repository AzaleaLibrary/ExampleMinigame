package com.azalealibrary.example.winconditions;

import com.azalealibrary.azaleacore.api.WinCondition;
import com.azalealibrary.azaleacore.example.Registry;
import com.azalealibrary.azaleacore.round.Round;

public class NoBluePlayers extends WinCondition {

    public NoBluePlayers() {
        super("All blue players have been eliminated", 100, Registry.RED_TEAM);
    }

    @Override
    public boolean evaluate(Round round) {
        return round.getTeams().getAllInTeam(Registry.BLUE_TEAM).isEmpty();
    }
}
