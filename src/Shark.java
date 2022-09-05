public final class Shark extends Megalodon{
    ColorEnum kind;

    public Shark(String name, int year, int teeth, Meat meat) {
        super(name, year, teeth, meat);
    }


    @Override
    public String getInfo() {
        return super.getInfo() + " Его зубы: " + getTeeth() + " Вид: " + kind;
    }
}
