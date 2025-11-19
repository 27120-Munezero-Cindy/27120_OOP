package q3;

public class Taxpayer extends Entity {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate,
                    String tin, String taxpayerName, String address) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if(!tin.matches("\\d{9}")) throw new TaxDataException("TIN must be 9 digits");
        if(taxpayerName.isEmpty() || address.isEmpty())
            throw new TaxDataException("Name and address cannot be empty");
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
    public String getAddress() { return address; }
}
