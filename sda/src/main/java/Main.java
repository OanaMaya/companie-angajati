import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("SDA");

        Department departamentMarketing = new Marketing();
        Department departamentProduction = new Production();
        Department departamentHR = new Department("Hr", 5);

        List<Department> departmentList = new ArrayList<Department>();
        departmentList.add(departamentMarketing);
        departmentList.add(departamentProduction);
        departmentList.add(departamentHR);

        company.setCompanyDepartments(departmentList);
        List<Candidat> candidati = new ArrayList<Candidat>();

        Candidat candidat1 = new Candidat("Pop", "Ionut", 10, "Marketing");
        Candidat candidat2 = new Candidat("Dan", "Andreea", 7, "Productie");
        Candidat candidat3 = new Candidat("Pop", "Ana", 5, "Productie");
        Candidat candidat4 = new Candidat("Popescu", "Larisa", 10, "HR");

        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);

        company.setEmployes(candidati);

        try {
            company.recruteaza();

        } catch (IncapacitateEvaluare e) {

        }
       // writeCandidatesToTxtFile(candidati);
        writeCandidatesToTxtFile(company.getEmployes());

    }
      public static void writeCandidatesToTxtFile(List < Candidat > candidates) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter("candidati.txt"));
                writer.write(candidates.toString());
            } catch (IOException e) {

            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                }

            }
        }
    }



