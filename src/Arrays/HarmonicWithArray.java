package Arrays;

public class HarmonicWithArray {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += 1.0 / list[i];
        }
        double avg = list.length/sum;
        System.out.println(avg);
    }
}
