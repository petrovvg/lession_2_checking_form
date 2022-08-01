public class Lada {
    double razgon; //секунды
    int weightCar; //килограммы
    String nameCar;
    String stickerGood = "На все бабки";
    String stickerBad = "Еще походит, но не долго";

    public Lada(double razgon, int weightCar, String nameCar) {
        this.razgon = razgon;
        this.weightCar = weightCar;
        this.nameCar = nameCar;
    }

    void sostoyanieKuzova() {
        if (razgon > 11.5 && weightCar >= 1185)         {
            System.out.println("Она не сгнила. Пока еще :)");
    } else {
            System.out.println("Она сгнила, ремонтируй кузов!");
    }
}
void nameOfCar(){
    System.out.println("Твоя приора называется " + nameCar);
}
void stickerOnWindow() {
        if (razgon >= 11.5 && weightCar >= 1185)         {
            System.out.println("На окне наклейка " + stickerGood);
    } else {
        System.out.println("На окне наклейка " + stickerBad);
    }
}
}
