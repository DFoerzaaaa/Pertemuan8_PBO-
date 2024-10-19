public class Hourly extends Employee
{
    private int hoursWorked;

    //Sets up this hourly employee using the specified information //
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double raate)
    {
        super(eName, eAddress, ePhone, socSecNumber, raate);
        hoursWorked = 0;
    }

    // Ads the specified number of hours this employee accumulated hours //
    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }

    //Computes and returns the pay for this hourly employee //
    public double pay ()
    {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    //Returns information about this hourly employee as a string //
    public String toString()
    {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
