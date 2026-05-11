import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
    Person[] personas = {
        new Person("Juan",85,new int[]{10,15,20}),
        new Person("John",19,new int[]{15,15,20}),
        new Person("Pedro",55,new int[]{20,20,20}),
        new Person("Luis",5,new int[]{10,15,10}),
        new Person("David",30,new int[]{10,10,20}),
        new Person("Juana",21,new int[]{7,7,7}),
    };

    PersonController controller = new PersonController();

    controller.sortPersonByNameValue(personas);

    for (Person person : personas){
        System.out.println(person);
    }
    

    }
}
