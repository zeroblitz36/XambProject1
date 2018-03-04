package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="SubClassOf")
public class SubClassOf {
    @XmlElement(name="Class")
    public ArrayList<ClassXmlElement> classXmlElementArrayList;
}
