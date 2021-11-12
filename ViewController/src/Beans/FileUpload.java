package Beans;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.myfaces.trinidad.model.UploadedFile;
import java.io.*;

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
        UploadedFile f=getFile();
        System.out.println(f.getFilename());
        uploadFile(f);
        return null;
    }
    
    
    private String uploadFile(UploadedFile file) {

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
                        System.out.println("test");

                    } catch (Exception e) {

                    }

                }

            }

            //Returns the path where file is stored

            return path;

        }
}

