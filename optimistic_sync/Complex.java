package optimistic_sync;

/**
 * Created by anirudh on 27/9/16.
 */
public class Complex {
    final double real;
    final double imag;
    /* values of fields set when object created.
    Never changed afterwards */
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    double getReal(){
        return real;
    }
    double getImag(){
        return imag;
    }
}
