public class Car extends Transport implements Engineable{


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
            System.out.println("Меняем покрышку у машины");
        }
    @Override
    public void checkEngine() {
            System.out.println("Проверяем двигатель у машины");
        }
    }


