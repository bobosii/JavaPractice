package Arrays;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        int num = 1;
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                matris[i][j] = num++;
            }
        }

        for (int k = 0; k < matris.length; k++){
            for (int z = 0; z < matris[k].length; z++){
                //System.out.print(matris[k][z] + " ");
            }
            //System.out.println();
        }
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            //System.out.print(score + "  ");
        }
        int[][] papa = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 390, 384, 620, 429},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        int[] list = {1,2,3,4};
        double[] list2 = {31,213,213412,213241,213,312,4123,241234};

        System.out.println(Arrays.toString(papa));







        /*int[][] matris = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 390, 384, 620, 429},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matris[5][4]);
        /*  for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

        //int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (i * 10) + 10;
            System.out.println(myArray[i]);
        }*/
    }

    static int[] reverseArray(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
