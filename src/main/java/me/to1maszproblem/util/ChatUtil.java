package me.to1maszproblem.util;

import org.bukkit.ChatColor;

public class ChatUtil {

    public static String fixColor(String s) {
        return s == null ? "" : ChatColor.translateAlternateColorCodes('&', s).replaceAll("<3", "❤").replaceAll(">>", "●");
    }
}
