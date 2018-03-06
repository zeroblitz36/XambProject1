package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ObjectIntersectionOf")
public class ObjectIntersectionOf {
    @XmlElement(name="Class")
    ClassXmlElement classXmlElement;
    @XmlElement(name="ObjectSomeValuesFrom")
    ObjectSomeValuesFrom objectSomeValuesFrom;
    @XmlElement(name="ObjectUnionOf")
    public ObjectUnionOf objectUnionOf;
}
