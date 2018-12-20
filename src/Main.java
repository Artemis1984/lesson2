

public class Main {

    public static void main(String[] args) {

        String [][] array = new String[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "" + j;

            }
        }

        checkOutSize(array);
        array[0][1] = "k";
        doIt(array);

    }


    public static void checkOutSize(String[][] array){
        boolean a = true;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                try {

                    if (array[i].length != 4 || array.length != 4) {
                        throw new MyArraySizeException();
                    }

                }catch (MyArraySizeException e) {
                    e.print(array[i].length , array.length);
                    a = false;
                    break;
                }
            }
            if (!a)break;
        }
        if (a) System.out.println("размер массива верный");
    }

    public static void doIt(String[][] array){

        int sum = 0;
        int[][]array1 = new int[5][4];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                try {

                array1[i][j] = Integer.parseInt(array[i][j]);

                }catch (NumberFormatException e){
                    MyArrayDataException.print(i,j);
                }

                finally {
                    sum += array1[i][j];

                }

            }

        }

        System.out.println("сумма всех эелементов массива: " + sum);
    }


}
