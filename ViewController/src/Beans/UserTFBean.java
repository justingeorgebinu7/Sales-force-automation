package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class UserTFBean implements Serializable {
    private String taskFlowId = "/WEB-INF/UserManagement/userManagementMain.xml#userManagementMain";
    private RichRegion dynamicUserMan;
    private String taskFlowId1 = "/WEB-INF/Productcatalog/productCatalog.xml#productCatalog";
    private RichRegion dynamicProductMan;
    private String taskFlowId2 =
        "/WEB-INF/customerAccountTaskFlows/CustomerAccountHomePageAddTF.xml#CustomerAccountHomePageAddTF";
    private RichRegion dynamicAccount;
    private String taskFlowId3 = "/WEB-INF/ContactManagement/conactManagementParent.xml#conactManagementParent";
    private RichRegion dynamicContact;
    private String taskFlowId4 = "/WEB-INF/Opportunity_TaskFLows/Opportunity_main.xml#Opportunity_main";
    private RichRegion dynamicOpp;
    private String taskFlowId5 = "/WEB-INF/RoleManagement/RoleManagement.xml#RoleManagement";
    private RichRegion dynamicRole;

    public UserTFBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicUserMan(RichRegion dynamicUserMan) {
        this.dynamicUserMan = dynamicUserMan;
    }

    public RichRegion getDynamicUserMan() {
        return dynamicUserMan;
    }

   

    public TaskFlowId getDynamicTaskFlowId1() {
        return TaskFlowId.parse(taskFlowId1);
    }

    public void setDynamicTaskFlowId1(String taskFlowId) {
        this.taskFlowId1 = taskFlowId;
    }

    public void setDynamicProductMan(RichRegion dynamicProductMan) {
        this.dynamicProductMan = dynamicProductMan;
    }

    public RichRegion getDynamicProductMan() {
        return dynamicProductMan;
    }
    public void startUserManTF(DisclosureEvent disclosureEvent) {
        getDynamicUserMan().refresh(FacesContext.getCurrentInstance());
    }   
    public void startProdManTF(DisclosureEvent disclosureEvent) {
        getDynamicProductMan().refresh(FacesContext.getCurrentInstance());
    }

    public TaskFlowId getDynamicTaskFlowId2() {
        return TaskFlowId.parse(taskFlowId2);
    }

    public void setDynamicTaskFlowId2(String taskFlowId) {
        this.taskFlowId2 = taskFlowId;
    }

    public void setDynamicAccount(RichRegion dynamicAccount) {
        this.dynamicAccount = dynamicAccount;
    }

    public RichRegion getDynamicAccount() {
        return dynamicAccount;
    }

    public void startAccountTF(DisclosureEvent disclosureEvent) {
        getDynamicAccount().refresh(FacesContext.getCurrentInstance());
    }

    public TaskFlowId getDynamicTaskFlowId3() {
        return TaskFlowId.parse(taskFlowId3);
    }

    public void setDynamicTaskFlowId3(String taskFlowId) {
        this.taskFlowId3 = taskFlowId;
    }

    public void setDynamicContact(RichRegion dynamicContact) {
        this.dynamicContact = dynamicContact;
    }

    public RichRegion getDynamicContact() {
        return dynamicContact;
    }

    public void startContactTF(DisclosureEvent disclosureEvent) {
        getDynamicContact().refresh(FacesContext.getCurrentInstance());
    }

    public TaskFlowId getDynamicTaskFlowId4() {
        return TaskFlowId.parse(taskFlowId4);
    }

    public void setDynamicTaskFlowId4(String taskFlowId) {
        this.taskFlowId4 = taskFlowId;
    }

    public void setDynamicOpp(RichRegion dynamicOpp) {
        this.dynamicOpp = dynamicOpp;
    }

    public RichRegion getDynamicOpp() {
        return dynamicOpp;
    }

    public void startOppTF(DisclosureEvent disclosureEvent) {
        getDynamicOpp().refresh(FacesContext.getCurrentInstance());
    }

    public TaskFlowId getDynamicTaskFlowId5() {
        return TaskFlowId.parse(taskFlowId5);
    }

    public void setDynamicTaskFlowId5(String taskFlowId) {
        this.taskFlowId5 = taskFlowId;
    }

    public void setDynamicRole(RichRegion dynamicRole) {
        this.dynamicRole = dynamicRole;
    }

    public RichRegion getDynamicRole() {
        return dynamicRole;
    }

    public void startRoleTF(DisclosureEvent disclosureEvent) {
        getDynamicRole().refresh(FacesContext.getCurrentInstance());
    }
}
