package i2.logic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Venue1 v1 = new Venue1();
		Venue2 v2 = new Venue2();
		int flag;
		do {
			flag = 0;
			System.out.println();
			System.out.println("   ***************** Welcome to 'VACCINATION - VENTURE' Registration App ****************");
			System.out.println();
			System.out.println(
					"   The following vaccine slots have been scheduled this week within the time slot 10:00 am to 4:00 pm.....");
			System.out.println("  This Are The Vaccination Centre Near By You  According To Your Live Location...");

			System.out.println();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
			// table km typeOfVaccine
			System.out.println(" SRN.NO\t\t PLACE  \t\t  KM  \t\t  VACCINE NAME");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
			System.out.println("    1.\t\tKarve Nagar  \t\t  5  \t\t  covishield");
			System.out.println("    2.\t\tDGP Nagar  \t\t  20  \t\t  covaccine");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
			System.out.println("");
			System.out.print("   Enter Your Choice  :   ");
			int choice;
			Scanner input = new Scanner(System.in);
			if (input.hasNextInt()) {
				choice = input.nextInt();
				switch (choice) {
				case 1:
					v1.VaccinationAtVenue1();
					return;
				case 2:
					v2.VaccinationAtVenue1();
					return;

				default:
					System.out.println("  Invalid choice");

				}
			} else {
				System.out.println("  Please Enter Choice In Integer!!");
				flag = 1;
			}

		} while (flag == 0);

	}

}
