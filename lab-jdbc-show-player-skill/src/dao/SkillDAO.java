package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	List<Skill> list = new ArrayList<Skill>();
	
	
	
	public List<Skill> listAllSkills() throws SQLException, Exception
	{
		
		
		final String sql = "Select name from Skill ORDER BY name";
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			Skill skill = new Skill();
			String name = rs.getString("name");
			skill.setSkillName(name);
			
			list.add(skill);
			
		}
		
		
		return list;
		
	}
	
	
	
}
