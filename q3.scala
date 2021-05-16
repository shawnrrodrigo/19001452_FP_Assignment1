object q3 extends App{
  def copies(x:Double):Double = {
    var p :Double=0.0;
    if(x<=50){
      p = (24.95 - 24.95*0.4) + 3;
      return p;
    }
    else{
      p = (24.95 - 24.95*0.4) + 3 + (x-50)*0.75;
      return p;
    }

  }
  println("Cost for 60 copies is Rs." + copies(60));
}
