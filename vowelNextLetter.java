public class vowelNextLetter {
    public static void main(String[] args) {

        String s = "Computer";
        s = s.trim();
        s = s.toUpperCase();
        int l = s.length();
        char c;

        System.out.println(s);

        for(int i=0;i<l;i++)
        {
            c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                int n = (int)c;
                char r = (char)(n+1);
                System.out.print(r);
            }
            else
            {
                System.out.print(c);
            }

        }
        System.out.println();

    }
    
}
