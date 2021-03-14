package domain;

import java.util.ArrayList;

public class PostList {

	private static ArrayList<Post> postList;
	
	private PostList() {}
	
	public static ArrayList<Post> getPostList()
	{
		if (postList == null)
			postList = new ArrayList<Post>();
		return postList;
	}
}
