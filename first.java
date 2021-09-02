class first{
    public static void main(String kutta[])
    {
        System.out.println("Shivam Prakash Mishra Mahan aadmi hain");
        String galat= "false"; 
        String sahi = " true";
        System.out.println(galat+sahi);
        for(int i=0;i<5;i++)
        {
            for(int j=5-i;j>1;j--)
            {
                System.out.print(" ");

            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");

            }
                System.out.println("");
        }

    }
}