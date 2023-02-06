public class Cat extends HomeAnimal {
    private final String wool;

    protected Cat(String nickname, String breed, String vaccinations, String colorCoat, String dateOfbirth, 
    int height, int weight, String colorEye, String wool) {
        super(nickname, breed, vaccinations, colorCoat, dateOfbirth, height, weight, colorEye);
        this.wool = wool;
    }

    @Override
    public void caressing() {
        System.out.println("Кошка хочет ласки!");  
    }

    @Override
    public void animalSay() {
        System.out.println("Кошка произносит - мяу");
        
    }
    @Override
    public String toString(){
        return String.format(
    "Кот: %s, Наличие шерсти: %s;", super.toString(), this.wool);
    }
}