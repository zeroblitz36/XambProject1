package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Prefix")
public class Prefix {
    @XmlAttribute
    public String name;
    @XmlAttribute(name="IRI")
    public String IRI;
}
