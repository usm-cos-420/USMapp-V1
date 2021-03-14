package App;

import java.util.ArrayList;

import controller.PostController;
import domain.Post;
import domain.PostList;
import domain.User;

public class USMapp {

	public static void main(String[] args) 
	{
         User u = new User("Alice");
         Post p = new Post("Let's meet",u);
         PostController pc = new PostController();
         pc.addPost(p);
         
         ArrayList<Post> pl = PostList.getPostList();
         
         for (int i = 0; i < pl.size(); i++)  
             System.out.println(pl.get(i) + " ");         
         
	}

}
