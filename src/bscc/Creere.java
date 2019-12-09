//package bscc;
//
//import org.w3c.dom.Comment;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//
//public class Creere {
//
//    public static void main(String[] args) {
//        Y y = Y.newY(1, "a",2);
//        Y y2 = Y.newYPtFISC(3);
//
//
//    }
//
//}
//
//
//class Y {
//    private final int a;
//    private final String s;
//    private Integer b;
//
////    public Y(int a, String s) {
////        this(a, s, null);
////    }
////    public Y(int a) {
////        this(a, "FISC", null);
////    }
//
//    private Y(int a, String s, Integer b) {
//        this.a=a;
//        this.s=s;
//        this.b=b;
//    }
//
//    // static factory method as named constructors.
//    public static Y newYPtFISC(int a) {
//       return new Y(a, "FISC", null);
//    }
//    public static Y newY(int a, String s, Integer b) {
//       return new Y(a, s, b);
//    }
//}
//
//class CodClient {
//    public static void main(String[] args) throws ParserConfigurationException {
////        new MarDeVoinesti();
//        IMar mar = new LivadaDeVoinesti().createMar();
//
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        // static factory method ca sa ascunda ce tip concret de factory iti intoarce.
//
//        DocumentBuilder db = dbf.newDocumentBuilder(); // instance factory method
//
//        Document doc = db.newDocument(); // Abstract Factory pt ca
//        // elementele produse de acest document sa fie compatibvile
//
//
//
//        Comment barfa = doc.createComment("barfa");
//
//        Element element = doc.getDocumentElement();
//        element.appendChild(barfa); // asta merge. Idiferent ce provider de XML folosesti
//
//    }
//
//    public void makeSuc(ILivada livada) {
////        ILivada livada = new LivadaDeVoinesti();
//
//        IMar mar = livada.createMar();
//        IPruna pruna = livada.createPruna();
//    }
//}
//
//interface IMar {
//}
//interface IPruna {
//}
//class MarDeVoinesti implements IMar {
//}
//class PrunaDeVoinesti implements IPruna {
//}
//
//// Abstract Factory
//interface  ILivada {
//    IMar createMar();
//    IPruna createPruna();
//}
//
//class LivadaDeVrancea implements ILivada {
//    @Override
//    public IMar createMar() {
//        return null; // a-la Vrancea
//    }
//    @Override
//    public IPruna createPruna() {
//        return null;
//    }
//}
//class LivadaDeVoinesti implements ILivada {
//    // instance factory method
//    @Override
//    public IMar createMar() {
//        return new Stropit(new MarDeVoinesti());
//    }
//    @Override
//    public IPruna createPruna() {
//        return new Stropit(new PrunaDeVoinesti());
//    }
//}
//class Stropit implements IMar {
//    private final IMar necopt;
//
//    Stropit(IMar necopt) {
//        this.necopt = necopt;
//    }
//}