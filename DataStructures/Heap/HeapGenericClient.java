package Program_14.Heap;

public class HeapGenericClient {
    public static void main(String[] args) {
        Car[] cars=new Car[5];
        cars[0]=new Car(1000,400,"Red");
        cars[0]=new Car(1000,400,"Red");
        cars[0]=new Car(1000,400,"Red");
        cars[0]=new Car(1000,400,"Red");
        cars[0]=new Car(1000,400,"Red");


        HeapGeneric<Car> heapg=new HeapGeneric<>();
        heapg.add(cars[0]);
        heapg.add(cars[1]);
        heapg.add(cars[2]);
        heapg.add(cars[3]);
        heapg.add(cars[4]);


        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
//        System.out.println(heapg.remove());
//        System.out.println(heapg.remove());

    }
}
