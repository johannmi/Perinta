package people;
/*
* @author JM
* @since 5.4.2019
* @version 1.0
*/

public class Person {
    private String name;

    /*
    * Creates a person with a name
    * @param name person's whole name
    */

    public Person (String name) {
        this.name = name;
    }

    /*
    * All info of the person
    * @return whole name
     */

    public String getInfo () {
        return this.name;
    }
}
