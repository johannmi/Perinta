package people;

/*
 * Models a doctor with a name and title
 */
public class Doctor extends Person {    // 1. PERINTÄ: kuka on super
    private String title;

    /*
     * Creates a doctor with a name and professional title
     * @param name whole name
     * @param title professional title
     */
    public Doctor (String name, String title) {
                                        // 2. PERINTÄ: kutsu superin muodostinta
        super(name);                    // PAKKO OLLA ENNEN MUITA LAUSEITA
        this.title = title;
    }

    /*
    * All known info
    * @return name and title of the doctor
    */

    @Override                           // 3. PERINTÄ: uudelleenmäärittele joitain perittyjä metodeja
    public String getInfo() {
        return  super.getInfo() + ", " + this.title;
    }
}
