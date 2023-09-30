package com.goottsy.Utils;

import co.aikar.commands.BukkitCommandCompletionContext;
import co.aikar.commands.CommandCompletions;
import com.google.common.collect.ImmutableList;
import com.goottsy.PluginTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Types {
    PluginTemplate instance;

    public Types(PluginTemplate instance){
        this.instance = instance;
        CommandCompletions<BukkitCommandCompletionContext> commandCompletions = PluginTemplate.commandManager.getCommandCompletions();
        commandCompletions.registerAsyncCompletion("doors", c -> {
            Collection<String> doorsTypes = Arrays.asList(Types.DooorsType.values()).stream().map(e -> e.toString()).collect(Collectors.toList());
            return doorsTypes;
        });


        commandCompletions.registerAsyncCompletion("bool", c -> {
            return ImmutableList.of("true", "false");
        });


    }

    public enum DooorsType {
        doorRight, doorLeft;
    }


}
