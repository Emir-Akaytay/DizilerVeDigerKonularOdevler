public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5};
        double sum = 0;
        for(double i : array) {
            sum += 1 / i;
        }
        double avarage = array.length / sum;
        System.out.println("Ortalama : "+ avarage);
    }
}


