package bscc.refactoringpatterns;

public class AdaptersToUnifyInterface {
    void asigura(Person p) {
//        if (p.getCnp() != null) {
//            audit("Asigur " +  p.getCnp());
//        } else {
//            audit("Asigur " +  p.getCertificatNastere());
//        }
        audit(new PersonAdapter(p));
    }
    void asigura(Vapor v) {
        audit(new VaporAdapter(v));
    }

    private void audit(Identificabil idf) {
        System.out.println("Asigur " + idf.getAuditId());
    }
}


interface Identificabil {
    String getAuditId();
}

class VaporAdapter implements Identificabil {
    private final Vapor vapor;

    VaporAdapter(Vapor vapor) {
        this.vapor = vapor;
    }

    @Override
    public String getAuditId() {
        return vapor.getImo().toUpperCase();
    }
}
// Adapter-ul il face pe om
class PersonAdapter implements Identificabil {
    private final Person person;

    PersonAdapter(Person person) {
        this.person = person;
    }
    @Override
    public String getAuditId() {
        if (person.getCnp() != null) {
            return person.getCnp().toString();
        } else {
            return person.getCertificatNastere();
        }
    }
}


class Person/* implements Identificabil*/{ // prima intentie: faci structurile de date sa te ajute: sa se supuna unei interfete unice, daca asta nu e prea heavy pentru ele.
    private Long cnp;
    private String certificatNastere;

    Person(Long cnp) {
        this.cnp = cnp;
    }

    Person(String certificatNastere) {
        this.certificatNastere = certificatNastere;
    }

    public String getCertificatNastere() {
        return certificatNastere;
    }

    public Long getCnp() {
        return cnp;
    }
}
class Vapor {
    private final String imo;

    Vapor(String imo) {
        this.imo = imo;
    }

    public String getImo() {
        return imo;
    }
}