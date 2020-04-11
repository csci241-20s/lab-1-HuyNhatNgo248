package lab1;

public class Hello {
    public static void main(String[] args) {
        String s = "Hello, ";
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1)
                s += args[i] + " ";
            else
                s += args[i] + "!";
        }

        System.out.println(s);
    }
}
