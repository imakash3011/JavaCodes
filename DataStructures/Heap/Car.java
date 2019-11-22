package Program_14.Heap;

//here we have to use Comparable becz "arr[j] > arr[j+1]" will show error and will compare the address
//Comparable is an interface so we will have to give body to its function
public class Car implements Comparable<Car> {
    int speed;
    int price;
    String color;

    public Car (int speed,int price,String color){
        this.speed=speed;
        this.price=price;
        this.color=color;
    }

    //now we need to override the toString function of parent class
    //otherwise it show the default address value
    //but not the actual data

    @Override
    public String toString(){
        return "S:" +this.speed + "  P:" +this.price + "  C:"+ this.color;
    }

    @Override
    public int compareTo(Car other) {
        return this.speed-other.speed;
        //to get the positiv result

        //here we are sorting it on the basis of speed
//        return this.speed - other.speed;
        //   return other.price - this.price;
        //by default sorting in compareTo funtion is done lexiographyically
//        return this.color.compareTo(other.color);

    }
}
