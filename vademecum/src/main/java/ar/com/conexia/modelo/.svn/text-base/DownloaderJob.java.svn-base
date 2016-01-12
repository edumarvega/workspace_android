package ar.com.conexia.modelo;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class DownloaderJob extends QuartzJobBean{
	
	private DonwloderTask donwnloaderTask;
	
	public void setDonwloderTask(DonwloderTask donwnloaderTask) {
		this.donwnloaderTask = donwnloaderTask;
	}

	
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
			donwnloaderTask.mostrarMensaje();
		
	}
	
	
	
	
	

}
