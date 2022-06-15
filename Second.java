class First{
  static int fortyTwo(){
    return 42;
  }
  static boolean isFortyTwo(int i){
    return i==42;
  }
  static int twice(int i){
    return i+i;
  }
  static boolean isOdd(int i){
    return i % 2 != 0; //i%2==1 || i%2==-1;
  }
  static int century(int i){
    return i/100;
  }
  static int lastTwoDigits(int i){
    return i%100;
  }
  static double arithmeticMean(int x, int y){
    return (x+y)/2.0;
  }
  static double monom(double a, double x, int e){
    return a*Math.pow(x,e);
  }

  static int signum(long x){
    return x<0? -1 : (x>0 ? 1 : 0);
  }

  static double flaeche(double r){
    return Math.PI*r*r;
  }

  static double umfang(double r){
    return Math.PI*2*r;
  }

  static double hoeheGleichschenklig(double a, double c){
    return Math.sqrt(a*a-c*c/4);
  }

  static double hypothenuse(double a, double b){
    return Math.sqrt(a*a+b*b);
  }

  static double hoeheRechtwinklig(double a, double b){
    return a*b/hypothenuse(a,b);
  }

}