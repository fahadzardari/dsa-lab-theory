

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private float pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, float pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public float getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}



class Demo2 {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("1", "Jack Hammer", 5, 100);
		System.out.println("Amount is "+ invoice.getInvoiceAmount());

	}

}