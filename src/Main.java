import igrcalculator.IGRCalculator;
import igrcalculator.IGRClaculatorDZ;
import igrcalculator.IGRClaculatorMA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static HashMap<String, IGRCalculator> igrCalculators = new HashMap<>(
            Map.of("DZ", new IGRClaculatorDZ(), "MA", new IGRClaculatorMA())
    );

    private final static List<String> countries = List.of("DZ", "MA");

    public static void main(String[] args) {
        String countryCode;
        Scanner scanner = new Scanner(System.in);

        for (String country : countries) {
            System.out.println(country);
        }
        System.out.print("Select your country code: ");

        countryCode = scanner.nextLine();

        if (!igrCalculators.containsKey(countryCode)) {
            System.out.println("Invalid country code");
            return;
        }

        System.out.println("Provide employee's information: ");
        System.out.print("Enter CIN: ");
        String cin = scanner.next();
        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        IGRCalculator igrCalculator = igrCalculators.get(countryCode);
        Employe employe = new Employe(cin, salary, igrCalculator);

        System.out.println("Net Monthly Salary for the employee with CIN " + cin + " is: " + employe.getSalaireNetMensuel());
        System.out.println("---------------------------------");
        System.out.println("Thank you for using our service");

//        System.out.println("Algeria IGR Calculator");
//        IGRCalculator igrCalculator = new IGRClaculatorDZ();
//        Employe employe = new Employe("EE123456", 1000000, igrCalculator);
//        System.out.println("Salaire Net Mensuel: " + employe.getSalaireNetMensuel());
//        System.out.println("End of Algeria IGR Calculator");
//
//        System.out.println("Morocco IGR Calculator");
//        igrCalculator = new IGRClaculatorMA();
//        employe = new Employe("GK42341", 30000, igrCalculator);
//        System.out.println("Salaire Net Mensuel: " + employe.getSalaireNetMensuel());
//        System.out.println("End of Morocco IGR Calculator");

    }
}