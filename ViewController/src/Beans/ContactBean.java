package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class ContactBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/ContactWrap.xml#ContactWrap";
    private RichRegion dynamicContact;

    public ContactBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicContact(RichRegion dynamicContact) {
        this.dynamicContact = dynamicContact;
    }

    public RichRegion getDynamicContact() {
        return dynamicContact;
    }

    public void startContact(DisclosureEvent disclosureEvent) {
        getDynamicContact().refresh(FacesContext.getCurrentInstance());
    }
}
