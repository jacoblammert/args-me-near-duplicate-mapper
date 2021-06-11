import java.util.Arrays;

public class main_class {

    public static void main(String[] args){
        System.out.println(Arrays.toString(args));

        // example:
        // test --in inppaa --out outaa --invers 1234 --outvers 1235

        String input_file = "", output_file = "";
        String input_version = "", output_version = "";
        String name = args[0];

        for (int i = 0; i < args.length; ++i){
            if (args[i].contains("--")){
                String argument = args[i].replace("--","");

                switch (argument) {

                    case("in"): {
                        input_file = args[i + 1].toString();
                    }
                    case ("out"): {
                        output_file = args[i + 1].toString();

                    }
                    case("invers"): {
                        // version number of the input
                        input_version = args[i + 1].toString();

                    }
                    case ("outvers"): {
                        // version number of the output
                        output_version = args[i + 1].toString();

                    }
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + argument + "\nShould be: test --in inppaa --out outaa --invers 1234 --outvers 1235");
                }
            }
        }

        System.out.println(name);
        System.out.println("Input file: " + input_file);
        System.out.println("Output file: " + output_file);
        System.out.println("Input version: " + input_version);
        System.out.println("Output version: " + output_version);



    }

}
