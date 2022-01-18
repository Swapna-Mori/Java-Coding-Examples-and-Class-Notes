package java8featuresoncustomobjects;

public class Branch {
	
	private int branchId;
	private String branchName;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Branch(String branchName) {
		super();
		this.branchName = branchName;
	}



	public Branch(int branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}



	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	

}
