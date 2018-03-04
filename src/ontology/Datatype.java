package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Datatype")
public class Datatype {
    @XmlAttribute(name="IRI")
    public String IRI;
    @XmlAttribute
    public String abbreviatedIRI;
}
