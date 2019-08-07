package model;

public class Battle {
	private Player player1;
	private Player player2;
	private int gameMode;
	private int battleType;

	public Battle(int gameMode,int battleType, Player player1, Player player2)
	{
		this.gameMode = gameMode;
		this.player1 = player1;
		this.player2 = player2;
		this.battleType = battleType;
	}
	
	public int player1Play(Coordinates c) throws Exception
	{
		return player1.shoot(player2, c);
	}

	public int player2Play(Coordinates c) throws Exception
	{
		return player2.shoot(player1, c);
	}

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getGameMode() {
        return gameMode;
    }

    public int getBattleType() {
        return battleType;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public void setBattleType(int battleType) {
        this.battleType = battleType;
    }  
        
   



}
