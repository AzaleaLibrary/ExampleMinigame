package com.azalealibrary.example;

import be.seeseemelk.mockbukkit.MockBukkit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExampleMinigameTest {

    private ExampleMinigame plugin;

    @BeforeEach
    public void setUp() {
        MockBukkit.mock();
        plugin = MockBukkit.load(ExampleMinigame.class);
    }

    @AfterEach
    public void tearDown() {
        MockBukkit.unmock();
    }

    @Test
    void onLoad() {
//        plugin.getLogger().log(Level.INFO, "onLoad");
    }

    @Test
    void onEnable() {
//        plugin.getLogger().log(Level.INFO, "onEnable");
    }

    @Test
    void onDisable() {
//        plugin.getLogger().log(Level.INFO, "onDisable");
    }
}