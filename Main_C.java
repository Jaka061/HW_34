package hw34;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_C {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Theory-34");
        fileWriter.write("1) Массив- это объект, хранящий в себе фиксированное количество значений одного типа." +
                "\nДругими словами, массив — это нумерованный набор переменных. " +
                "\nПеременная в массиве называется элементом массива, а ее позиция в массиве задается индексом.Индексы в массиве начинаются с 0" +
                "\nОдним словом массив это контейнер, в который мы можем положить сразу несколько значений коробочек ");

        fileWriter.write("\n2)ArrayList – это список, который очень похож на массив за исключением того, что он имеет произвольную длину и " +
                "\nцелый ряд методов, которые позволяют добавлять, удалять, заменять элементы списка в любое время и в любом месте.");

        fileWriter.write("\n3)Разница в том что в ArrayList можно менять размер , ArrayList не может работать с примитивными типами. " +
                "");

        fileWriter.write("\n4)В Java у каждого примитивного типа есть свой брат-близнец — класс-обертка (Wrapper)." +
                "\nОбертка — это специальный класс, который хранит внутри себя значение примитива." +
                "\nНазвания классов-оберток очень похожи на названия соответствующих примитивов, или полностью с ними совпадают." +
                "\nКлассы-обертки позволяют нивелировать недостатки, которые есть у примитивных типов." +
                "\nСамый очевидный из них — примитивы не имеют методов." +
                "\nНапример, у них нет метода toString(), поэтому ты не сможешь, например, преобразовать число int в строку." +
                "\nА вот с классом-оберткой Integer — запросто. double -> Double ; int -> Integer ; ...");
        fileWriter.write("\n5)Чтобы заменить элемент в массиве, нужно использовать метод set() с указанием индекса и новым значением." +
                "\nЧтобы создать объект и вставлять созданные объекты используем add()");

        fileWriter.close();

        FileReader fileReader = new FileReader("Theory-34");
        Scanner in = new Scanner(fileReader);
        while (in.hasNextLine()){
            System.out.println(in.nextLine());
        }
        fileWriter.close();
    }
}