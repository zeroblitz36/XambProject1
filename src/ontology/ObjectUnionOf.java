package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="ObjectUnionOf")
public class ObjectUnionOf {
    @XmlElement(name="Class")
    public ArrayList<ClassXmlElement> classXmlElementArrayList;
}
