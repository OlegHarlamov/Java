package provider;
import entity.Person;
import java.util.Scanner;
public class ProviderPerson {
    public Person createPerson() {
        Person person = new Person();
        Scanner scanner = new Scanner (System.in);
                    System.out.println("Имя читателя:");
                    String firstname = scanner.nextLine();
                    person.setFName(firstname);                   
                    
                    System.out.println("Фамилия читателя:");
                    String secondname = scanner.nextLine();
                    person.setSName(secondname);    
                    
                    System.out.println("Статус:");
                    String status = scanner.nextLine();
                    person.setStatus(status);                                    
        return person;
    }
}
