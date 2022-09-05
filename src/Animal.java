public class Animal {
    private String name;
    private int year;
    private int teeth;
    private Meat meat;


    public Animal(String name, int year, int teeth, Meat meat) {
        this.name = name;
        this.year = year;
        this.teeth = teeth;
        this.meat = meat;
    }

    public int getTeeth() {
        return teeth;
    }

    public Meat getMeat() {
        return meat;
    }

    public String getInfo(){
        return "Имя: " + name + " " + "Год: "  + year + " tEETH " + teeth + " MEAT " + getMeat().getKillogram();
    }
}
