package org.mattplugins.mattSpy;

import org.bukkit.plugin.java.JavaPlugin;
import org.mattplugins.mattSpy.commands.SpecCommand;
import org.mattplugins.mattSpy.commands.InvseeCommand;
import org.mattplugins.mattSpy.commands.NickCommand;

public class MattSpy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("spec").setExecutor(new SpecCommand());
        this.getCommand("invsee").setExecutor(new InvseeCommand());
        this.getCommand("nick").setExecutor(new NickCommand());
    }
}