package dz;

import java.util.Random;

public class CreateMassiv implements MainRandom {
    //region Поля
    private static int[][] massiv;
    private static int[][] prototip;
    private static String[][] massivString;
    /**
     * Поле для формирования массива строк
     */
    private static String[] arrayElements = {"1","12","23","3","53","2","8","84","354","21","ловушка","90","0","31",};
    //endregion
    //region геттеры
    public static int[][] getMassiv() {
        return massiv;
    }
    public static int[][] getPrototip() {
        return prototip;
    }
    public static String[][] getmassivString() {
        return massivString;
    }
    //endregion
    //region Черновик
    /**
     * Создаем тестовый двумерный массив чисел, в котором указываем количество элементов
     * @param size длинна массива
     */
    public static void createMassiv(int size){
        prototip = new int[size][size];
        for (int i1 = 0; i1 < size; i1++) {
            for (int i2 = 0; i2 < size; i2++) {
                prototip[i1][i2] = new Random().nextInt(1, 30);
            }
        }
    }
    /**
     * Метод в который подается двумерный массив, где выбрасывается исключение, в случае если он не соответствует условию ДЗ
     * @param primer Массив чисел на вход
     * @throws MyArraySizeException Исключение на длинну массива
     */
    public static void copyMassiv(int[][] primer)throws MyArraySizeException{
        if (primer[0].length == 4 && primer[1].length == 4) {
            massiv = new int[4][4];
            for (int i1 = 0; i1 < 4; i1++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    massiv[i1][i2] = primer[i1][i2];
                }
            }
        }
        else{
            throw new MyArraySizeException("Входящий массив имеет не верную длинну");
        }
    }
    //endregion
    //region 1/2 Задача
    /**
     * Создаем тестовый двумерный массив строк, в котором указываем количество элементов
     * @param size длинна массива
     */
    public static void createMassivString(int size){
        massivString = new String[size][size];
        for (int i1 = 0; i1 < size; i1++) {
            for (int i2 = 0; i2 < size; i2++) {
                massivString[i1][i2] = arrayElements[new Random().nextInt(0, arrayElements.length)];
            }
        }
    }
    /**
     * Метод преобразования строки в число
     */
    public static int parseMasiv(String primer, int index1, int index2) throws MyArrayDataException{
        try {
            return Integer.parseInt(primer);
        }catch (Exception e){
            throw new MyArrayDataException(String.format("Невозможно преобразовать %d : %d - элемент двумерного массива в число", index1, index2), index1);
        }
    }
    public static void copyStringVInt(String[][] primer)throws MyArraySizeException{
        if (primer[0].length == 4 && primer[1].length == 4) {
            massiv = new int[4][4];
            for (int i1 = 0; i1 < 4; i1++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    massiv[i1][i2] = parseMasiv(primer[i1][i2], i1, i2);
                }
            }
        }
        else{
            throw new MyArraySizeException("Входящий массив имеет не верную длинну");
        }
    }
    //endregion
    //region Методы для вывода массива на консоль
    /**
     * Вывод элементов массива на консоль
     * @param maimMassiv
     */
    public static void printMassiv(int[][] maimMassiv){
        try {
            for (int i1 = 0; i1 < maimMassiv[0].length; i1++){
                for (int i2 = 0; i2 < maimMassiv[1].length; i2++){
                    System.out.printf(" %d",maimMassiv[i1][i2]);
                }
            }
        }catch (NullPointerException ignored){}
    }
    public static void printMassivString(String[][] maimMassiv){
        try {
            for (int i1 = 0; i1 < maimMassiv[0].length; i1++){
                for (int i2 = 0; i2 < maimMassiv[1].length; i2++){
                    System.out.printf(" %s",maimMassiv[i1][i2]);
                }
            }
        }catch (NullPointerException ignored){}
    }
    //endregion
}
