// 3. Define a class CARRENTAL with the following details:
//  Class Members are: CarId of int type, CarType of string type and Rent of
// float type.
//  Define GetCar() method which accepts CarId and CarType.
//  GetRent() method which return rent of the car on the basis of car type, i.e.
// Small Car = 1000, Van = 800, SUV = 2500
//  ShowCar() method which allow user to view the contents of cars i.e. id, type
// and rent.

class CarRental {
    int carId;
    String carType;
    float rent;

    void GetCar(int id, String type) {
        carId = id;
        carType = type;
    }

    float GetRent() {
        if(carType.equals("Small"))
            rent = 1000;
        else if(carType.equals("Van"))
            rent = 800;
        else if(carType.equals("SUV"))
            rent = 2500;
        return rent;
    }

    void ShowCar() {
        System.out.println("Car Id:" + carId + "\nCarType:" + carType + "\nRent:" + rent);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.GetCar(101, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}