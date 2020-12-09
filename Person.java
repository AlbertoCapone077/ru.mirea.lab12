import java.lang.*;


public class Person {
    private String firstName, secondName,middleName;

        Person(String secondName ){
            this.secondName = secondName;
        }
        Person(String surname, String name, String middleName ){
            this.firstName = name;
            this.secondName = surname;
            this.middleName = middleName;
        }

        public String toString(){
            if(firstName == null || middleName == null){
                return(secondName);
            }
            else{
                return (secondName + " " + ((firstName.toUpperCase()).toCharArray())[0] + ". " + ((middleName.toUpperCase()).toCharArray())[0] + ".");
            }
        }
        public static void main(String[] args){
        Person people = new Person("Апресян","Альберто","Анатолиевич");
        System.out.println(people.toString());
        Person people_1 = new Person("Апресян");
        System.out.println(people_1.toString());
        }
}
