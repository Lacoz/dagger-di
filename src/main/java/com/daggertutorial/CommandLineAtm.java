package com.daggertutorial;

import java.util.Scanner;
import com.daggertutorial.Command.Result;
class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouter commandRouter = new CommandRouter();

        while (scanner.hasNextLine()) {
            Result unused = commandRouter.route(scanner.nextLine());
        }
    }
}
