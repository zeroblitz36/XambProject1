package ontology;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="SubDataPropertyOf")
public class SubDataPropertyOf {
    @XmlElement(name="DataProperty")
    public ArrayList<DataProperty> dataPropertyArrayList;
}
