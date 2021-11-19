package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class AccountBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/AccountWrap.xml#AccountWrap";
    private RichRegion dynamicAccount;

    public AccountBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicAccount(RichRegion dynamicAccount) {
        this.dynamicAccount = dynamicAccount;
    }

    public RichRegion getDynamicAccount() {
        return dynamicAccount;
    }

    public void startAccount(DisclosureEvent disclosureEvent) {
        getDynamicAccount().refresh(FacesContext.getCurrentInstance());
    }
}
