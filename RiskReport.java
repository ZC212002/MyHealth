
public class RiskReport {
	private String riskStatus;
	private String currentLocationRisk;
	private boolean highRiskDependant;
	private String QRcode;
	
	
	public RiskReport() {
		riskStatus="";
		currentLocationRisk="";
		highRiskDependant = false;
		QRcode = "";
	}


	public RiskReport(String riskStatus, String currentLocationRisk, boolean highRiskDependant, String qRcode) {
		this.riskStatus = riskStatus;
		this.currentLocationRisk = currentLocationRisk;
		this.highRiskDependant = highRiskDependant;
		QRcode = qRcode;
	}


	public String getRiskStatus() {
		return riskStatus;
	}


	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
	}


	public String getCurrentLocationRisk() {
		return currentLocationRisk;
	}


	public void setCurrentLocationRisk(String currentLocationRisk) {
		this.currentLocationRisk = currentLocationRisk;
	}


	public boolean isHighRiskDependant() {
		return highRiskDependant;
	}


	public void setHighRiskDependant(boolean highRiskDependant) {
		this.highRiskDependant = highRiskDependant;
	}


	public String getQRcode() {
		return QRcode;
	}


	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}


	@Override
	public String toString() {
		return String.format("riskStatus=%s \ncurrentLocationRisk=%s \nhighRiskDependant=%s \n QRcode=%s\n",
				riskStatus, currentLocationRisk, highRiskDependant, QRcode);
	}
	
	
	
}
