package classes;



import java.util.Arrays;
import java.util.Scanner;




public class Console {
    public static boolean running = true;


    public static void inputCommand() {
       Scanner scanner = new Scanner(System.in);


       while (running) {
           commands(scanner.nextLine());
       }
   }

    public static void commands(String command) {
        switch (command) {
            case "help":
                Commands.help();
                break;
            case "info":
                Commands.info();
                break;
            case "exit":
                Commands.exit();
                break;
            case "show":
                Commands.show();
                break;
            case "add":
                Commands.add();

        }

    }

    static class Commands{
        @CommandAnnotation
        public static void help(){

            Arrays.stream(Commands.class.getMethods()).forEach(method -> {
                if(method.getAnnotation(CommandAnnotation.class) != null){
                    System.out.println(method.getName());
                }

            });

        }
        @CommandAnnotation
        public static void info(){

        }
        @CommandAnnotation
        public static void exit(){
            running = false;
        }
        @CommandAnnotation
        public static void show(){
           DataBase.getValues();
        }
        @CommandAnnotation
        public static void add(){
                System.out.println("что будем менять?");
                DataBase.getValues();
            }
        }

    }


