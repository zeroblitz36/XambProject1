package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="InverseObjectProperties")
public class InverseObjectProperties {
    @XmlElement(name="ObjectProperty")
    public ArrayList<ObjectProperty> objectPropertyArrayList;
}
