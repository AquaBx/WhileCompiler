package while_compiler;

import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        Command command = new Command();

        if (args.length == 0) {
            System.out.println(command.helpMessage());
            return;
        }

        switch (args[0]) {
            case "compile":
                command.compile_command(Arrays.copyOfRange(args, 1, args.length));
                break;

            case "run":
                command.run_command(Arrays.copyOfRange(args, 1, args.length));
                break;

            case "help":
                System.out.println(command.helpMessage());
                break;

            default:
                System.out.println(command.helpMessage());
                break;
        }
    }

}
