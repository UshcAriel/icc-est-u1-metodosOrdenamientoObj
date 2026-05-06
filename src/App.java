import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] personas = {
            new Person("Juan",85),
            new Person("John",19),
            new Person("Pedro",55),
            new Person("Luis",5),
            new Person("David",30),
            new Person("Juana",21
            ),

        };
        PersonController controller = new PersonController();
        controller.sortPersonByAge(personas);

        for (Person person : personas){
            System.out.println(person);
        }

   
    }
}
