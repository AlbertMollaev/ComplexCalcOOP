package Service;

public class Complex {
    protected float a;
    protected float b;
    protected float newA;
    protected float newB;
    Complex newComplex;

    public Complex(float _a, float _b) {
        a = _a;
        b = _b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public Complex add(Complex otherNumber){
		newA = a + otherNumber.getA();
		newB = b + otherNumber.getB();
		newComplex = new Complex(newA, newB);
		return newComplex;
	}

    public Complex subtract(Complex otherNumber){
		newA = a - otherNumber.getA();
		newB = b - otherNumber.getB();
		newComplex = new Complex(newA, newB);
		return newComplex;
	}

    public Complex multiply(Complex otherNumber){
		newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
		newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
		newComplex = new Complex(newA, newB);
		return newComplex;
	}

    public Complex divide(Complex otherNumber){
		newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		newComplex = new Complex(newA, newB);
		return newComplex;
	}

    public String toString() {
        return "(" + a + ") + (" + b + ")i";
    }
}
