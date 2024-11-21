public class Baseball extends SportsTeam {
    private int numHomeRuns;
    private int numRBIs;
    private int numErrors;

    public Baseball(String name) {
        super(name);
        numHomeRuns = 0;
        numRBIs = 0;
        numErrors = 0;
    }

    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e) {
        super(name, gamesPlayed, gamesWon, gamesLost);
        numHomeRuns = h;
        numRBIs = r;
        numErrors = e;
    }

    public double getHomeRunsPerGame() {
        return getGamesPlayed() == 0 ? 0 : (double) numHomeRuns / getGamesPlayed();
    }

    public double getRBIsPerGame() {
        return getGamesPlayed() == 0 ? 0 : (double) numRBIs / getGamesPlayed();
    }

    public double getErrorsPerGame() {
        return getGamesPlayed() == 0 ? 0 : (double) numErrors / getGamesPlayed();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Number of Homeruns      = " + numHomeRuns + "\n" +
               "Number of RBI's         = " + numRBIs + "\n" +
               "Number of Errors        = " + numErrors + "\n" +
               "Homeruns per Game       = " + getHomeRunsPerGame() + "\n" +
               "RBIs per Game           = " + getRBIsPerGame() + "\n" +
               "Errors per Game         = " + getErrorsPerGame();
    }
}
