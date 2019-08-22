public class Candidat {
    private String name;
    private String surname;
    private int skilsLevel;
    private String departamentName;
    private StatusCandidat statusCandidat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSkilsLevel() {
        return skilsLevel;
    }

    public void setSkilsLevel(int skilsLevel) {
        this.skilsLevel = skilsLevel;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }

    public StatusCandidat getStatusCandidat() {
        return statusCandidat;
    }

    public void setStatusCandidat(StatusCandidat statusCandidat) {
        this.statusCandidat = statusCandidat;
    }

    public Candidat(String name, String surname, int skilsLevel, String departamentName) {
        this.name = name;
        this.surname = surname;
        this.skilsLevel = skilsLevel;
        this.departamentName = departamentName;
        this.statusCandidat = StatusCandidat.INASTEPTARE;

        // to be implemented
    }


    public void recruteaza(Candidat candidat) {

        if (candidat.getDepartamentName().equalsIgnoreCase("Marketing")) {
            Marketing m = new Marketing();
            StatusCandidat status = m.evalueaza(candidat);
            candidat.setStatusCandidat(status);
        } else if (candidat.getDepartamentName().equalsIgnoreCase("Production")) {
            Production p = new Production();
            StatusCandidat status = p.evalueaza(candidat);
            candidat.setStatusCandidat(status);
        } else {
            // aruncam exceptia, daca nu se incadreaza la nici unul.
            throw new IncapacitateEvaluare(" Candidatul nu poate fi evaluat");
        }
    }
}
