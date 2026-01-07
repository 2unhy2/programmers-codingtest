package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class 문제12605번 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    Stack<String> stack = new Stack<>();
    for(int i = 0; i < n; i++){
      String line = sc.nextLine();
      String[] arr = line.split(" ");
      for(int j = 0; j < arr.length; j++){
        stack.push(arr[j]);
      }
      System.out.print("Case #"+(i+1)+": ");
      while(!stack.isEmpty()){
        System.out.print(stack.pop() + " ");
      }
      System.out.println();

    }
  }

}
