public class Pyramidpattern {
    public static void main(String[] args) {


//        for(int i=0;i<5;i++){
//            for(int j=5-i;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


        /*for (int i=0; i<=5-1; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k<= 5-1-i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}*/

        /*for (int i = 1,k=1;i <=5; i++) {
            for (int j = 1; j<=5;j++){

                    System.out.print(k++%2);
            }
            System.out.println();

        }


        }*/
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1,k=1; j <= i; j++) {
                System.out.print(k++%2);
            }
            System.out.println();

        }*/
        /*for (int i = 1, k = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {

                if(k++%2==0)
                System.out.print("A");
                else
                    System.out.print("B");
            }

            System.out.println();
        }
    }*/


        /*char[] data={'A','B','C','D','E','F','G','H'};
        for(int row=1,k=65;row<=5;row++){
            for(int c=0;c<row;c++){
                System.out.print((char) k++);
            }
            System.out.println();
        }*/
        /*                             *
         ***
         *****
         *******
         *********
         *******
         *****
         ***
         *     */

        /*int space = 10 - 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int i = 1; i <= 10 - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= 2 * (10 - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }
    }*/
        /*          1
                    2 1
                    3 2 1
                    4 3 2 1
                    5 4 3 2 1     */

       /* for (int i = 1; i <= 5; i++) {
            for (int j = i; j>=1; j--) {
                System.out.print(j+" ");
                
            }

            System.out.println(  );
        }
    }*/


                                    /*  1
                                        10
                                        101
                                        1010
                                        10101  */

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1,k=1; j <= i; j++) {
                System.out.print(k++ % 2);
            }
            System.out.println();
        }
    }*/

        /*                                                  1
                                                            2 2
                                                            3 3 3
                                                            4 4 4 4
                                                            5 5 5 5 5
                                                    */


       /* for (int i = 1; i <= 5; i++) {
            for (int j = 1, k = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }*/

//22
       /* for (int i=1; i<=10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
                                                       //lower half
        for(int i=10-1; i>=1; i--) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j <= 10; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
                }*/



        //15

        for (int i=1; i<=6; i++) {
            for (int j = 6; j>i; j--) {
                System.out.print(" ");
            }
            int temp=1;
            for (int k= 1; k<= i; k++) {
                System.out.print(temp + " ");
                temp=temp*(i-k)/(k);
            }
            System.out.println();
        }

    }
}
