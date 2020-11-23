/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template Ã©tudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
	private int Id;
	private String playerAnswer;
	private Scanner reader;
	private int chosenPath;
	private GUIManager gui;
	private String data;
	static private int lastId = 1;

	public String toString() {
		return "Event #"+this.getId()+" "+this.getData();
	}
	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		return playerAnswer;
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		/* TO BE COMPLETED */
		this.playerAnswer = playerAnswer;
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		return reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		/* TO BE COMPLETED */
		this.reader = reader;
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		return chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		/* TO BE COMPLETED */
		this.chosenPath = chosenPath;
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		/* TO BE COMPLETED */
		return data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		/* TO BE COMPLETED */
		this.data = data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
		if (i <= NODE_MAX_ARITY || i < 0) {
			return daughters[i];
			/* TO BE COMPLETED */
		}

		/**
		 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
		 * @param daughter
		 * @param i
		 */
		public void setDaughter(Event daughter, int i) {
			/* TO BE COMPLETED */

		}

		/**
		 * @return the gui
		 */
		public GUIManager getGui() {
			/* TO BE COMPLETED */
			return gui;
		}

		/**
		 * @param gui the gui to set
		 */
		public void setGui(GUIManager gui) {
			/* TO BE COMPLETED */
			this.gui = gui;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return Id;
			/* TO BE COMPLETED */
		}

		public Event run() {
			gui.outputln(toString());
			gui.output(PROMPT_ANSWER);
			playerAnswer = reader.next();
			chosenPath = interpretAnswer();
			return getDaughter (chosenPath);
		}

	public Event(GUIManager gui, String data) {
			super(data);
			this.gui = gui;
			Id = ++ lastId ;
			reader=gui.getInputReader();
			/* Methods */
			/* TO BE COMPLETED */
		}

	public Event() {
			this(new GUIManager(), "");
		}
	}

// eof