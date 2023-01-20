class CommandLine
{
    public static void main(String[] args) {
        // Learning to use command line arguments in java which are passed via command line
        // args in main function is used to take arguments 

        String a = args[0];
        String b = args[1];

        System.out.println(a+" "+ b);

        int am = Integer.parseInt(args[0]);
        int an = Integer.parseInt(args[1]);

        System.out.println(am + " " +an + " There sum is " + (am+an) );
    }
}