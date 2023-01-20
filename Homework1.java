class Homework1
{
    public static void main(String[] args) {
        // Trying to create a basic 2 number calculator on commandLine 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        char s = args[1].charAt(0);

        if(s=='+')
        {
            System.out.println("The sum of two numbers is" + (a+b));
        }
        else if(s=='-')
        {
            System.out.println("The substraction of two numbers is" + (a-b));
        }

        else if(s=='*')
        {
            System.out.println("The multiplication of two numbers is" + (a*b));
        }

        else if(s=='/')
        {
            System.out.println("The divison of two numbers is" + (a/b));
        }
        else
        {
            System.out.println("Invalid Operation");
        }
    }
}