public class namePrint {
    public static void main(String[] args) {
        //row
        for (int i =1; i<=7; i++)
        {
            //T
            for (int k=1;k<=7;k++)
            {
                if (k==4 ||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            //E
            for (int k=1;k<=7;k++)
            {
                if (k==1 ||i==1 || i==7 || i==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            //L
            for (int k=1;k<=7;k++)
            {
                if (k==1 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            //U
            for (int k=1;k<=7;k++)
            {
                if (k==1 || k==7 ||i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            //s
            for (int k=1;k<=7;k++)
            {
                if (i==1 ||i==7 ||i==4 || k==(i/2))
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");

            }
            System.out.print(" ");

            //c
            for (int k=1;k<=7;k++)
            {
                if (i==1 ||i==7 ||k==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            //o
            for (int k=1;k<=7;k++)
            {
                if (i==1 ||i==7 ||k==1 ||k==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print(" ");

            System.out.println();
        }
    }

}
