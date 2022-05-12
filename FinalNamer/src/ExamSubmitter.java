
public abstract class ExamSubmitter {

	public String name;
	private boolean hasSubmitted;

	/**
	 * A person trying to submit the final exam
	 * 
	 * @param name
	 */
	public ExamSubmitter(String name) {
		this.name = name;
		hasSubmitted = false;
	}

	/**
	 * Submits final exam question, giving the person with the given name a good
	 * grade on this question.
	 */
	public void submit() {
		hasSubmitted = true;
	}

	/**
	 * Returns true if the exam has already been submitted, otherwise false
	 * 
	 * @return
	 */
	public boolean checkSubmitted() {
		return hasSubmitted;
	}

}
