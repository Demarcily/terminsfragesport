import java.util.*;
import javax.swing.*;

public class questions {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int answer = in.nextInt();
    Integer QuestionAnswer = new Integer(3);

    if (QuestionAnswer.equals(answer)) {
      System.out.println("Congrats, you were correct");
    }
    else {
      System.out.println("Congrats, you suck!");
    }
  }
}
