package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="DisjointClasses")
public class DisjointClasses {
    @XmlElement(name="Class")
    public ArrayList<ClassXmlElement> classXmlElementArrayList;
}
