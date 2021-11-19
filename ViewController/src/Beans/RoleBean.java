package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class RoleBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/RoleWrap.xml#RoleWrap";
    private RichRegion dynamicRole;

    public RoleBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicRole(RichRegion dynamicRole) {
        this.dynamicRole = dynamicRole;
    }

    public RichRegion getDynamicRole() {
        return dynamicRole;
    }

    public void startRole(DisclosureEvent disclosureEvent) {
        getDynamicRole().refresh(FacesContext.getCurrentInstance());
    }
}
