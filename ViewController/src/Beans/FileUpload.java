package Beans;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.myfaces.trinidad.model.UploadedFile;


public class FileUpload {
    public FileUpload() {
        super();
    }

    private UploadedFile file;
    private String filename;
    private long filesize;
    private String filecontents;
    private String filetype;
    
    public String getFilename() {
        return filename;
    }

    public long getFilesize() {
        return filesize;
    }

    public void setFilecontents(String filecontents) {
        this.filecontents = filecontents;
    }

    public String getFilecontents() {
        return filecontents;
    }

    public String getFiletype() {
        return filetype;
    }

 
    public void setFile(UploadedFile file) {
    this.file = file;
        this.filename = file.getFilename();
               this.filesize = file.getLength();
               this.filetype = file.getContentType();
               try {
                   //java.io.InputStream is=file.getInputStream();
                   this.filecontents = parseISToString(file.getInputStream());
                   //is.close();
               } catch (IOException e) {
                   // TODO
               }
    }
    public UploadedFile getFile() {
    return file;
    }
    
    public String parseISToString(java.io.InputStream is) {
            java.io.DataInputStream din = new java.io.DataInputStream(is);
            StringBuffer sb = new StringBuffer();
            try {
                String line = null;
                while ((line = din.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (Exception ex) {
                ex.getMessage();
            } finally {
                try {
                    is.close();
                } catch (Exception ex) {
                }
            }
            
            return sb.toString();
        }

    public String setFile() {
        // Add event code here...
        return null;
    }
}

