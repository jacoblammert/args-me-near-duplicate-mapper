import org.apache.commons.cli.*;

import java.util.Arrays;

public class main_class {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        // example:
        // --in inputfile --out outputfile --invers 1234 --outvers 1235

        String input_file = "", output_file = "";
        String input_version = "", output_version = "";
        String name = "";


        try {
            Options options = new Options();
            Option in = Option.builder().longOpt("in").argName("file").hasArg().desc("use given file for log").build();
            Option out = Option.builder().longOpt("out").argName("file").hasArg().desc("use given file for log").build();
            Option invers = Option.builder().longOpt("invers").argName("file").hasArg().desc("use given file for log").build();
            Option outvers = Option.builder().longOpt("outvers").argName("file").hasArg().desc("use given file for log").build();

            options.addOption(in);
            options.addOption(out);
            options.addOption(invers);
            options.addOption(outvers);
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);

            // has the logFile argument been passed?
            if (cmd.hasOption("in")) {
                //get the logFile argument passed
                System.out.println(cmd.getOptionValue("in"));
                input_file = cmd.getOptionValue("in");
            }if (cmd.hasOption("out")) {
                System.out.println(cmd.getOptionValue("out"));
                output_file = cmd.getOptionValue("out");
            }if (cmd.hasOption("invers")) {
                System.out.println(cmd.getOptionValue("invers"));
                input_version = cmd.getOptionValue("invers");
            }if (cmd.hasOption("outvers")) {
                System.out.println(cmd.getOptionValue("outvers"));
                output_version = cmd.getOptionValue("outvers");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Input file: " + input_file);
        System.out.println("Output file: " + output_file);
        System.out.println("Input version: " + input_version);
        System.out.println("Output version: " + output_version);

        //Linux run shell skript

        ProcessBuilder processBuilder = new ProcessBuilder();

        // -- Linux --

        // Run a shell command
        String folder = "";
        String name_skript = "";
        processBuilder.command(name, "-c", "ls " + folder);

    }

}
