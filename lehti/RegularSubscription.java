import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class RegularSubscription extends Subscription {

	private int tilauksen_kesto;
	private int alennusprosentti;
	public RegularSubscription() {

	}

	public int getKesto() {
		return tilauksen_kesto;
	}
	public int getAlennus() {
		return alennusprosentti;
	}

	public String toString() {
		return "\nTilauksen kesto: " +
				getKesto() + " \nAlennusprosentti: " + getAlennus();
	}

	public void setKesto(int kesto) {
		this.tilauksen_kesto = kesto;
	}
	public void setAlennus(int alennus) {
		this.alennusprosentti = alennus;
	}

	public void printInvoice() {
		super.toString();
		this.toString();
	}
}