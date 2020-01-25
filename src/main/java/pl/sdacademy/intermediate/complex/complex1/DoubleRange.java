package pl.sdacademy.intermediate.complex.complex1;

class DoubleRange {

    private double min;
    private double max;

    public DoubleRange(double min, double max) {
        this.min = min;
        this.max = max;
    }

    boolean contains(double num) {
        boolean b = false;
        if (num >= min && num <= max) {
            return true;
        }
        return b;
    }

}
