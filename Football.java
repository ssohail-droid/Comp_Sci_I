public class Football extends SportsTeam {
    private int numTouchDowns;
    private int numInterceptions;

    public Football(String name) {
        super(name);
        numTouchDowns = 0;
        numInterceptions = 0;
    }

    public Football(String name, int gamesPlayed, int gamesWon, int gamesLost, int t, int f) {
        super(name, gamesPlayed, gamesWon, gamesLost);
        numTouchDowns = t;
        numInterceptions = f;
    }

    public double getTouchDownsPerGame() {
        return getGamesPlayed() == 0 ? 0 : (double) numTouchDowns / getGamesPlayed();
    }

    public double getInterceptionsPerGame() {
        return getGamesPlayed() == 0 ? 0 : (double) numInterceptions / getGamesPlayed();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Number of Touchdowns    = " + numTouchDowns + "\n" +
               "Number of Interceptions = " + numInterceptions + "\n" +
               "Touchdowns per Game     = " + getTouchDownsPerGame() + "\n" +
               "Interceptions per Game  = " + getInterceptionsPerGame();
    }
}
