package i2.logic;

import java.text.SimpleDateFormat;

import i2.client.*;
import i2.client.NewLogicOfQueue.QueueHead;

import java.util.*;

public class Venue1 {

	public void VaccinationAtVenue1() {
		System.out.println();
		System.out.println(" * * * * * *   Welcome To Karve Nagar Venue Of Vaccination centre  * * * * * * * * *");
		System.out.println();
		System.out.println("                      Available   Vaccine   :  Covishield ");
		NewLogicOfQueue m = new NewLogicOfQueue();
		QueueHead Slot1 = new QueueHead();// 55+
		QueueHead Slot2 = new QueueHead();// 25+
		QueueHead Slot3 = new QueueHead();// 18+
		int tokenNum = 1;
		Scanner sc = new Scanner(System.in);

		int age;
		long adhar = 0;
		String s3;
		long rno = 22034501;
		// int ch = 0;
		int c1 = 1;
		int cc = 0;
		// int cnt = 0;
		int k = 1;

		int flag = 0;
		// int fl=1;
		do {
			while (flag == 0) {
				System.out.println("");
				System.out.println("************************************************************************");
				System.out.println("                                   MENU     ");
				System.out.println("************************************************************************");
				System.out.println("");
				System.out.println("                       VACCINATION MANAGEMENT SYSYEM     ");
				System.out.println("");
				System.out.println("***********************************************************************");
				System.out.println(
						"\n\t1 - Instructions Before Vaccination\n\t2 - View available vaccination Dates and Available dose "
								+ "\n\t3 - Accept Details for Vaccination\n\t4 - Display Alloted person for vaccination "
								+ "\n\t5 - Ready for the vaccination \n\t6 - exit");
				System.out.println("*************************************************************************");
				System.out.println("");
				System.out.print("  Enter your choice  :  ");
				cc = sc.nextInt();

				switch (cc) {
				case 1:

					System.out.println("  Read the following Instructions Carefully ! before you got vaccinated");
					System.out.println(
							"-----------------------------------------------------------------------------------------------");
					System.out.println(
							"\n\t According to a number of medical studies, COVID-19 vaccines have been proven to be effective "
									+ "\n\t at minimizing the risk of getting COVID-19 infections. Among different vaccine types, "
									+ "\n\t they do not only aim to reduce the chance of infection, but COVID-19 vaccines also help "
									+ "\n\t to mitigate disease severity in case a person becomes infected. Although vaccines appear"
									+ "\n\t to be acknowledged worldwide due to their efficacy, people who have been fully vaccinated"
									+ "\n\t against COVID-19 should abide by all precautions and preventive measures."
									+ "\n"
									+ "-------------------------------------------------------------------------------------------------"
									+ "\n"
									+ "\n To remain safe without panic or anxiety, it is essential to have a better understanding "
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n                                         Instructions Before Vaccination "
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n\t  1] On the vaccination day, if high fever is present, it is highly recommended to reschedule vaccine administration."
									+ "\n\t  2] In case of low-grade fever, vaccination can be considered as planned."
									+ "\n\t  3] Talk to your healthcare providers, if abnormal sign shows up before vaccination takes place."
									+ "\n\t  4] For patients with certain underlying diseases, e.g. respiratory diseases and immunocompromised conditions,"
									+ "\n\t     talk to your healthcare providers and seek special advices before vaccination."
									+ "\n"
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n                                         Possible Side Effects After Vaccination"
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n Side effects that develop after vaccine administration strongly indicate that our immune system is activated for"
									+ "\n building up the immunity against COVID-19. However, these undesired effects are usually mild and self-limiting."
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n\t  These include : "
									+ "\n--------------------------------------------------------------------------------------------------------------------\" "
									+ "\n\t1] Low-grade fever \n\t2] Headache \n\t3] body ache or muscle pain \n\t4] Fatigue "
									+ "\n\t5] Pain, redness or swelling at the injection site\n\t6] Allergic Reactions"
									+ "\n"
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n Vaccine allergy is induced by the immune system that overreacts to the administered vaccine. "
									+ "\n Vaccine allergic reactions that might develop within 30 minutes after vaccination are as follows:"
									+ "\n--------------------------------------------------------------------------------------------------------------------"
									+ "\n\t1] Skin rash\n\t2] Urticaria or hives\n\t3] Swelling or itching at the face, lip and neck\n\t4] Breathing difficulties"
									+ "\n\t5] Low blood pressure\n\t6] Nausea\n\t7] Abdominal pain ");
					System.out.println("");
					System.out.println(
							"__________________________________________________________________________________________________________________");
					System.out.println("                  THANK YOU SO MUCH FOR READING....!!!!!!");
					System.out.println(
							"__________________________________________________________________________________________________________________");
					System.out.println("");
					System.out
							.println("                             SO ARE YOU READY TO BOOK YOUR SLOT THIS WEEK ????");
					System.out.println("");
					System.out.println("  Enter (1)to Continue");
					System.out.println("  Enter (2)to Leave");
					int choice = sc.nextInt();
					if (choice == 2) {
						System.out.println("Thank-you...Please be responsible and take your vacination on time!!!");
						System.out.println(" Do check for slots availabily on next Sunday ");
						return;
					}
					break;

				case 2:
					Calendar cal = Calendar.getInstance();
					System.out.println("");
					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(
							"The following vaccine slots have been scheduled this week within the time slot 10:00 am to 4:00 pm.....");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(
							"\t   Date          \tDay                      \tAge Group                \t Available Number of Dose ");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------------------");

					int d1 = -1;
					for (int i = 0; i < 6; i++) {

						System.out.println("\t" + ((cal.get(Calendar.DATE)) + d1) + " /"
								+ ((cal.get(Calendar.MONTH)) + 1) + " /" + (cal.get(Calendar.YEAR)) + "           "
								+ (cal.get(Calendar.DAY_OF_WEEK) + d1 - 1) + "                             \t"
								+ m.GetAgeGroup((cal.get(Calendar.DAY_OF_WEEK) + d1 - 1))
								+ "                         \t6");
						d1++;
					}
					System.out.println("\t" + ((cal.get(Calendar.DATE)) + d1) + " /" + ((cal.get(Calendar.MONTH)) + 1)
							+ " /" + (cal.get(Calendar.YEAR)) + "           " + (cal.get(Calendar.DAY_OF_WEEK) + d1 - 1)
							+ "                             \t"
							+ m.GetAgeGroup((cal.get(Calendar.DAY_OF_WEEK) + d1 - 1)) + "        \t-");
					break;

				case 3:
					System.out.println();
					System.out.println("--------WELCOME---TO----VACCINATION---------");
					c1 = 1;
					while (c1 == 1) {
						for (int i = 1; i <= NewLogicOfQueue.Num_Dose; i++) {
							System.out.println();
							System.out.println("     TOKEN   NUMBER   :  " + tokenNum);
							System.out.println();
							tokenNum++;
							System.out.println("----------  * PLEASE ENTER ALL YOUR DETAILS CORRECTLY * -----------");
							System.out.println("");
							System.out.println(
									"  ***  Please Note that the Aadhar card number should have all 12 digits  ***");
							System.out.println("");
							System.out.print("  Enter your Last Name              :  ");
							String last = sc.next();

							System.out.print("  Enter your First Name             :  ");
							String first = sc.next();

							System.out.print("  Enter your Middle Name            :  ");
							String middle = sc.next();

							String s2 = last.concat(" " + first);
							s3 = s2.concat(" " + middle);
							System.out.print("  Enter your Aadhar Card Number     :  ");

							k = 1;
							while (k == 1) {
								adhar = sc.nextLong();
								long J = adhar;
								int count = 0;
								while (J != 0) {
									J = J / 10;
									count = count + 1;
								}
								if (count != 12) {
									System.out.println("Invalid Aadhar Card Number, please Enter it again.");
									k = 1;
								} else {
									k = 0;
								}
							}
							System.out.print("  Enter your Age                    : ");

							age = sc.nextInt();

							System.out.println();
							if (age >= 55) {
								if (Slot1.count <= 5) {
									NewLogicOfQueue.Enqueue(Slot1, age, adhar, s3, rno);
									rno++;
									Slot1.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 1 ....i.e on Monday");
									System.out.println();
								} 
								else if ((Slot1.count > 5) && (Slot1.count <= 10)) {
									NewLogicOfQueue.Enqueue(Slot1, age, adhar, s3, rno);
									rno++;
									Slot1.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 2 ....i.e on Tuesday");
									System.out.println();
								}
								else {
									System.out.println(" Sorry doses are over for this week Do check the avialabilty of the doses for the next week on upcomming sunday ");
									tokenNum--; 
								}
							}

							else if (age >= 25 && age < 55) {
								
								if (Slot2.count <= 5) {
									NewLogicOfQueue.Enqueue(Slot2, age, adhar, s3, rno);
									rno++;
									Slot2.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 3 ....i.e on Wednesday");
									System.out.println();
								} 
								else if ((Slot2.count > 5) && (Slot2.count <= 11)) {
									NewLogicOfQueue.Enqueue(Slot2, age, adhar, s3, rno);
									rno++;
									Slot2.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 4 ....i.e on Thursday");
									System.out.println();
								}
								else {
									System.out.println(" Sorry doses are over for this week Do check the avialabilty of the doses for the next week on upcomming sunday ");
									tokenNum--;
								}
							} 
							else if (age >= 18 && age < 25) 
							{
								if (Slot3.count <= 5) {
									NewLogicOfQueue.Enqueue(Slot3, age, adhar, s3, rno);
									rno++;
									Slot3.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 5 ....i.e on Friday");
									System.out.println();
								}
								else if ((Slot3.count > 5) && (Slot3.count <= 10)) {

									NewLogicOfQueue.Enqueue(Slot3, age, adhar, s3, rno);
									rno++;
									Slot3.count++;
									System.out.println();
									System.out.println(" You have been allocated a slot on day 6 ....i.e on Saturaday");
									System.out.println();
								}
								else {
									System.out.println(" Sorry doses are over for this week Do check the avialabilty of the doses for the next week on upcomming sunday ");
									tokenNum--;
								}
							}
							else {
								System.out.println();
								System.out.println(" Sorry, You are still not eligible for vacination");
								System.out.println();
								if (i == 1) {
									i = 0;
								} else {
									i--;
									tokenNum--;
								}
							}
							System.out.println();
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(" Press (1) If you want to register for another. ");
							System.out.println(" Press (0) If no more registrations. ");
							c1 = sc.nextInt();// 0
							if (c1 == 0) {
								System.out.println("      T H A N K    Y O U :)");
								break;
							}
						}
						if (c1 == 1) {
							System.out.println();
							System.out.println(" The doses are over for today, please try tommorrow.");
							c1 = 0;
						}
					}
					break;

				case 4:
					System.out.println();
					if (NewLogicOfQueue.IsQueueEmpty(Slot1) && NewLogicOfQueue.IsQueueEmpty(Slot2)
							&& NewLogicOfQueue.IsQueueEmpty(Slot3)) {
						System.out.println(" NO ONE IS ALLOCATED FOR THE VACCINATION ");
					} else {
						System.out.println("");
						System.out.println("         People who have been allocated slot on Day 1 & 2 are  ");
						NewLogicOfQueue.DisplayQueue(Slot1);
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("         People who have been allocated slot on Day 3 & 4 are  ");
						NewLogicOfQueue.DisplayQueue(Slot2);
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("         People who have been allocated slot on Day 5 & 6 are  ");
						NewLogicOfQueue.DisplayQueue(Slot3);
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println();
					}
					break;

				case 5:
					rno = 22034501;

					if (NewLogicOfQueue.IsQueueEmpty(Slot1) && NewLogicOfQueue.IsQueueEmpty(Slot2)
							&& NewLogicOfQueue.IsQueueEmpty(Slot3)) {
						System.out.println(" NO ONE IS ALLOCATED FOR THE VACCINATION");
					} else {
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("                               This is Day 1 & 2");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						if (NewLogicOfQueue.IsQueueEmpty(Slot1)) {
							System.out.println(" NO ONE IS THERE FOR VACCINATION ");
						} else {
							do {
								if ((Slot1.count >= 1)) {
									System.out.println("                Remaining people for the vaccinations are ");
									System.out.println("");
									NewLogicOfQueue.DisplayQueue(Slot1);
									System.out.println(" ");
									NewLogicOfQueue.Dequeue(Slot1);
									System.out.println(" ");
									System.out.println("  " + rno + " YOU HEAVE SUCCESSFULLY GOT VACCINATED  !!!!");
									System.out.println(
											"  Please download your certificate from site : www.cowin.com !!!!");
									System.out.println(" ");
									System.out.println(" ");
									System.out.println(" ");
								}
								Slot1.count--;
								rno++;
							} while (Slot1.count != 0);
						}
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("                               This is Day 3 & 4");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						if (NewLogicOfQueue.IsQueueEmpty(Slot2)) {
							System.out.println(" NO ONE IS THERE FOR VACCINATION ");
						} else {
							while (Slot2.count != 0) {

								if ((Slot2.count >= 1)) {
									
									System.out.println("    Remaining people for the vaccinations are ");

									NewLogicOfQueue.DisplayQueue(Slot2);
									System.out.println(" ");
									NewLogicOfQueue.Dequeue(Slot2);
									System.out.println(" ");
									System.out.println("  ' " + rno + " ' YOU GOT VACCINATED SUCCESFULLY !!!!");
									System.out.println(
											"  Please download your certificate from site : www.cowin.com !!!!");
									System.out.println(" ");
								}
								Slot2.count--;
								rno++;
							}
						}
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("                               This is Day 5 & 6");
						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------");
						if (NewLogicOfQueue.IsQueueEmpty(Slot3)) {
							System.out.println(" NO ONE IS THERE FOR VACCINATION ");
						} else {
							do {
								if ((Slot3.count >= 1)) {
									System.out.println(
											"----------------------------------------------------------------------------------------------------------------------------------");
									System.out.println("    Remaining people for the vaccinations are ");

									NewLogicOfQueue.DisplayQueue(Slot3);
									System.out.println(" ");
									NewLogicOfQueue.Dequeue(Slot3);
									System.out.println(" ");
									System.out.println("  " + rno + " YOU GOT VACCINATED SUCCESFULLY !!!!");
									System.out.println(
											"  Please download your certificate from site : www.cowin.com !!!!");
									System.out.println(" ");
								}
								Slot3.count--;
								rno++;
							} while (Slot3.count != 0);
							System.out.println("-------- Those who have registered for this week has got Vaccinated --------- ");
						}
					}
					System.out.println(" ");
					System.out.println(" ");
				
					break;
				case 6:// exit
					System.out.println("    T H A N K     Y O U :)   !!!!");
					flag = 1;
					break;
				default:
					System.out.println("Invalid option!!! ");
					break;
				}
			}
		} while (flag == 0);

	}

}
