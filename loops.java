public class loops {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <=5){
//            System.out.print(i + " ");
//            i++;
//        }
//
//        System.out.println("Reverse Order");
//
//        i = 9;
//        while (i >=1){
//            System.out.print(i + " ");
//            i -=2;
//        }
//        for (int i= 1; i <=5; i++) {
//            for (int l = 1; l <= 5; l++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//        for (int i =1 ; i<=25; i++)
//        {
//            System.out.print(" * ");
//            if (i%5 ==0)
//            {
//                System.out.println();
//            }
//
//        }
        //print star box
        for (int i =1 ; i<=4; i++)
        {
            for (int j=1;j<=4;j++)
            {
                if (i ==1 || i==4 || j==1 || j==4)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
