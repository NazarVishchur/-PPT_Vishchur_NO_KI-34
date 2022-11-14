package KI34.Vishchur.lab7;

public class App {
    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception
    {
        // Ініціалізація масиву
        Array<? super Shape> mall = new Array();
        // Додаємо фігури
        mall.add(new Sphere(1000, 100,100, "Sphere1"));
        mall.add(new Sphere(4000, 200,200, "Sphere2"));
        mall.add(new Sphere(10000, 100,100, "Sphere3"));
        mall.add(new Cube(17000, 30,30, "Cube1" ));
        mall.add(new Cube(16000, 40,40, "Cube2" ));
        // Виводимо
        mall.showAll();
        // Виводимо першу
        System.out.println(mall.get(0).getName());
        // Сукупний об'єм
        System.out.println(mall.getTotalVolume());
        // Найбільша фігура
        System.out.println(mall.getLargestFigure().getName());
        mall.getthelargestspherevolume();
    }
}


