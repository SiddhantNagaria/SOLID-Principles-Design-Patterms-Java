public class InterviewQuestionProcessor {

	public static void process(InterviewQuestion question) {
		// this is a typical implementation of the loosely coupled system
		// this class knows nothing about the question and its type (!!!)
		// THIS IS PURE ABSTRACTION
		question.execute();


		//bad version
		// violation of open-close principle because it is updating the processor class
		if(question instanceof AlgorithmsInterviewQuestions algorithmsInterviewQuestions){
            algorithmsInterviewQuestions.execute();
		} else if (question instanceof  CSInterviewQuestions csInterviewQuestions) {
			csInterviewQuestions.execute();
		}
	}
}
