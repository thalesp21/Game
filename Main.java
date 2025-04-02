public class Main {
    public static void main(String args[]) {
        Level level1 = new Level(true, 200);
        Level level2 = new Level(true, 100);
        Level level3 = new Level(true, 500);
        Game game1 = new Game(level1, level2, level3, true);
        System.out.println(game1.getScore());
        
        Level level4 = new Level(true, 200);
        Level level5 = new Level(true, 100);
        Level level6 = new Level(false, 500);
        Game game2 = new Game(level4, level5, level6, false);
        System.out.println(game2.getScore());
        
        Level level7 = new Level(true, 200);
        Level level8 = new Level(false, 100);
        Level level9 = new Level(true, 500);
        Game game3 = new Game(level7, level8, level9, true);
        System.out.println(game3.getScore());
        
        Level level10 = new Level(false, 200);
        Level level11 = new Level(true, 100);
        Level level12 = new Level(true, 500);
        Game game4 = new Game(level10, level11, level12, false);
        System.out.println(game4.getScore());

        System.out.println(game4.playManyTimes(4));
    }
}