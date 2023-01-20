class Command
{
    public static void main(String[] args) {
        for (int i =0 ; i < args.length ; i++)
        {
            System.out.println(args[i]);
        }
        if(args.length <= 2)
        {
            System.out.println(" Less than Tow arguments are passed");
        }
        else
        {
            System.out.println("More than 2 arguments");
        }
    }
}