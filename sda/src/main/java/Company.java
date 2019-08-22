import java.util.List;

public class Company {
    private String name;
    List<Candidat> employes;
    List<Department> companyDepartments;

    // gettere, settere, constructor

    // to be implented


    public Company(String name) {
        this.name = name;
        //  this.employes = employes;
        //  this.companyDepartments = companyDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Candidat> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Candidat> employes) {
        this.employes = employes;
    }

    public List<Department> getCompanyDepartments() {
        return companyDepartments;
    }

    public void setCompanyDepartments(List<Department> companyDepartments) {
        this.companyDepartments = companyDepartments;
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
