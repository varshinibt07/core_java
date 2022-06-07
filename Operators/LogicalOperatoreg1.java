class LogicalOperatoreg1
{
    public static void main(String args[])
    {
        int x=5,y;
        y= ++x + x++ + --x;
        System.out.println(x + "," + y); // y= 18,x=6
    }
}