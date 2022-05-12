import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<ExamSubmitter> submitters = new ArrayList<ExamSubmitter>();
		submitters.add(new Gurary());

		for (ExamSubmitter s : submitters) {
			s.submit();
		}

	}

}
