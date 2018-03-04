package com.company.zeroblitz;

import ontology.Annotation;
import ontology.AnnotationProperty;
import ontology.Literal;
import ontology.Ontology;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    private static void parseToScreen(Object o){
        try {
            File file = new File("test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            //jaxbMarshaller.marshal(l,file);
            jaxbMarshaller.marshal(o,System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.printf("Hello world!\n");

        Customer customer = new Customer();
        customer.name="Roscaneanu George";
        customer.id=123456;
        customer.age = 24;

        Literal l = new Literal();
        l.datatypeIRI = "&rdf;PlainLiteral";
        l.value = "Ontologie Pagini Web Semantice";

        Annotation a = new Annotation();
        a.annotationProperty = new AnnotationProperty();
        a.annotationProperty.abbreviatedIRI = "rdfs:comment";
        a.literal = l;

        //parseToScreen(a);
        //parseToScreen(l);
        //parseToScreen(customer);

        try {
            JAXBContext context = JAXBContext.newInstance(Ontology.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Ontology ontology = (Ontology) unmarshaller.unmarshal(new File("vedeteint5.owl"));
            parseToScreen(ontology);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
