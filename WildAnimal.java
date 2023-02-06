public abstract class WildAnimal extends Animal{
    private String habitat;
    private String date;



    protected  WildAnimal(int height, int weight, String colorEye, String habitat, String date) {
        super(height, weight, colorEye);
        this.habitat = habitat;
        this.date = date;

    }

    @Override
    public abstract void animalSay();

    @Override
    public String toString(){
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s", 
        this.habitat, this.date, super.toString());
}

}
