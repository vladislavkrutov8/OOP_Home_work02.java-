public abstract class HomeAnimal extends Animal implements Home{
    private String nickname;
    private String breed;
    private String vaccinations;
    private String colorCoat;
    private String dateOfbirth;

    protected HomeAnimal(String nickname, String breed, String vaccinations, String colorCoat, String dateOfbirth, 
    int height, int weight, String colorEye){
        super(height, weight, colorEye);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.colorCoat = colorCoat;
        this.dateOfbirth = dateOfbirth;
    }

    @Override
    public String toString(){
        return String.format("Кличка: %s, Порода: %s, Наличие прививок: %s, Цвет шерсти: %s, Дата рождения: %s", this.nickname,
    this.breed, this.vaccinations, this.colorCoat, this.dateOfbirth, super.toString());
    }

    @Override
    public abstract void caressing();

    @Override
    public abstract void animalSay();

}



