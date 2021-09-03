public class exam {
    
    public static void main(String[] args) {
        int maths, phy, che, bio;
        maths=80;
        phy=90;
        che=89;
        bio=100;

        int total = maths + phy + che + bio;
        double per = total/4;

        System.out.println("Total Marks = "+total);
        System.out.println("Percent = "+per);

    }
}
