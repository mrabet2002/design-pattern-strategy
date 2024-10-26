package igrcalculator;

public class IGRClaculatorMA implements IGRCalculator {

    @Override
    public float calculateIGR(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        return salaireBrutAnuel * getIGRRate(salaireBrutAnuel);
    }

    private float getIGRRate(float salaireBrutMensuel) {
        if (salaireBrutMensuel <= 40000) {
            return 0.05f;
        } else if (salaireBrutMensuel > 40000 && salaireBrutMensuel <= 120000) {
            return 0.2f;
        } else {
            return 0.35f;
        }
    }
}
