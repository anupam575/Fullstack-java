package oops1;

public class LearnConstructor {
    public static void main(String[] args) {
      //  Complex num1 = new Complex();//deafault constructor
      //  Complex num2 = new Complex();//deafault constructor
         //Complex num1 = new Complex(2,4);//parametrize constructor
       Complex num1 = new Complex(2);//parametrize constructor

        Complex num2 = new Complex(4, 7);//parametrize constructor
        num1.print();
        num2.print();
        System.out.println("adding two number");
        Complex result = num1.add(num2);// num2.add obj ref
        System.out.println(num1);//num1 object reference
        result.print();

    }


}
class Complex {
    int a, b;

    //public Complex() {//deafault constructor
     //  a = 5;//deafault constructor
      //  b = 9;//deafault constructor
      //  System.out.println("creating a new object");

   // }

     public Complex(int real) {//cosntructor overloading
       a = real; //cosntructor overloading
        b = 12;

    }
    public Complex(int a, int b) {
       this.a = a;
       this.b = b;
    }
//public Complex(int real, int imaginary) {//parametrize constructor
  //  a = real;//parametrize constructor
    //b = imaginary;//parametrize constructor
//}

void print() {
        System.out.println(a+" + "+b+"i");
    }
    Complex add(Complex num2) {
        System.out.println(this);// num1 object reference
        this.print();
        num2.print();
         return new Complex (a+num2.a, b+num2.b);
    }
}