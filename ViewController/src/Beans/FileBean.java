package Beans;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import java.util.List;

import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.util.ResetUtils;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.adf.model.BindingContext;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class FileBean {
    private UploadedFile myFile;

    public FileBean() {
    }


    public void setMyFile(UploadedFile myFile) {
        this.myFile = myFile;
    }

    public UploadedFile getMyFile() {
        return myFile;
    }
    
    private String uploadFile(UploadedFile file) {
            System.out.println("inside upload");
            UploadedFile myfile = file;

            String path = null;

            if (myfile == null) {

            } else {

                // All uploaded files will be stored in below path

                path = "C:\\FileSys\\" + myfile.getFilename();

                InputStream inputStream = null;

                try {

                    FileOutputStream out = new FileOutputStream(path);

                    inputStream = myfile.getInputStream();

                    byte[] buffer = new byte[8192];

                    int bytesRead = 0;

                    while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {

                        out.write(buffer, 0, bytesRead);

                    }

                    out.flush();

                    out.close();

                } catch (Exception ex) {

                    // handle exception

                    ex.printStackTrace();

                } finally {

                    try {

                       // inputStream.close();
                        System.out.println("Inside try");

                    } catch (Exception e) {

                    }

                }

            }

            //Returns the path where file is stored

            return path;

        }



        /*****Generic Method to Get BindingContainer**/

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


    //        public void uploadFileVCE(ValueChangeEvent vce) {
//
//            if (vce.getNewValue() != null) {
//
//                //Get File Object from VC Event
//                System.out.println("Vce start");
//                List<org.apache.myfaces.trinidad.model.UploadedFile> l=(List<org.apache.myfaces.trinidad.model.UploadedFile>)vce.getNewValue();
//               // UploadedFile fileVal = (UploadedFile) vce.getNewValue();
//               UploadedFile fileVal=l.get(0);
//                //Upload File to path- Return actual server path
//
//                System.out.println(fileVal.getFilename());
//                String path = uploadFile(fileVal);
//
//               
//
//                //Method to insert data in table to keep track of uploaded files
//
////                OperationBinding ob = executeOperation("setFileData");
////
////                ob.getParamsMap().put("name", fileVal.getFilename());
////
////                ob.getParamsMap().put("path", path);
////
////                ob.getParamsMap().put("contTyp", fileVal.getContentType());
////
////                ob.execute();
//
//                // Reset inputFile component after upload
//
//                ResetUtils.reset(vce.getComponent());
//
///           }
//
//        }


    /**Method to Upload File ,called on ValueChangeEvent of inputFile

     * @param vce

     */
    public String buttonAction() {
        // Add event code here...
        UploadedFile fileVal= getMyFile();
        String path=uploadFile(fileVal);
        
        /*
        OperationBinding ob = executeOperation("setFileData");

                    ob.getParamsMap().put("name", fileVal.getFilename());

                    ob.getParamsMap().put("path", path);

                    ob.getParamsMap().put("contTyp", fileVal.getContentType());

                    ob.execute();
         * */
        
        
        return null;
    }
}
