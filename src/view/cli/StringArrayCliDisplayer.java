package view.cli;

import java.io.PrintWriter;

/**
 * <h1>StringArrayDisplayer</h1> The StringArrayDisplayer class implements our
 * Displayer interface
 * <p>
 *
 * @author Ariel Rosenfeld,Ofir Calif
 * 
 * 
 */ 
public class StringArrayCliDisplayer implements CliDisplayer {
	/**
	 * <h1>display</h1>
	 * This method is for displaying the object
	 * @param obj is the object that we need to display.
	 * @param out is from where we are going to display it.
	 */
	@Override
	public void display(Object obj, PrintWriter out) {
		String[] strings = (String[]) obj;
		for (String string : strings) {
			out.println(string);
		}
		out.flush();
	}

}
