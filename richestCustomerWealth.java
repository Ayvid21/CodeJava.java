// https://leetcode.com/problems/richest-customer-wealth/
public class richestCustomerWealth {
  static int maximumWealth(int[][] accounts) {
    int answer = 0;
    for(int person=0; person< accounts.length; person++) {
      int sum = 0;
      for(int account=0; account<accounts[person].length; account++) {
        sum += accounts[person][account];
      }
      if(sum > answer) {
        answer = sum;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    int[][] array = {
      {1,5 , 3},
      {7, 3, 6},
      {3, 5, 9}
    };
    System.out.println(maximumWealth(array));
  }
}
