package com.daggertutorial;

import com.daggertutorial.Command.*;

import java.util.*;

import javax.inject.Inject;

final class CommandRouter {
    private final Map<String, Command> commands = new HashMap<>();
    @Inject
    CommandRouter(HelloWorldCommand helloWorldCommand) {
        commands.put(helloWorldCommand.key(), helloWorldCommand);
    }

    Result route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        List<String> args = splitInput.subList(1, splitInput.size());
        Result result = command.handleInput(args);
        return result.status().equals(Status.INVALID) ?
                invalidCommand(input) : result;
    }

    private Result invalidCommand(String input) {
        System.out.println(
                String.format("couldn't understand \"%s\". please try again.", input));
        return Result.invalid();
    }

    // Split on whitespace
    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}
