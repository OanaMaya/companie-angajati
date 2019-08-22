public class Marketing extends Department implements Evaluator {

    // static final = constanta
    //  nume = 'Marketig"
    // nivelComp = 6

    public Marketing() {
        super("Marketing", 6);

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

