public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    private boolean bonus;

    /** Postcondition: All instance variables have been initialized. */
    public Game(Level l1, Level l2, Level l3, boolean b) {
        levelOne = l1;
        levelTwo = l2;
        levelThree = l3;
        bonus = b;
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        return bonus;
    }

    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
     *  game data
     */
    public void play(int sit) {
        boolean g1=false;int p1=0;boolean g2=false;int p2=0;boolean g3=false;int p3=0;
        if      (sit==1) {g1=true;p1=75;g2=false;p2=00;g3=false;p3=00;}
        else if (sit==2) {g1=true;p1=25;g2=true;p2=25;g3=false;p3=00;}
        else if (sit==3) {g1=true;p1=30;g2=true;p2=30;g3=true;p3=30;}
        else if (sit==4) {g1=true;p1=05;g2=true;p2=05;g3=true;p3=10;}
        levelOne.update(g1, p1);
        levelTwo.update(g2, p2);
        levelThree.update(g3, p3);
    }

    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore() {
        int score = 0;
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }
        if (bonus) score *= 3;
        return score;
    }

    /** Simulates the play of num games and returns the highest score earned, as
     *  described in part (b)
     *  Precondition: num > 0
     */
    public int playManyTimes(int num) {
        int[] scores = new int[num];
        for (int i=0;i<num;i++) {
            play(i);
            scores[i] = getScore();
        }
        int highest = scores[0];
        for (int j=1; j < scores.length; j++) {
            if (scores[j] > highest) highest = scores[j];
        }
        return highest;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}