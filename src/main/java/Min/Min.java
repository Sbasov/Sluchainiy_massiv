package Min;

import java.util.Random;

/**
 * Created by User on 20.08.2018.
 */
public class Min {
    public int i;
    public int c;
    public int m;
    public  int a;
    public int b;
    public  int h;
    public int k;

public void Minimalniy () {
    Random random = new Random();
//определяем кол-во элементов в массиве, диапазон от -10 до 10 и 0 включительно, итого 21 символ
    int Mas[] = new int[21];
//Заполняем массив случайных чисел и выводим на экран
    for ( i = 0; i < Mas.length; i++) {
        Mas[i] = random.nextInt(21) - 10;
        System.out.println(i + " элемент массива = " + Mas[i]);
    }

     a = 0;
     b = 0;
//Находим максимально отрицательный элемент массива, ноль не учитываем
    for (int j = 0; j < Mas.length; j++) {
        if (Mas[j] < a && Mas[j] < b) {
            b = Mas[j];
        }
    }
    System.out.println("Максимально отрицательный элемент массива = " + b);
    //Находим минимальный положительный элемент массива, ноль не учитываем
    int c = 0;
    int m = 16;
    for (int h = 0; h < Mas.length; h++) {
        if (Mas[h] > c && Mas[h] < m) {
            m = Mas[h];
        }
    }
    System.out.println("Минимальный положительный элемент массива = " + m);
//Меняем местами найденные нами элементы массива и выводим полученный массив

    for ( k=0; k<Mas.length; k++)
    {
        if (Mas[k]==b)
        {
            Mas[k]=m;
        }
        else if(Mas[k]==m)
        {
            Mas[k]=b;
        }
        System.out.println(k+" элемент массива теперь равен = "+Mas[k]);
    }


}

}
