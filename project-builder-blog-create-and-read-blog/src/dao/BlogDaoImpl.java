package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDaoImpl
{
	List<Blog> list = new ArrayList<Blog>();
	
	public void insertBlog(Blog blog) throws SQLException, Exception
	{
		String sql = "insert into blog (blogId,blogTitle,blogDescription,postedOn) values (seq_blog.nextval,?,?,?)";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setString(1, blog.getBlogTitle());
		st.setString(2,blog.getBlogDescription());
		st.setDate(3, java.sql.Date.valueOf(blog.getPostedOn() ) );
		
		st.executeUpdate();
	}
	
	public List<Blog> selectAllBlogs() throws Exception
	{
		
		
		final String sql = "select *from blog";
		
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			Blog blog = new Blog();
			
			int blogId = rs.getInt("blogId");
			String blogTitle = rs.getString("blogTitle");
			String blogDescription = rs.getString("blogDescription");
			LocalDate postedOn = rs.getDate("postedOn").toLocalDate();
			
			blog.setBlogId(blogId);
			blog.setBlogTitle(blogTitle);
			blog.setBlogDescription(blogDescription);
			blog.setPostedOn(postedOn);
			
			list.add(blog);
			
			
		}
		
		
		
		return list;
		
		
	}
}