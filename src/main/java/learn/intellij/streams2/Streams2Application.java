package learn.intellij.streams2;

import java.nio.charset.StandardCharsets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Streams2Application {

  public static void main(String[] args) {
      SpringApplication.run(Streams2Application.class, args);
      System.out.println("hello");
      var s = "hello".getBytes(StandardCharsets.UTF_8);
  }
}
