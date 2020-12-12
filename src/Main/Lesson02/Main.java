package Main.Lesson02;

public class Main {
    public static void main(String[] args) {
        Object[][] arr;
        int sum = 0;
        try {
            arr = initArray(4,4);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("в ячейке [" + i + "][" + j + "] находится тип отличный от int.");
                }
            }
        System.out.println("Сумма массива = " + sum);
    }

    public static Object[][] initArray(int row, int col) throws MySizeArrayException {
        if (row != 4 || col != 4) {
            throw new MySizeArrayException("Массив 4х4");
        }
        return new Object[][]{{1,'2',4,3},{1,2,3,4}};
    }
}
