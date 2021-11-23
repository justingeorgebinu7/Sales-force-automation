package Beans;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class NoteUpdate {
    public NoteUpdate() {
    }

//    ADFContext adfCtx = ADFContext.getCurrent();
//    SecurityContext secCntx = adfCtx.getSecurityContext();
//    String value = secCntx.getUserName();
    
        public BindingContainer getBindingsCont() {

        return BindingContext.getCurrent().getCurrentBindingsEntry();

    }


    /**

     * Generic Method to execute operation

     * */

    public OperationBinding executeOperation(String operation) {

        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);

        return createParam;


    }

    public String noteUpdate() {
        OperationBinding ob = executeOperation("update");
       // ob.getParamsMap().put("a", aid);
        ob.execute();
        NavigationHandler nvHndlr = FacesContext.getCurrentInstance()
                                                .

                                                getApplication()
                                                .

                                                getNavigationHandler();

        nvHndlr.handleNavigation(FacesContext.getCurrentInstance(), null, "backFromEdit");
        return null;
    }
}
