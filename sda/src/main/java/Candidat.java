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

    @Override
    public String toString() {
        return "Candidat{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", skilsLevel=" + skilsLevel +
                ", departamentName='" + departamentName + '\'' +
                ", statusCandidat=" + statusCandidat +
                '}';
    }
}



