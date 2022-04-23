public class switchprog
{
    public static void main(String[] args) {
        char x = 'A';
        switch(x)
        {
            case 'a': System.out.println("Honest");
            case 'b': System.out.println("Punctual");
            break;
            case 'c': System.out.println("Committed");
            default: System.out.println("Average");
        }
    }
}