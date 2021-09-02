// // // public class shivam
// // // {
// // //    enum TrafficLight
// // //     {
// // //        RED,
// // //        GREEN,
// // //        YELLOW;
// // //     }
    
// // //     public static void stop()
// // //      { 
// // //         int a = 10;
// // //         System.out.print(TrafficLight[0]);//accessing the constant values
// // //         System.out.printf(" : %d seconds\n",a);
// // //      }  
     
// // //      public static void startengine()
// // //      {
        
// // //         int b = 5;
// // //         System.out.print(TrafficLight.YELLOW);//accessing the constant values
// // //         System.out.printf(" : %d seconds\n",b);
// // //      }  
     
// // //      public static void go()
// // //      {
      
// // //         int c = 1;
// // //         System.out.print( TrafficLight.GREEN );//accessing the constant values
// // //         System.out.printf(" : %d seconds\n",c);
// // //      }   
     
// // //       public static void main(String args[])
// // //        {
          
// // //         stop();
// // //         startengine();
// // //         go();
     
   
// // // }
// // // }



// // public enum shivam {

// //     RED(1),
// //     GREEN(3),
// //     YELLOW(50);
// //     private final int time;
    
// //     shivam(int r){
// //      this.time=r;
     
// //     }
// //     public int getTime(){
     
// //      return time;
// //     }
// //    public static void main(String[] args) {
// //      // TODO Auto-generated method stub
// //      shivam lights = null;
// //      System.out.println("RED LIGHT : "+lights.RED.getTime()+" MINUTES");
// //      System.out.println("YELLOW LIGHT : "+lights.YELLOW.getTime()+" SECONDS ");
// //      System.out.println("GREEN LIGHT : "+lights.GREEN.getTime()+" MINUTES");
// //     }
   
// //    }




// import java.util.*;
// public class shivam
//  {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         Double c[] = new Double[10];
//         Double d[] = new Double [10];
//         double a , b;

//         System.out.println("Enter the elements of first array");
//            for(int counter = 0; counter < c.length ; counter++)
//             {
//                  a = sc.nextDouble();
//                  c[counter] = a;
//             }

//             System.out.println("Enter the elements of second array");
//            for(int counter = 0; counter < c.length ; counter ++)
//             {
//                  b = sc.nextDouble();
//                  d[counter] = b;
//             }

//          System.out.printf("%4s %4s\n","index","quotient");

//          for(int counter = 0; counter < c.length ; counter ++)  
//           System.out.printf("%d \t%. 4f\n",counter,(double)c[counter]/d[counter]);
          
//           sc.close();
//     }
    
// }


import java.util.*;
public class shivam
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows");
       int N = sc.nextInt();
       System.out.println("Enter Columns");
       int M = sc.nextInt();
       
       int a[][] = new int[N][M];
       int m1=1;
       
       for(int i = 0 ; i < N ; i++)
       {
         for(int j = 0 ; j < M ; j++)
         {
             if((i+1)%2==0){
                  a[i][M-1-j]=m1++;
             }
             else a[i][j]=m1++;
           
         }   
       } 
       
        for(int i = 0 ; i < N ; i++)
        {
         for(int j = 0 ; j < M; j++)
         {
           System.out.printf("%d ",a[i][j]);
         } 
         System.out.println();
       }   
}
}