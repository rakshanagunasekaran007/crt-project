import java.util.Scanner;

public class Validation {
    private static final Scanner sc=new Scanner(System.in);

    public static int readPositiveInt(String message){
        while(true){
            System.out.print(message);
            String input=sc.nextLine().trim();

            if(!input.matches("\\d+")){
                System.out.println("Invalid input. Enter numbers only.");
                continue;
            }

            try{
                int value=Integer.parseInt(input);

                if(value<=0){
                    System.out.println("Enter a value greater than 0.");
                    continue;
                }

                return value;
            }catch(NumberFormatException e){
                System.out.println("Number is too large.");
            }
        }
    }

    public static int readRange(String message,int min,int max){
        while(true){
            int value=readPositiveInt(message);

            if(value<min || value>max){
                System.out.println("Enter a number from "+min+" to "+max+".");
                continue;
            }

            return value;
        }
    }

    public static String readName(String message){
        while(true){
            System.out.print(message);
            String value=sc.nextLine().trim();

            if(!value.matches("[a-zA-Z. ]+") || value.length()<3){
                System.out.println("Invalid name. Enter letters only.");
                continue;
            }

            return value;
        }
    }

    public static String readPhone(){
        while(true){
            System.out.print("Enter 10-digit phone number: ");
            String value=sc.nextLine().trim();

            if(!value.matches("[6-9]\\d{9}")){
                System.out.println("Invalid phone number.");
                continue;
            }

            return value;
        }
    }

    public static String readTicketType(){
        while(true){
            System.out.print("Enter ticket type (Regular/Premium/Recliner): ");
            String value=sc.nextLine().trim();

            if(value.equalsIgnoreCase("regular") ||
               value.equalsIgnoreCase("premium") ||
               value.equalsIgnoreCase("recliner")){
                return value;
            }

            System.out.println("Invalid ticket type.");
        }
    }

    public static String readTime(){
        while(true){
            System.out.print("Enter show time (HH:MM): ");
            String value=sc.nextLine().trim();

            if(!value.matches("([01]\\d|2[0-3]):[0-5]\\d")){
                System.out.println("Invalid time. Example: 18:30");
                continue;
            }

            return value;
        }
    }

    public static double readPositiveDouble(String message){
        while(true){
            System.out.print(message);
            String value=sc.nextLine().trim();

            try{
                double number=Double.parseDouble(value);

                if(number<=0){
                    System.out.println("Enter a value greater than 0.");
                    continue;
                }

                return number;
            }catch(NumberFormatException e){
                System.out.println("Invalid amount.");
            }
        }
    }

    public static String readNonEmpty(String message){
        while(true){
            System.out.print(message);
            String value=sc.nextLine().trim();

            if(value.isEmpty()){
                System.out.println("Input cannot be empty.");
                continue;
            }

            return value;
        }
    }
}
