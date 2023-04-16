public class Truck extends Transport implements Engineable{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигательу грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
