package people;

public class Patient extends Person {
    private String operation;
    private int alaPaine, ylaPaine;

    /**
     *
     * @param name whole name
     * @param operation treatment name
     * @param alaPaine yläpaine
     * @param ylaPaine alapaine
     */
    public Patient (String name, String operation, int alaPaine, int ylaPaine) {
        super(name);
        this.operation = operation;
        this.alaPaine = alaPaine;
        this.ylaPaine = ylaPaine;
    }

    @Override
    public String getInfo() {
        return  super.getInfo() + ", " + this.operation +
                ", (" + this.ylaPaine + ", " + this.alaPaine + ")";
    }
}
