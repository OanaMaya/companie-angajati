public class Department  {
   private String name;
   private int minSkilsLevel;

   // gettere, settere, constructor



    public Department() { //contructorul defaul cand avem parametri
    }

    public Department(String name, int minSkilsLevel) {
        this.name = name;
        this.minSkilsLevel = minSkilsLevel;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinSkilsLevel() {
        return minSkilsLevel;
    }

    public void setMinSkilsLevel(int minSkilsLevel) {
        this.minSkilsLevel = minSkilsLevel;
    }



}

