package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	Skill skill = new Skill();
	public Skill getSkillBylD(Long id) throws SQLException, Exception
	{
		final String sql = "Select name FROM skill where id = " + id ;
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			String name = rs.getString("name");
//			System.out.println(name);
			skill.setSkillName(name);
		}	
		return skill;
	}
}






