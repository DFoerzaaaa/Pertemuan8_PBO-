public class Volunteer extends StaffMember
{
    // Sets up a volunteer using the specified infprmation //
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }

    // Return a zero pay value for this volunteer //
    public double pay()
    {
        return 0.0 ;
    }
}
