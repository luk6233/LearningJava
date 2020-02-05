package Test_Exercise.src.com.luk_d.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLparse {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("Test_Exercise/src/com/luk_d/XML/file.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element employersElement = (Element) document.getElementsByTagName("employers").item(0);
        String department = employersElement.getAttribute("department");

        NodeList employeeNodeList = document.getElementsByTagName("employee");

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < employeeNodeList.getLength(); i++) {
            if (employeeNodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element employeeElement = (Element) employeeNodeList.item(i);

                Employee employee = new Employee();
                employee.setDepartment(department);
                employee.setNumber(Integer.valueOf(employeeElement.getAttribute("number")));

                NodeList childNodes = employeeElement.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNodes.item(j);

                        switch (childElement.getNodeName()) {
                            case "name":
                                employee.setName(childElement.getTextContent());
                                break;
                            case "age":
                                employee.setAge(Integer.valueOf(childElement.getTextContent()));
                                break;
                            case "salary":
                                employee.getSalary().setValue(Double.valueOf(childElement.getTextContent()));
                                employee.getSalary().setCurrency(childElement.getAttribute("currency"));
                                break;
                        }
                    }
                }

                employeeList.add(employee);
            }
        }

        employeeList.forEach(System.out::println);
    }
}

class Employee {
    private String department;
    private Integer number;
    private String name;
    private Integer age;
    private Salary salary = new Salary();

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public static class Salary {
        private Double value;
        private String currency;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary.getValue() + " " + salary.getCurrency() +
                '}';
    }
}
