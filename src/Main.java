//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        Cilindro cilindro1 = new Cilindro();
        cilindro1.setRaio(3);
        cilindro1.setAltura(4);

        System.out.println("Volume: " + cilindro.calcularVolume());
        System.out.println("Área: " + cilindro.calcularArea());

        System.out.println("Volume: " + cilindro1.calcularVolume());
        System.out.println("Área: " + cilindro1.calcularArea());
    }
}