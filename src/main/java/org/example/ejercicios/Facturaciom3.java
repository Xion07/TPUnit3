package org.example.ejercicios;
import java.util.List;

public class Facturaciom3 {
	record Invoice(String customer, String invoiceDate, List<Double> productPrice) {
	}

	private static final double INITIAL_VALUE = 0;
	private static final String INVOICE_DATE_1 = "July 1, 1999";
	private static final String INVOICE_DATE_2 = "August 15, 2000";

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("Maria Sanabria", INVOICE_DATE_1, List.of(4500D, 5000D, 2500D));
		Invoice invoice2 = new Invoice("Juan Perez", INVOICE_DATE_2, List.of(3500.0, 6000D, 2800D));

		double totalInvoiceAmount1 = calculateTotalInvoiceAmount(invoice1);
		printInvoice(invoice1, totalInvoiceAmount1);

		double totalInvoiceAmount2 = calculateTotalInvoiceAmount(invoice2);
		printInvoice(invoice2, totalInvoiceAmount2);
	}

	private static double calculateTotalInvoiceAmount(Invoice invoice) {
		return invoice.productPrice.stream()
				.reduce(INITIAL_VALUE, Double::sum);
	}

	private static void printInvoice(Invoice invoice, double total) {
		System.out.println("Invoice");
		System.out.println("Customer: " + invoice.customer());
		System.out.println("Date: " + invoice.invoiceDate());
		System.out.println("Total: " + total);
		System.out.println();
	}
}
