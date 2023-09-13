package dz;

public class Program {
    public static void main(String[] args) throws MyArraySizeException {
        CreateMassiv.createMassiv(2);
        try {
            CreateMassiv.copyMassiv(CreateMassiv.getPrototip());
        } catch (MyArraySizeException ignored){System.out.println("Длинна массива не подходит для копирования");}
        CreateMassiv.printMassiv(CreateMassiv.getPrototip());
        System.out.println();
        CreateMassiv.printMassiv(CreateMassiv.getMassiv());
        /**
         * 1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
         * подаче массива другого размера необходимо бросить исключение MyArraySizeException.
         */
        /**
         * 2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
         * просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
         * ячейке лежит символ или текст вместо числа), должно быть брошено исключение
         * MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
         */
        CreateMassiv.createMassivString(4);
        CreateMassiv.printMassivString(CreateMassiv.getmassivString());
        CreateMassiv.copyStringVInt(CreateMassiv.getmassivString());
        System.out.println();
        CreateMassiv.printMassiv(CreateMassiv.getMassiv());
    }
}
