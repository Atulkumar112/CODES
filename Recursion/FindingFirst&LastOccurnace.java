import java.util.*;

public class Practice {
  
  //Code 1------------------------------------------------------------------------------------------------------------------------
  // This below code is the best solution as compare to code 2 and code 3
  //because  i done this problem with the help of only one recursion method
  
  public static int first = -1;  //static variables
  public static int last = -1;
  
  public static void findFirstLastOccurrenc(String s, char ele, int idx){
    if(idx == s.length()){
      System.out.println(first);
      System.out.println(last);
      return ;
    }
    
    
    char currChar = s.charAt(idx);
    if(currChar == ele){
      if(first == -1){
        first = idx;
      }
      else{
        last = idx;
      }
    }
    findFirstLastOccurrenc(s, ele, idx+1);
  }
  
  //   //code 2--------------------------------------------------------------------------------------------------------------
  //method for calculating first occurance of the elememtn 
//   static  int last = -1;
//   static void firstOccurance(String s, char a, int n){
    
//     if(n<0){
//       return ;
//     }
  
//     firstOccurance(s, a, n-1);
  
//     if(s.charAt(n)==a && last == -1){
//       last = n;
//       System.out.println("the first occurance of given element index is: "+n);
//         return ;        
//       }  
//   }
  

//   //method for calculating last occurance of the elememtn 
//   static void lastOccurance(String s, char a, int n){
//     if(s.charAt(n) == a){
//       System.out.println("the last occurance of given element index is: "+n);
//       return ;
//     }
    
//     lastOccurance(s, a, n-1);
    
//   }
  
  
  
  public static void main(String[] args) {
    String s = "abaacdaefaah";
    char a = 'a';
    int n = s.length();
    
    firstOccurance(s, 'a', n-1);
    lastOccurance(s, 'a', n-1);
    
    
    
    //code 3 ---------------------------------------------------------------------------------------------------
    //------------------------------------ Iterative method --------------
    // int n = s.length();
    // for(int i=0; i<n; i++){
    //   if(s.charAt(i) == a){
    //     System.out.println("the first occurance of given element index is: "+ i);
    //     break;
    //   }
    // }
    
    // for(int i=n-1; i>0; i--){
    //   if(s.charAt(i) == a){
    //     System.out.println("the last occurance of the given element index is: "+ i);
    //     break;
    //   }
    // }
  }
}

