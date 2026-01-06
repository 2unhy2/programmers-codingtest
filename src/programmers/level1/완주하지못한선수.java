package programmers.level1;

import java.util.HashMap;

public class 완주하지못한선수 {
  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> map = new HashMap<>();

    for (String name : participant) {
      if (map.containsKey(name)) {
        map.put(name, map.get(name) + 1); // 동명이인 +1
      } else {
        map.put(name, 1);
      }
    }

    for (String name : completion) {
      map.put(name, map.get(name) - 1);
    }

    for (String key : map.keySet()) {
      if (map.get(key) == 1) {
        return key;
      }
    }
    return "";
  }

  public static void main(String[] args) {
    완주하지못한선수 sol = new 완주하지못한선수();

    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};

    String result = sol.solution(participant, completion);
    System.out.println(result);
  }

}
