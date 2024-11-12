public class Q11 {
    public static void main(String[] args) {
        String[] inputs = {"100", "10.2", "5.hello", "100hello"};

        for (String str : inputs) {
            try {
                int intValue = Integer.parseInt(str);
                System.out.println(str + " is a valid integer.");
            } catch (NumberFormatException e) {
                try {
                    double doubleValue = Double.parseDouble(str);
                    System.out.println(str + " is a valid double.");
                } catch (NumberFormatException ex) {
                    System.out.println(str + " is neither a valid integer nor a valid double.");
                }
            }
        }
    }
}
