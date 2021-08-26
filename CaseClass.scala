object CaseClass {

  case class Point(x:Int,y:Int)
  {


//Addition of two points
    def +(that:Point)=Point(this.x+that.x,that.y+this.y)

    //moving pointers
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

    //distance between two points
    def distance(a:Point)=Point(this.x-a.x,this.y-a.y)

    //inverse of point
    def invert()=Point(this.y,this.x)
  }



def main(args: Array[String]): Unit = {
  val p1=new Point(2,3)
  val p2=new Point(3,2)
  val p3=new Point(6,9)
  println("Point P1="+p1);
  println("Point P2="+p2);
  println("Point P3="+p3);

  // Question 1 addition of two points 
  val x=p1+p2
  println( "Adding of point p1 and p2 ="+ x)

// Quesyion 2 move x and y coordinates of P1 with 1
  println("after move x coordinate by 1 and y coordinate by 1 in P1 = "+ p1.move(1,1))

  // Question 3 distance of two points

println("Distance of P3 and P2="+ p3.distance(p2))

// Question 4 after switching the  x and y coordinates
  println("After switching x and y coordinates of P1" + p1.invert())
}




}
