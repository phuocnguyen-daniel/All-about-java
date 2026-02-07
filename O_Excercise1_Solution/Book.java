package DADADAD;

import java.util.*;
import java.text.*;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter book id");
            setBookId(scanner.nextLine());
            System.out.println("Enter Publisher");
            setPublisher(scanner.nextLine());
            System.out.println("Enter UnitPrice");
            setUnitPrice(scanner.nextDouble());
            System.out.println("Enter quantity");
            setQuantity(scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter Entry Date");
            String entryDateString = scanner.nextLine();
            setEntryDate(sdf.parse(entryDateString));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateBook(String id) {
        if (this.bookId.equals(id)) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter book id");
                setBookId(scanner.nextLine());
                System.out.println("Enter Publisher");
                setPublisher(scanner.nextLine());
                System.out.println("Enter UnitPrice");
                setUnitPrice(scanner.nextDouble());
                System.out.println("Enter quantity");
                setQuantity(scanner.nextDouble());
                scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Enter Entry Date");
                String entryDateString = scanner.nextLine();
                setEntryDate(sdf.parse(entryDateString));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID:" + getBookId() + "Publisher" + getPublisher() + "EntryDate:" + sdf.format(entryDate) + ","
      
                + ",unitPrice" + getUnitPrice() + "quantity:" + getQuantity());
        
    }

    public Book() {

    }
}
