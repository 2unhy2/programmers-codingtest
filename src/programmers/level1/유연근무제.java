package programmers.level1;

public class 유연근무제 {
  public static void main(String[] args) {
    int[] schedules = {700, 800, 1100};
    int[][] timelogs = {
        {710, 2359, 1050, 700, 650, 631, 659},
        {800, 801, 805, 800, 759, 810, 809},
        {1105, 1001, 1002, 600, 1059, 1001, 1100}
    };
    int startday = 5;

    Solution sol = new Solution();
    int result = sol.solution(schedules, timelogs, startday);

    System.out.println(result);
  }

  static class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
      int answer = 0;

      for (int i = 0; i < schedules.length; i++) {
        boolean ok = true;

        int hopeTime = toMinute(schedules[i]);
        int limit = hopeTime + 10;

        for (int j = 0; j < 7; j++) { // 날짜(0~6)
          int day = (startday + j - 1) % 7 + 1; // 1~7

          if (day == 6 || day == 7) continue;

          int arrive = toMinute(timelogs[i][j]);
          if (arrive > limit) {
            ok = false;
            break;
          }
        }

        if (ok) answer++;
      }

      return answer;
    }

    private int toMinute(int time) {
      int hour = time / 100;
      int minute = time % 100;
      return hour * 60 + minute;
    }
  }

}

