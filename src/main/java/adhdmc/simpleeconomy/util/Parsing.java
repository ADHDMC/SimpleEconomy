package adhdmc.simpleeconomy.util;

import adhdmc.simpleeconomy.SimpleEconomy;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;

public class Parsing {

    private static final MiniMessage miniMessage = SimpleEconomy.getMiniMessage();

    public static Component parsePrefixOnly(String message){
        return miniMessage.deserialize(message,
                Placeholder.parsed("plugin_prefix", SEMessage.PLUGIN_PREFIX.getMessage()));
    }

    public static Component parsePrefixTarget(String message, Component target){
        return miniMessage.deserialize(message,
                Placeholder.parsed("plugin_prefix", SEMessage.PLUGIN_PREFIX.getMessage()),
                Placeholder.component("target", target));
    }

    public static Component parsePrefixUsage(String message, String usage){
        return miniMessage.deserialize(message,
                Placeholder.parsed("plugin_prefix", SEMessage.PLUGIN_PREFIX.getMessage()),
                Placeholder.parsed("usage", usage));
    }

    public static Component parsePrefixInput(String message, String input){
        return miniMessage.deserialize(message,
                Placeholder.parsed("plugin_prefix", SEMessage.PLUGIN_PREFIX.getMessage()),
                Placeholder.parsed("usage", input));
    }
}
