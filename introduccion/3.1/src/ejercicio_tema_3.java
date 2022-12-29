public class ejercicio_tema_3 {
    public static void main(String[] args) {
        System.out.println(suma(10,20,30));

        Car car = new Car();
        car.increaseDoors();
        System.out.println(car.doors);
    }

    public static int suma(int n1,int n2, int n3){
        return n1 + n2 + n3;
    }

    static class Car {
        int doors = 0;

        public void increaseDoors(){
            doors++;
        }
    }
}
