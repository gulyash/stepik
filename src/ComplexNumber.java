public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int result = 1;
        long l = Double.doubleToLongBits(getRe());
        int i = (int) (l^(l>>>32));
        result = result*5 + i;
        l = Double.doubleToLongBits(getIm());
        i = (int) (l^(l>>>32));
        result = result*5 + i;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null) return false;
        if (getClass()!=o.getClass()) return false;
        ComplexNumber cn = (ComplexNumber) o;
        if (cn.getRe()!=getRe()) return false;
        if (cn.getIm()!=getIm()) return false;
        return true;
    }
}