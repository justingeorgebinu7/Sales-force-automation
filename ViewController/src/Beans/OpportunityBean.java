package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class OpportunityBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/OpportunityWrap.xml#OpportunityWrap";
    private RichRegion dynamicOpportunity;

    public OpportunityBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicOpportunity(RichRegion dynamicOpportunity) {
        this.dynamicOpportunity = dynamicOpportunity;
    }

    public RichRegion getDynamicOpportunity() {
        return dynamicOpportunity;
    }

    public void startOpportunityTf(DisclosureEvent disclosureEvent) {
        getDynamicOpportunity().refresh(FacesContext.getCurrentInstance());
    }
}
