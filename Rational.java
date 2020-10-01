
// HW #27: Stop Being Irrational
// Due T 11/19/13, 8:00am, EST

// Create Java class Rational, which will be used to represent rational numbers. (Recall that a rational number is one that may be expressed as p/q, where p and q are both integers and q is not zero.)

public class Rational{
// Phase I:
// Instance variables 
    private int num;
    private int den;


    public Rational(){
	num=0;
	den=1;
    }


    public  Rational(int n, int d){
	num= n;
	den=d;
	if (d==0){ 
	    System.out.println( " Error: Invalid denominator; Number will be set to 0");
	    num= 0;
	    den= 1;
	}
    }

    public String toString(){
	return "" + num+"/"+den;
    }

	public double floatValue(){
	    return (double)num/den*1.0;}

	public void multiply(Rational r){
	    num=r.num* num;
	    den=r.den * den;
	}

	public void divide(Rational r){
	    num= r.den * num;
	    den= r.num * den;
	}

// Phase II:
	public void add( Rational r){
	    num= r.num* den + num * r.den;
	    den= r.den * den;
	}

	    public void subtract(Rational r){
		num= num*r.den-r.num*den; 
		den= r.den * den;
	    }

 public  int gcd(int a,int b){
	while ((a != 0) && (b != 0) && (a != b)){
	    if (a > b) {
		a = a - b;
	    }else{
		b = b - a;
	    }
	}
	if (b == 0){
	    return a;
	} else if (a == 0){
	    return b;
	}else{
	    return a;
	}
    }

 public void reduce(){
     int i=gcd(num, den);
     num= num/i;
     den= den/i;
 }


// Phase III:

    public static int gcdst(int a,int b){
	int i=1;
	int g=0;
	if (a == 0){
	    return b;
	}else if (b == 0){
	    return a;
	}

	while (i<=a && i<=b){
	    if (((a%i)==0) && ((b%i)==0)){
		g=i;
	    }
	    i+=1;}
	return g;
    }

	public int compareTo(Rational r){
	    if ((double)r.num/r.den==(double) num/den){
		return 0;}
	    else if ((double)r.num/r.den > (double)num/den){
		return -1;}
	    else{
		return 1;}}
 public static void main ( String[] args ) {

   
        Rational a = new Rational();
        System.out.println(a);
        Rational b = new Rational(2, 3);
        System.out.println(b);
        Rational c = new Rational(3, 0);
        System.out.println(c);
	Rational d = new Rational(5, 6);
        System.out.println(d);
        System.out.println(d.floatValue());
        d.multiply(b);
        System.out.println(d);
        System.out.println(b); 
        d.divide(b);
        System.out.println(d);
        System.out.println(b);
        b.add(d);
        System.out.println(b);
        System.out.println(d);
        b.subtract(d);
        System.out.println(b);
        System.out.println(d);
        d.reduce(); 
        System.out.println(d);
 
        Rational x = new Rational(5, 13);
        Rational w = new Rational(3, 2);
	Rational y = new Rational(1, 2);
        Rational z = new Rational(4, 8);
        System.out.println(x.compareTo(y));
        System.out.println(w.compareTo(z));
        System.out.println(y.compareTo(w));
	System.out.println(z.compareTo(x));
	System.out.println(y.compareTo(z));
    


    }

// Submission: Create a new GitHub repo under your username, called hw. Post your Rational.java file to this repo by the deadline.
}
