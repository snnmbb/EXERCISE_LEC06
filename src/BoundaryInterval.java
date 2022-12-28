import static java.lang.Math.max;
import static java.lang.Math.min;
public class BoundaryInterval implements Interval{
    private int leftBoundary;
    private int rightBoundary;
    public BoundaryInterval(int lb,int rb){
        leftBoundary = lb;
        rightBoundary = rb;
    }
    public int getSmallestElem(){
        return leftBoundary;
    }
    public int getLargestElem(){
        return rightBoundary;
    }
    public Interval intersect(Interval r){
        if(leftBoundary < r.getSmallestElem() && rightBoundary < r.getLargestElem())
        {
            return new BoundaryInterval(max(leftBoundary,r.getSmallestElem()) , min(rightBoundary,r.getLargestElem()));
        }
        else
        {
            return new BoundaryInterval(0,0);
        }
    }
}
