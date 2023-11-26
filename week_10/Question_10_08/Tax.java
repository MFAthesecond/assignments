package week_10.Question_10_08;

public class Tax {
    int fillingStatus;
    double taxableIncome = 0;
    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
    };

    public Tax() {
        fillingStatus = 0;
    }

    public Tax(int fillingStatus, double taxableIncome) {
        this.fillingStatus = fillingStatus;
        this.taxableIncome = taxableIncome;
         }

    public double getTax() {
        double tax = brackets[fillingStatus][0] * rates[0];
        for (int i = 1; i < 5; i++) {
            if (brackets[fillingStatus][i] > taxableIncome) {
                tax += (taxableIncome - brackets[fillingStatus][i - 1]) * rates[i];
                break;
            }
            tax += (brackets[fillingStatus][i] - brackets[fillingStatus][i - 1]) * rates[i];
        }
        return tax;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }
}
