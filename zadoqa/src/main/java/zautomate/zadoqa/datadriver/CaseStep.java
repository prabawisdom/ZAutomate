package zautomate.zadoqa.datadriver;

/**
 * Data Driver
 * @author Babu S
 *
 */
public class CaseStep {

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public int getStepNo() {
		return stepNo;
	}

	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getLocateBy() {
		return locateBy;
	}

	public void setLocateBy(String locateBy) {
		this.locateBy = locateBy;
	}

	public String getOrLocator() {
		return orLocator;
	}

	public void setOrLocator(String orLocator) {
		this.orLocator = orLocator;
	}

	public String getInputData() {
		return inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	public String getReferenceStep() {
	    return referenceStep;
	}

	public void setReferenceStep(String referenceStep) {
	    this.referenceStep = referenceStep;
	}

	private String testCaseName;
	private int stepNo;
	private String action;
	private String locateBy;
	private String orLocator;
	private String inputData;
	private String description;
	private String expectedResult;
	private String referenceStep;

}
