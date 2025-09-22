import java.util.Scanner; 
import java.util.Random;
class Main {

  private static double check(int[] arr, int toCheckValue)
  {
      // check if the specified element
      // is present in the array or not
      // using Linear Search method
      
      double y = 0;
      for (int element : arr) {
          if (element == toCheckValue) {
              
              y++;
          }
      }

      // Print the result
   return y;
  }//end fuction
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    boolean gameisrunning = true;
    int num;
    int x = 1;
    System.out.println("Welcome to Probability  Generator!");
    while(gameisrunning){
      boolean notChose = true;
      int upperbound = 6;
      while(notChose){
      System.out.println("Type [1] for 1d6, [2], for 1d4, and [3] to flip a coin!");

      x = scan.nextInt();
      
      if(x==1){
        upperbound = 6;
        notChose = false;
      }
      else if(x==2){
        upperbound = 4;
        notChose = false;
      }
      else if(x==3){
        upperbound = 2;
        notChose = false;
      }
      else{
        System.out.println("Invalid Input, Try Again...");
      }
    }//end while notchose
      
      


      
      
      //generate random values from 0-5
      System.out.println("Enter # of rolls: ");
      int input;
      
      input = scan.nextInt();
      int[] intArray = new int[input];

     String output;
      for(int i = 0; i < input; ++i){
        num = rand.nextInt(upperbound);
        num++;
        intArray[i] = num;

        if (x==3){
          if (num==1){
            output = "You flipped heads";
          }
          else{
            output = "You flipped tails";
          }
        }
       else{
         output = "You rolled a "+num;
       }
       
        
        System.out.println(output);
      }
      String per1 = "("+(check(intArray,1) / input) *100+")";
      String per2 = "("+(check(intArray,2) / input)*100+")";
      String per3 = "("+(check(intArray,3) / input)*100+")";
      String per4 = "("+(check(intArray,4) / input)*100+")";
      String per5 = "("+(check(intArray,5) / input)*100+")";
      String per6 = "("+(check(intArray,6) / input)*100+")";
      System.out.println(per1);
      if (x==3){
        
        System.out.println("After "+input+" flips, heads came up "+check(intArray,1)+" times, or "+per1+"%. Tails came up "+check(intArray,2)+" times, or "+per2+"%.");
      }
      else if(x==1){
        System.out.println("After "+input+" rolls, 1 came up "+check(intArray,1)+" times, or "+per1+"%. 2 came up "+check(intArray,2)+" times, or "+per2+"%. 3 came up "+check(intArray,3)+" times, or "+per3+"%. 4 came up "+check(intArray,4)+" times, or "+per4+"%. 5 came up "+check(intArray,5)+" times, or "+per5+"%. 6 came up "+check(intArray,6)+" times, or "+per6+"%.");
      }
      else if(x==2){
        System.out.println("After "+input+" rolls, 1 came up "+check(intArray,1)+" times, or "+per1+"%. 2 came up "+check(intArray,2)+" times, or "+per2+"%. 3 came up "+check(intArray,3)+" times, or "+per3+"%. 4 came up "+check(intArray,4)+" times, or "+per4+"%.");
      }
      
      
    }
    
    
    


  }
}