package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ObjectPropertyRange")
public class ObjectPropertyRange {
    @XmlElement(name="ObjectProperty")
    public ObjectProperty objectProperty;
    @XmlElement(name="Class")
    public ClassXmlElement classXmlElement;
    @XmlElement(name="ObjectUnionOf")
    public ObjectUnionOf objectUnionOf;
}
