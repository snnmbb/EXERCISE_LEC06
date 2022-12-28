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
        return new BoundaryInterval(max(leftBoundary,r.getSmallestElem()) , min(rightBoundary,r.getLargestElem()));
    }

}
