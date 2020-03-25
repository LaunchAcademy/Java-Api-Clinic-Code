import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Post {
  private static String LIST_URL = "https://jsonplaceholder.typicode.com/posts";
  private int userId;
  private int id;
  private String title;
  private String body;

  public static List<Post> getList() throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    return Arrays.asList(mapper.readValue(new URL(LIST_URL), Post[].class));
  }


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
