package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class UserBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/UserWrap.xml#UserWrap";
    private RichRegion dynamicUser;

    public UserBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicUser(RichRegion dynamicUser) {
        this.dynamicUser = dynamicUser;
    }

    public RichRegion getDynamicUser() {
        return dynamicUser;
    }

    public void startUser(DisclosureEvent disclosureEvent) {
        getDynamicUser().refresh(FacesContext.getCurrentInstance());

    }
}
