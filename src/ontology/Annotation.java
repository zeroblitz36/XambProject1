package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Annotation")
public class Annotation {
    @XmlElement(name="AnnotationProperty")
    public AnnotationProperty annotationProperty;
    @XmlElement(name="Literal")
    public Literal literal;
}
