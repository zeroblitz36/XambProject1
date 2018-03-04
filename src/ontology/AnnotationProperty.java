package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AnnotationProperty")
public class AnnotationProperty {
    @XmlAttribute
    public String abbreviatedIRI;
}
