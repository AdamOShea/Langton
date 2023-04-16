package de.othr.AJP.Langton;

public class Ant
{
    private int x, y, dir;

    public Ant(int x, int y, int dir)
    {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getDir()
    {
        return dir;
    }

    public void setDir(int dir)
    {
        this.dir = dir;
    }
}
