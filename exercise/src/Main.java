import entities.Contributor;
import entities.LegalPerson;
import entities.PhysicalPerson;
import entitiesEnum.TypePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List <Contributor> contributors = new ArrayList<>();

       System.out.print("Enter the number of the person: ");
       int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
           System.out.println("\nTax payer #" + (i + 1) + " data: ");
           System.out.print("Legal or Physical: ");
           String typePerson = sc.next().toUpperCase();
           if(typePerson.equals("LEGAL")) {
               System.out.print("Name: ");
               String name = sc.next();
               System.out.print("Anual Income: ");
               double anualIncome = sc.nextDouble();
               System.out.print("Number of employees: ");
               int numOfEmployees = sc.nextInt();
               Contributor contributor = new LegalPerson(name, anualIncome, numOfEmployees);
               contributors.add(contributor);
           }
           else {
               System.out.print("Name: ");
               String name = sc.next();
               System.out.print("Anual Income: ");
               double anualIncome = sc.nextDouble();
               System.out.print("Health expeditures: ");
               double health = sc.nextDouble();
               Contributor contributor = new PhysicalPerson(name, anualIncome, health);
               contributors.add(contributor);
           }
       }
       System.out.print("\nTAXES PAID:\n");
       for(Contributor contributor : contributors) {
           System.out.print(contributor);
       }

       sc.close();
    }
}