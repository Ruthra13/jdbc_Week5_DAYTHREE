package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String[] args) throws SQLException, Exception
	{
		Skill skill = new Skill();
		SkillDAO skilldao = new SkillDAO();
		List<Skill> list = new ArrayList<Skill>();
		list = skilldao.listAllSkills();
		
		System.out.println("List of all skills");
		int i=1;
		
		if(list!=null)
		{
		for(Skill skills : list)
		{
			System.out.println(i+". "+ skills.getSkillName());
			i++;
		}
		}
		else
			System.out.println(list);
		
	}
}
