@XmlSchema(
        namespace = "http://www.w3.org/2002/07/owl#",
        xmlns = {
                @XmlNs(prefix="",namespaceURI = "http://www.w3.org/2002/07/owl#"),
                @XmlNs(prefix="xsd",namespaceURI = "http://www.w3.org/2001/XMLSchema#"),
                @XmlNs(prefix="xml",namespaceURI = "http://www.w3.org/XML/1998/namespace"),
                @XmlNs(prefix="rdfs",namespaceURI = "http://www.w3.org/2000/01/rdf-schema#"),
                @XmlNs(prefix="rdf",namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"),
        },
        elementFormDefault = XmlNsForm.QUALIFIED
)

package ontology;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;