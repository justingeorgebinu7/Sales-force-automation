package Beans;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class ProductBean implements Serializable {
    private String taskFlowId = "/WEB-INF/Wrappers/productWrap.xml#productWrap";
    private RichRegion dynamicProduct;

    public ProductBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setDynamicProduct(RichRegion dynamicProduct) {
        this.dynamicProduct = dynamicProduct;
    }

    public RichRegion getDynamicProduct() {
        return dynamicProduct;
    }

    public void startProduct(DisclosureEvent disclosureEvent) {
        getDynamicProduct().refresh(FacesContext.getCurrentInstance());
    }
}
