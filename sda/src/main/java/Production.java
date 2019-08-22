public class Production extends Department implements Evaluator {
    // static final = constanta
    //  nume = 'Production"
    // nivelComp = 3

    public Production () {
        super("Production", 3);
    }


        public StatusCandidat evalueaza(Candidat candidat) {
  
    // to be implemented
            if (candidat.getSkilsLevel() > super.getMinSkilsLevel()) {
                return StatusCandidat.ACCEPTAT;
            } else if (candidat.getSkilsLevel() < super.getMinSkilsLevel()) {
                return StatusCandidat.RESPINS;
            } else {
                return StatusCandidat.INASTEPTARE;
            }
        }
}



