package q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, String createdDate, String updatedDate,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) throws TaxDataException {
        super(id, createdDate, updatedDate, tin, taxpayerName, address);
        if(!employerTIN.matches("\\d{9}")) throw new TaxDataException("Employer TIN must be 9 digits");
        if(contact.length() != 10) throw new TaxDataException("Contact must be 10 digits");
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTIN() { return employerTIN; }
    public String getContact() { return contact; }
}
