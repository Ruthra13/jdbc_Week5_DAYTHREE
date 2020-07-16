package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO
{
	static List<Player> list = new ArrayList<Player>();
	 public List< Player > getAllPlayers() throws SQLException, Exception
	 {
		
		
		 
		 final String sql = "Select a.id,a.name,a.country,b.name as skill from player a INNER JOIN skill b on a.skill_id = b.id ";
		 
		 PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		 
		 ResultSet rs = st.executeQuery();
		 
		 while(rs.next())
		 {
			 Skill skill = new Skill();
			 Player play = new Player();
			 
			 long id = rs.getLong("id");
			 String name = rs.getString("name");
			 String country = rs.getString("country");
			 String skillname = rs.getString("skill");
			 skill.setSkillName(skillname);

			
			 
			 play.setPlayerId(id);
			 play.setName(name);      
			 play.setCountry(country);
			 play.setSkill(skill);
			 
			 list.add(play);
			 
			 
		 }
		 
		 return list;
		 
	 }
}
