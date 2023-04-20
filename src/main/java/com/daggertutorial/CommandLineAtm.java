package com.daggertutorial;

import java.util.Scanner;
import com.daggertutorial.Command.Result;
class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouterFactory commandRouterFactory =
                DaggerCommandRouterFactory.create();
        CommandRouter commandRouter = commandRouterFactory.router();

        while (scanner.hasNextLine()) {
            Result unused = commandRouter.route(scanner.nextLine());
        }
    }
}

