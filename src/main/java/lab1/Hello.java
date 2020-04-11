package lab1;

public class Hello {
  public static void main(String[] args) {
    String s = "Hello, ";
    for (int i = 0; i < args.length; i++) {
      s += args[i] + " ";
    }

    s += "!"; 
    System.out.println(s);
  }
}
