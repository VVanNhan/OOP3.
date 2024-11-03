public class MyComplex {
    private double real;
    private double imag;
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public MyComplex() {
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public String toString() {
        return real + " + " + imag + "i";
    }
    public boolean isReal() {
        return imag==0;
    }
    public boolean isImaginary() {
        return real==0;
    }
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }
    public boolean equals(MyComplex myComplex) {
        return this.real == myComplex.getReal() && this.imag == myComplex.getImag();
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public double argument() {
        return Math.sqrt(real * real + imag * imag);
    }
    public MyComplex add(MyComplex myComplex) {
        this.real = this.real + myComplex.getReal();
        this.imag = this.imag + myComplex.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public  MyComplex addInto(MyComplex myComplex) {
        this.real = this.real + myComplex.getReal();
        this.imag = this.imag + myComplex.getImag();
        return this;
    }
    public MyComplex subtract(MyComplex myComplex) {
        this.real = this.real - myComplex.getReal();
        this.imag = this.imag - myComplex.getImag();
        return this;
    }
    public  MyComplex subtractNew(MyComplex myComplex) {
        this.real = this.real - myComplex.getReal();
        this.imag = this.imag - myComplex.getImag();
        return this;
    }
    public MyComplex multiply(MyComplex myComplex) {
        this.real = this.real * myComplex.getReal();
        this.imag = this.imag * myComplex.getImag();
        return this;
    }
    public MyComplex divide(MyComplex myComplex) {
        this.real = this.real / myComplex.getReal();
        this.imag = this.imag / myComplex.getImag();
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
