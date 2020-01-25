package pl.sdacademy.intermediate.complex.complex1;

class IntRange {

    private int min;
    private int max;

    public IntRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    boolean contains(int num) {
        boolean b = false;
        if (num >= min && num <= max) {
            return true;
        }
        return b;
    }
}

