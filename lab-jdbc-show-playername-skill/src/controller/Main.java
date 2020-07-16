package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import model.Player;

public class Main
{
	static List<Player> list = new ArrayList<Player>();
	public static void main(String[] args) throws SQLException, Exception
	{
//		Skill skill = new Skill();
//		Player player = new Player();
//		SkillDAO skilldao = new SkillDAO();
		PlayerDAO playerdao = new PlayerDAO();
		
		System.out.println("List of all player and their skill");
		list = playerdao.getAllPlayers();
		
		for(Player play:list)
		{
			System.out.println(play.getPlayerId());
			System.out.println(play.getName());
			System.out.println(play.getCountry());
			System.out.println(play.getSkill().getSkillName());
		}
		
	}
}
