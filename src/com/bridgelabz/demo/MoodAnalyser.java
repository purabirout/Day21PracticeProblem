package com.bridgelabz.demo;
class MoodAnalysisException extends NullPointerException {

	public MoodAnalysisException() {
		super();

	}

	public MoodAnalysisException(String s) {
		super(s);

	}

}

public class MoodAnalyser {
		private String message = "null";

		public MoodAnalyser() {

		}

		public MoodAnalyser(String message) {
			this.message = message;
		}

		public String returnEmotion() throws MoodAnalysisException {
			try {
				if (message.contains("sad")) {
					return "SAD";
				}

				else if (message.contains("any") || message.contains("happy")) {
					return "HAPPY";
				}

				else if (message.equals("null")) {
					throw new MoodAnalysisException();
				}

				else if (message != null) {
					return "HAPPY";
				}

			} catch (MoodAnalysisException e) {
				System.out.println("Exception is handled");
				return "HAPPY";
			}
			return message;

		}

}
