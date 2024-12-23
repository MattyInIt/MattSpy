package org.mattplugins.mattSpy.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length != 1) {
            player.sendMessage("Usage: /nick <new_nickname>");
            return true;
        }

        String newNick = args[0];
        player.setDisplayName(newNick);
        player.setPlayerListName(newNick);
        player.sendMessage("Your nickname has been changed to " + newNick);
        return true;
    }
}