package controller;

import java.util.ArrayList;

import domain.Post;
import domain.PostList;
import domain.User;

public class PostController 
{
      ArrayList<Post> postList;
      
      public PostController() 
      {
    	  postList = PostList.getPostList();
      }
      
	  public void addPost(Post p)
	  {
          postList.add(p);		  
	  }
}
