package de.othr.AJP.Langton;

/**
 * Hello world!
 *
 */
public class App 
{

    int[][] grid = new int[400][400];
    public static void main( String[] args )
    {

    }

    public static void move(Ant ant)
    {
        int x = ant.getX();
        int y = ant.getY();
        switch(ant.getDir())
        {
            case 0:
                y++;
                ant.setY(y);
                break;
            case 1:
                x++;
                ant.setX(x);
                break;
            case 2:
                y--;
                ant.setY(y);
                break;
            case 3:
                x--;
                ant.setX(x);
        }
    }

    public static void turnRight(Ant ant)
    {
        int direction = ant.getDir();
        if (direction != 3)
        {
            direction++;
            ant.setDir(direction);
        } else {
            ant.setDir(0);
        }
    }

    public static void turnLeft(Ant ant)
    {
        int direction = ant.getDir();
        if (direction != 0)
        {
            direction--;
            ant.setDir(direction);
        } else {
            ant.setDir(3);
        }
    }


}
