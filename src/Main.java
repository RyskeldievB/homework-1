public class Main {
    public static void main(String[] args) {
        Meat meat=new Meat(333);
        Meat meat1=new Meat(1000);
        Shark shark =new Shark("Rex ",3,117,meat1);
        Megalodon megalodon = new Megalodon("Trump",4,4,meat);
        System.out.println(megalodon.getInfo());
        System.out.println(shark.getInfo());
    }
}