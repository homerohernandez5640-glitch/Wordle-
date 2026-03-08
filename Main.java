import java.util.Scanner;
import java.util.Random;

public class Main
{
    
    public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

String First;
String Second;
String Third;
String Fourth;
String Fifth;

  //List of possible words that might be used
  String[] Words = {"World","Steve","Great","Plant", "Daily", "Broke", "Cheap", "Brown", "Chest", "Dated", "Cycle", "Check", "Bring"};
 String word = Words[random.nextInt(0,13)];

First = scanner.nextLine();
  wordCheck(word, First);
  System.out.println("**************************************");

  Second = scanner.nextLine();
  wordCheck(word, Second);
    System.out.println("**************************************");

  Third = scanner.nextLine();
  wordCheck(word,Third);
    System.out.println("**************************************");

  Fourth = scanner.nextLine();
  wordCheck(word,Fourth);
    System.out.println("**************************************");

  Fifth = scanner.nextLine();
  wordCheck(word,Fifth);
    System.out.println("**************************************");
  scanner.close();
  
    }    
static void wordCheck(String word, String response){
int j = 0;
for(int i = 0; i<5; i++){
  j = j+1;
 String Wword = word.substring(i,i+1);
  String Rresponse = response.substring(i,i+1);

  if(Rresponse.equalsIgnoreCase(Wword)){
  System.out.println(j+".Green");
}
else if(word.contains(Rresponse)){
  System.out.println(j+".Yellow");
}
else{System.out.println(j+".Grey");
}}
}

}