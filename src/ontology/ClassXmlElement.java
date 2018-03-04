package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Class")
public class ClassXmlElement {
    @XmlAttribute(name="IRI")
    String IRI;
}
