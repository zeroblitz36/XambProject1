package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ObjectProperty")
public class ObjectProperty {
    @XmlAttribute(name="IRI")
    public String IRI;
}
