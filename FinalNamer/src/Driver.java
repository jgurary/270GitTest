import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<ExamSubmitter> submitters = new ArrayList<ExamSubmitter>();
		submitters.add(new Gurary());
<<<<<<< Updated upstream
		submitters.add(new Boutros());
=======
		submitters.add(new Rached());
>>>>>>> Stashed changes

		for (ExamSubmitter s : submitters) {
			s.submit();
		}

		for (ExamSubmitter s : submitters) {
			if (s.checkSubmitted()) {
				System.out.println(s.name + " got this question right.");
			}
		}

	}

}
