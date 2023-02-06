public  class Wolf extends WildAnimal{
    private final String leader;

    protected Wolf(int height, int weight, String colorEye, String habitat, String date, String leader) {
        super(height, weight, colorEye, habitat, date);
        this.leader = leader;
    }

    @Override
    public void animalSay() {
        System.out.println("Волк произносит - Уууу");        
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.leader);
       }
    
}
