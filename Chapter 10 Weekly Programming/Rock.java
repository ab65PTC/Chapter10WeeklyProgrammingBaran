public class Rock 
{
    public int sampleNum;
    public String desc;
    public double weight;

    public Rock(int n, double w)
    {
        sampleNum = n;
        weight = w;
        desc = "Unclassified";
    }

    public int getSampleNum()
    {
        return sampleNum;
    }
    public String getDesc()
    {
        return desc;
    }
    public double getWeight()
    {
        return weight;
    }

}
