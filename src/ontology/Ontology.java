package ontology;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="Ontology")
public class Ontology {
    //@XmlAttribute(name="xmlns")
    //public String xmlns;
    //@XmlAttribute(name="xml:base")
    //public String xml_base;
    //@XmlAttribute(name="xmlns:xsd")
    //public String xmlns_xsd;
    //@XmlAttribute(name="xmlns:xml")
    //public String xmlns_xml;
    //@XmlAttribute(name="xmlns:rdfs")
    //public String xmlns_rdfs;
    //@XmlAttribute(name="xmlns:rdf")
    //public String xmlns_rdf;
    @XmlAttribute
    public String ontologyIRI;

    @XmlElement(name="Prefix")
    public ArrayList<Prefix> prefixArrayList;
    @XmlElement(name="Annotation")
    public ArrayList<Annotation> annotationArrayList;
    @XmlElement(name="Declaration")
    public ArrayList<Declaration> declarationArrayList;
    @XmlElement(name="EquivalentClasses")
    public ArrayList<EquivalentClasses> equivalentClassesArrayList;
    @XmlElement(name="SubClassOf")
    public ArrayList<SubClassOf> subClassOfArrayList;
    @XmlElement(name="DisjointClasses")
    public ArrayList<DisjointClasses> disjointClassesArrayList;
    @XmlElement(name="ClassAssertion")
    public ArrayList<ClassAssertion> classAssertionArrayList;
    @XmlElement(name="ObjectPropertyAssertion")
    public ArrayList<ObjectPropertyAssertion> objectPropertyAssertionArrayList;
    @XmlElement(name="DataPropertyAssertion")
    public ArrayList<DataPropertyAssertion> dataPropertyAssertionArrayList;
    @XmlElement(name="SubObjectPropertyOf")
    public ArrayList<SubObjectPropertyOf> subObjectPropertyOfArrayList;
    @XmlElement(name="InverseObjectProperties")
    public ArrayList<InverseObjectProperties> inverseObjectPropertiesArrayList;
    @XmlElement(name="SymmetricObjectProperty")
    public ArrayList<SymmetricObjectProperty> symmetricObjectPropertyArrayList;
    @XmlElement(name = "TransitiveObjectProperty")
    public ArrayList<TransitiveObjectProperty> transitiveObjectPropertyArrayList;
    @XmlElement(name="ObjectPropertyDomain")
    public ArrayList<ObjectPropertyDomain> objectPropertyDomainArrayList;
    @XmlElement(name="ObjectPropertyRange")
    public ArrayList<ObjectPropertyRange> objectPropertyRangeArrayList;
    @XmlElement(name="SubDataPropertyOf")
    public ArrayList<SubDataPropertyOf> subDataPropertyOfArrayList;
    @XmlElement(name="DataPropertyDomain")
    public ArrayList<DataPropertyDomain> dataPropertyDomainArrayList;
    @XmlElement(name="DataPropertyRange")
    public ArrayList<DataPropertyRange> dataPropertyRangeArrayList;
}
