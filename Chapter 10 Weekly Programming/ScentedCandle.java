public class ScentedCandle extends Candle
{
    private String scent;

    public String getScent()
    {
        return scent;
    }

    public void setScent(String s)
    {
        scent = s;
    }

    @Override
    public void setHeight(int h)
    {
        height = h;
        price = 3 * h;
    }
}
