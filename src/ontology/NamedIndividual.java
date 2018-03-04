package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NamedIndividual")
public class NamedIndividual {
    @XmlAttribute(name="IRI")
    public String IRI;
}
