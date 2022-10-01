package com.example.plugin;

import com.azalealibrary.azaleacore.AzaleaApi;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

import java.io.File;

@Plugin(name = "ExamplePlugin", version = "1.0")
public final class Main extends JavaPlugin {

    public static Main INSTANCE;

    public Main() {}

    public Main(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        AzaleaApi.getInstance().registerMinigame("ExampleMinigame", ExampleMinigame::new);
    }

    @Override
    public void onDisable() {  }
}
