
package com.rohit.webservice.salary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rohit.webservice.salary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SalaryResponse_QNAME = new QName("http://salary.webservice.rohit.com/", "salaryResponse");
    private final static QName _GetTotalSalaryResponse_QNAME = new QName("http://salary.webservice.rohit.com/", "getTotalSalaryResponse");
    private final static QName _Salary_QNAME = new QName("http://salary.webservice.rohit.com/", "salary");
    private final static QName _GetTotalSalary_QNAME = new QName("http://salary.webservice.rohit.com/", "getTotalSalary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rohit.webservice.salary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTotalSalaryResponse }
     * 
     */
    public GetTotalSalaryResponse createGetTotalSalaryResponse() {
        return new GetTotalSalaryResponse();
    }

    /**
     * Create an instance of {@link SalaryResponse }
     * 
     */
    public SalaryResponse createSalaryResponse() {
        return new SalaryResponse();
    }

    /**
     * Create an instance of {@link GetTotalSalary }
     * 
     */
    public GetTotalSalary createGetTotalSalary() {
        return new GetTotalSalary();
    }

    /**
     * Create an instance of {@link Salary }
     * 
     */
    public Salary createSalary() {
        return new Salary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salary.webservice.rohit.com/", name = "salaryResponse")
    public JAXBElement<SalaryResponse> createSalaryResponse(SalaryResponse value) {
        return new JAXBElement<SalaryResponse>(_SalaryResponse_QNAME, SalaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalSalaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salary.webservice.rohit.com/", name = "getTotalSalaryResponse")
    public JAXBElement<GetTotalSalaryResponse> createGetTotalSalaryResponse(GetTotalSalaryResponse value) {
        return new JAXBElement<GetTotalSalaryResponse>(_GetTotalSalaryResponse_QNAME, GetTotalSalaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salary.webservice.rohit.com/", name = "salary")
    public JAXBElement<Salary> createSalary(Salary value) {
        return new JAXBElement<Salary>(_Salary_QNAME, Salary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://salary.webservice.rohit.com/", name = "getTotalSalary")
    public JAXBElement<GetTotalSalary> createGetTotalSalary(GetTotalSalary value) {
        return new JAXBElement<GetTotalSalary>(_GetTotalSalary_QNAME, GetTotalSalary.class, null, value);
    }

}
