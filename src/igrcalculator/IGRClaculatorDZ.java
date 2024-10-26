package igrcalculator;

public class IGRClaculatorDZ implements IGRCalculator {

    @Override
    public float calculateIGR(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        return salaireBrutAnuel * 0.35f;
    }
}
