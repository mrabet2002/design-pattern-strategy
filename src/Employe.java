import igrcalculator.IGRCalculator;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private IGRCalculator igrCalculator;

    public Employe(String cin, float salaireBrutMensuel, IGRCalculator igrCalculator) {

        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.igrCalculator = igrCalculator;

    }

//    public float calculerIGR() {
//
//        float salaireBrutAnuel = salaireBrutMensuel * 12;
//        float taux = 42;
//        return salaireBrutAnuel * taux / 100;
//
//    }

    public float getSalaireNetMensuel() {
        float igr = this.igrCalculator.calculateIGR(salaireBrutMensuel);
        float salaireNetAnuel = salaireBrutMensuel * 12 - igr;
        return salaireNetAnuel / 12;
    }

// Getters et Setters
}