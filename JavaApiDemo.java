import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaApiDemo {

  public static void main(String[] args) throws IOException {
    //Get all of the posts via the API
    List<Post> posts = Post.getList();
    //List out all of the titles
   for(Post post : posts){
     System.out.println(post.getTitle());
   }
    //Get the longest title
    String longestTitle = posts.get(0).getTitle();
    for(Post post : posts){
      if(post.getTitle().length() > longestTitle.length()){
        longestTitle = post.getTitle();
      }
    }
    System.out.println(longestTitle);
    //Get the shortest body
    String shortestBody = posts.get(0).getBody();
    for (Post post : posts){
      if(post.getBody().length() < shortestBody.length()){
        shortestBody = post.getBody();
      }
    }
    System.out.println(shortestBody);
  }
}