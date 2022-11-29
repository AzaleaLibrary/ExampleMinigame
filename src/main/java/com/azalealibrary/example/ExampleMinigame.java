package com.azalealibrary.example;

import com.azalealibrary.azaleacore.foundation.registry.AzaleaRegistry;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

import java.io.File;

@SuppressWarnings("unused")
@Plugin(name = "ExampleMinigame", version = "1.0")
@ApiVersion(ApiVersion.Target.v1_13) // compatible with all post-1.13 mc versions
public final class ExampleMinigame extends JavaPlugin {

    public static ExampleMinigame INSTANCE;

    public ExampleMinigame() {}

    public ExampleMinigame(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        AzaleaRegistry.EVENT_BUS.register(new ExampleRegistry());
    }

    @Override
    public void onDisable() {  }
}
