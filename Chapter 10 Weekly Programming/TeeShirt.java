public class TeeShirt 
{
    public int orderNumber;
    public enum Size {S, M, L, XL, XXL, XXXL};
    public Size orderSize;
    public String color;
    public double price;

    public int getOrderNumber()
    {
        return orderNumber;
    }
    public String getSize()
    {
       return orderSize.toString();
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }

    public void setOrderNumber(int n)
    {
        orderNumber = n;
    }
    public void setSize(Size s)
    {
        orderSize = s;

        if (orderSize == Size.XXL || orderSize == Size.XXXL)
        {
            price = orderNumber * 22.99;
        }
        else
        {
            price = orderNumber * 19.99;
        }
    }
    public void setColor(String c)
    {
        color = c;
    }
}
