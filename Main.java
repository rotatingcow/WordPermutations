import java.util.ArrayList;

class Main {

  static int combinationsInt = 0;
  static String combinationsString = "";

  public static void main(String[] args) {

    String word = "Max";
    int n = word.length();
    
    Main main = new Main();
    main.scrambleWord(word, 0, n-1);
    System.out.println(combinationsInt);

  }

  public Main(){

  }

  private void scrambleWord(String str, int l, int r){ 

    if (l == r){
        if(!combinationsString.contains(str)){
            System.out.println(str);
            combinationsInt += 1;
            combinationsString += str;
        }
        
    }else {
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            scrambleWord(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
  }

  private String swap(String word, int i, int j){
    
    char temp;
    char[] charArray = word.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
}


}