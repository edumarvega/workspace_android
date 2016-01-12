package struts2file.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.opensymphony.xwork2.ActionSupport;

public class FileOsdeUpload extends ActionSupport {

	private static final long serialVersionUID = -8825873249034062992L;
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;

	public String execute() {
		File file = this.fileUpload;
		System.out.println(this.fileUploadContentType);
		System.out.println(this.fileUploadFileName);

		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

}
