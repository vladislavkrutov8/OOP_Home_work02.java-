public class Tiger extends WildAnimal {
    protected Tiger(int height, int weight, String colorEye, String habitat, String date){
        super(height, weight, colorEye, habitat, date);
    }

    @Override
    public void animalSay() {
        System.out.println("Тигр произносит - Ррравр");
        
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
       }
}
