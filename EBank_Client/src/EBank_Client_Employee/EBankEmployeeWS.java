
package EBank_Client_Employee;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EBankEmployee_WS", targetNamespace = "http://ebankEmployee_ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EBankEmployeeWS {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.LogoutResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/logoutRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/logoutResponse")
    public void logout();

    /**
     * 
     * @param field
     * @param value
     * @param table
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkAvailability", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.CheckAvailability")
    @ResponseWrapper(localName = "checkAvailabilityResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.CheckAvailabilityResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/checkAvailabilityRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/checkAvailabilityResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/checkAvailability/Fault/Exception")
    })
    public boolean checkAvailability(
        @WebParam(name = "field", targetNamespace = "")
        String field,
        @WebParam(name = "value", targetNamespace = "")
        String value,
        @WebParam(name = "table", targetNamespace = "")
        String table)
        throws Exception_Exception
    ;

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.LoginResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/loginRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/loginResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/login/Fault/Exception")
    })
    public String login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "displayEmployees", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.DisplayEmployees")
    @ResponseWrapper(localName = "displayEmployeesResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.DisplayEmployeesResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/displayEmployeesRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/displayEmployeesResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/displayEmployees/Fault/Exception")
    })
    public ArrayList<String> displayEmployees()
        throws Exception_Exception
    ;

    /**
     * 
     * @param password
     * @param name
     * @param position
     * @param username
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editEmployee", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.EditEmployee")
    @ResponseWrapper(localName = "editEmployeeResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.EditEmployeeResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/editEmployeeRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/editEmployeeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/editEmployee/Fault/Exception")
    })
    public int editEmployee(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "position", targetNamespace = "")
        String position,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectEmployee", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.SelectEmployee")
    @ResponseWrapper(localName = "selectEmployeeResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.SelectEmployeeResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/selectEmployeeRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/selectEmployeeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/selectEmployee/Fault/Exception")
    })
    public ArrayList<String> selectEmployee(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws Exception_Exception
    ;

    /**
     * 
     * @param username
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployee", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.DeleteEmployee")
    @ResponseWrapper(localName = "deleteEmployeeResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.DeleteEmployeeResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/deleteEmployeeRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/deleteEmployeeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/deleteEmployee/Fault/Exception")
    })
    public int deleteEmployee(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws Exception_Exception
    ;

    /**
     * 
     * @param password
     * @param name
     * @param position
     * @param username
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createEmployee", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.CreateEmployee")
    @ResponseWrapper(localName = "createEmployeeResponse", targetNamespace = "http://ebankEmployee_ws/", className = "EBank_Client_Employee.CreateEmployeeResponse")
    @Action(input = "http://ebankEmployee_ws/EBankEmployee_WS/createEmployeeRequest", output = "http://ebankEmployee_ws/EBankEmployee_WS/createEmployeeResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ebankEmployee_ws/EBankEmployee_WS/createEmployee/Fault/Exception")
    })
    public int createEmployee(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "position", targetNamespace = "")
        String position,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws Exception_Exception
    ;

}
