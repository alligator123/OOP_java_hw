package java13;

class RadiusTooLarge extends Exception  // 定義自己的例外類別
{
}
class RadiusIsNegative extends Exception  // 定義自己的例外類別
{
}
class CCircle        // 定義類別CCircle
{
   private double radius;
   public void setRadius(double r) throws RadiusTooLarge,RadiusIsNegative
   {
      if(r<0)
      {
         throw new RadiusTooLarge();       // 拋出例外
      }
      else if(r>100) {
          throw new RadiusIsNegative();       // 拋出例外
       }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}

public class hw13_10
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      try
      {
         cir.setRadius(-2.0);
      }
      catch(RadiusTooLarge e)    // 捕捉由setRadius()拋出的例外
      {
         System.out.println(e+" throwed");
      }
      cir.show();
   }
}
