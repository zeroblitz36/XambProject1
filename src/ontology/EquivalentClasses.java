package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EquivalentClasses")
public class EquivalentClasses {
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name ="ObjectIntersectionOf")
    public ObjectIntersectionOf objectIntersectionOf;
}
