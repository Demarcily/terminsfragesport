import java.util.*;
import javax.swing.*;

public class questions {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    String[] questions = {"Question 1", "Question 2", "Question 3"};
    int[] Answers = {1, 3, 5};

    int i = 0;

    while (i < questions.length) {
      System.out.println(questions[i]);
      int answer = in.nextInt();
      if (Objects.equals(Answers[i], answer)) {
        System.out.println(answer + " is correct");
      }
      else {
        System.out.println(answer + " is wrong");
      }
      i++;
    }
  }
}
