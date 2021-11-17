package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

public class categoryBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Productcatalog/createCategory.xml#createCategory";
    private RichRegion category;

    public categoryBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setCategory(RichRegion category) {
        this.category = category;
    }

    public RichRegion getCategory() {
        return category;
    }

//    public void categoryRefresh(PopupFetchEvent popupFetchEvent) {
//        getCategory().refresh(FacesContext.getCurrentInstance());
//    }

    public void cancelled(PopupCanceledEvent popupCanceledEvent) {
        getCategory().refresh(FacesContext.getCurrentInstance());
    }
}
