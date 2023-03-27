package codewars.kyu5;

/*
https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
*/

public class Scramblies {
  public static void main(String[] args) {
    Scramblies scramblies = new Scramblies();
    scramblies.test();
  }
  public boolean scramble(String str1, String str2) {
    int[] str1Arr = new int[26];
    int[] str2Arr = new int[26];

    for (char c : str1.toCharArray()) {
      str1Arr[c-'a']++;
    }

    for (char c : str2.toCharArray()) {
      str2Arr[c-'a']++;
    }

    for (int i=0; i<26; i++) {
      if (str1Arr[i] < str2Arr[i])
        return false;
    }

    return true;
  }

  public void test() {
    Scramblies scramblies = new Scramblies();
    System.out.println(scramblies.scramble("rkqodlw", "world"));
    System.out.println(scramblies.scramble("cedewaraaossoqqyt","codewars"));
    System.out.println(!scramblies.scramble("katas", "steak"));
    System.out.println(!scramblies.scramble("scriptjavx","javascript"));
    System.out.println(!scramblies.scramble("scriptjavx","javascript"));
  }
}