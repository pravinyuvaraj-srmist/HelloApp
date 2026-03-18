public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "Hello, ";
            
            int count = 0;
            for (String name : args) {   // enhanced for loop
                result += name;
                count++;
                if (count < args.length) {
                    result += ", ";
                }
            }
            
            result += "!";
            System.out.println(result);
        }
    }
}