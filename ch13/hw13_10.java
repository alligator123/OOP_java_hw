package java13;

class RadiusTooLarge extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class RadiusIsNegative extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class CCircle        // �w�q���OCCircle
{
   private double radius;
   public void setRadius(double r) throws RadiusTooLarge,RadiusIsNegative
   {
      if(r<0)
      {
         throw new RadiusTooLarge();       // �ߥX�ҥ~
      }
      else if(r>100) {
          throw new RadiusIsNegative();       // �ߥX�ҥ~
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
      catch(RadiusTooLarge e)    // ������setRadius()�ߥX���ҥ~
      {
         System.out.println(e+" throwed");
      }
      cir.show();
   }
}
