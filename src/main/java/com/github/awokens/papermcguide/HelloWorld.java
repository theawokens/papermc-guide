package com.github.awokens.papermcguide;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Hello World!");
    }
}
