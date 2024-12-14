

/*
class Shape {
  public void area() {
    System.out.println("displays area");

  }
}

////single level inheritance

class Triangle extends Shape {
  public void area (int l, int h) {
    System.out.println(1/2*l*h);
  }
}


// multilevel inheritance

class EquilateralTriangle extends Triangle {
  public void area (int l, int h) {
    System.out.println(1/2*l*h);
  }
}




  





public class inheritance {
  public static void main(String[] args) {
    
  }
}
*/


class Shape {
  public void area() {
    System.out.println("displays area");

  }
}


class Triangle extends Shape {
  public void area (int l, int h) {
    System.out.println(1/2*l*h);
  }
}

// Hierarchial inheritance
class Circle extends Shape {
  public void area (int r) {
    System.out.println((3.14)*r*r);
  }
}
public class inheritance {
  public static void main(String[] args) {
    
  }
}