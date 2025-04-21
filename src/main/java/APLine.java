public class APLine
{
  private int a;
  private int b;
  private int c;
  public APLine(int na, int nb, int nc){
    a = na;
    b = nb;
    c = nc;
  }
  public double getSlope(){
    return (double)(a * -1) / (double)b;
  }
  public boolean isOnLine(int x, int y){
    if(((a * x) + (b * y) + c) == 0){
      return true;
    }
    return false;
  }
}
