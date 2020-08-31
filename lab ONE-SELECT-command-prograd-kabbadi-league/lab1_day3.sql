1.SELECT  * FROM TEAM ORDER BY NAME;

2.SELECT * FROM PLAYER WHERE NAME LIKE 'S%' AND COUNTRY != 'SOUTH AFRICA' ORDER BY NAME DESC;

3.SELECT EVENT_NO,CLOCK_IN_SECONDS FROM EVENT ORDER BY ID;

4.SELECT EVENT_NO FROM EVENT WHERE RAID_POINTS + DEFENDING_POINTS >=3 ORDER BY ID;

5.SELECT NAME FROM PLAYER WHERE COUNTRY = 'INDIA' OR COUNTRY = 'IRAN' ORDER BY NAME;

6.SELECT NAME FROM PLAYER WHERE COUNTRY != 'INDIA' OR COUNTRY != 'IRAN' ORDER BY NAME;

7.SELECT NAME FROM SKILL WHERE NAME LIKE 'DEFEND%' ORDER BY NAME;

8.SELECT STADIUM_NAME FROM VENUE WHERE STADIUM_NAME LIKE '%COMPLEX' ORDER BY STADIUM_NAME;

9.SELECT WINNER_TEAM_ID,SCORE  FROM OUTCOME WHERE SCORE<35 ORDER BY ID DESC;

10.SELECT * FROM GAME WHERE GAME_DATE BETWEEN '01-01-2020' AND '31-03-2020' ORDER BY ID DESC;

11.SELECT NAME FROM PLAYER WHERE ID IN (SELECT ID FROM SKILL WHERE NAME = 'RAIDER') ORDER BY NAME;

12.SELECT EVENT_NO,RAID_POINTS,DEFENDING_POINTS FROM EVENT WHERE INNINGS_ID IN (SELECT ID FROM INNINGS WHERE ID IN(SELECT FIRST_INNINGS_ID FROM
GAME WHERE GAME_DATE = '26-01-2020')) ORDER BY EVENT_NO;

13.SELECT NAME FROM TEAM WHERE ID IN( SELECT WINNER_TEAM_ID FROM OUTCOME WHERE ID IN
(SELECT OUTCOME_ID FROM GAME WHERE GAME_DATE='2020-03-09')) ORDER BY NAME; 

14.SELECT NAME FROM PLAYER WHERE ID IN (SELECT PLAYER_OF_MATCH FROM OUTCOME WHERE ID IN (SELECT OUTCOME_ID FROM GAME WHERE 
GAME_DATE = '09-03-2020')) ORDER BY NAME;

15.SELECT NAME FROM PLAYER WHERE SKILL_ID IN (SELECT ID FROM SKILL WHERE NAME = 'ALL ROUNDERS') ORDER BY NAME;

16.SELECT STADIUM_NAME FROM VENUE WHERE ID IN (SELECT VENUE_ID FROM GAME WHERE GAME_DATE = '09-03-2020') ORDER BY STADIUM_NAME;

17.SELECT COACH FROM TEAM WHERE NAME = 'IRAN';

18. SELECT EVENT_NO,DEFENDING_POINTS FROM EVENT WHERE RAIDER_ID IN( SELECT ID FROM PLAYER WHERE NAME='Fazel Atrachali') ORDER BY EVENT_NO; 

19.SELECT NAME FROM TEAM WHERE ID IN (SELECT WINNER_TEAM_ID FROM OUTCOME WHERE ID IN
(SELECT OUTCOME_ID FROM GAME WHERE EXTRACT(MONTH FROM GAME_DATE) = '03')) ORDER BY NAME;

20.SELECT NAME FROM PLAYER WHERE ID IN(SELECT PLAYER_OF_MATCH FROM OUTCOME WHERE ID IN
(SELECT OUTCOME_ID FROM GAME WHERE EXTRACT(YEAR from game_date)='2020')) ORDER BY NAME;







