import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        long [] c = new long[] {
                23,21,19,17,15,13,11,9,7,5
        };

      /
        for (int i = 0; i < x.length; i++) {
            x[i] = (22.0 * (double)(random()) - 12.0);
        }
        double[][] array = new double[10][17];

        for (int i = 0; i < 10; i++) {
            for (int j=0; j < 17;j++) {
                if (c[i] == 6) {
                    array[i][j] = (float) (atan(
                            pow(
                                    (1 / exp(abs(x[j]))), 2
                            )
                    ));
                } else if (c[i] == 5 || c[i] == 7 || c[i] == 13 || c[i] == 21 || c[i] == 23) {
                    array[i][j] = (float) pow(
                            pow(
                            ((tan(x[j]) * (exp(x[j])+1))),
                            pow(2/x[j],3)
                    )+1,
                            sin(0.5-x[j]) 
                    );
                }else {
                    array[i][j] = (float) pow(
                            exp((1 / 3) / (0.25 - pow(
                                            tan(x[j]), ((x[j] / PI) + 2) / cos(x[j])))),
                   2);
                }

            }
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<17; j++){
                System.out.printf("%.3f", array[i][j]);
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
