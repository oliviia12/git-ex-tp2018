package application;

import java.awt.BorderLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class GuiList extends JPanel {
	private static final long serialVersionUID = 1L;

	private String label[] = { "Thomas", "Alex", "Rahel" };


	private JList<String> list;

	public GuiList() {
		setLayout(new BorderLayout());

		list = new JList<String>(label);
		JButton button = new JButton("Print");
		JScrollPane pane = new JScrollPane(list);

		DefaultListSelectionModel m = new DefaultListSelectionModel();
		m.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		m.setLeadAnchorNotificationEnabled(false);
		list.setSelectionModel(m);

		button.addActionListener(new PrintListener(this));

		add(pane, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);
	}

	JList<String> getList() {
		return list;
	}
}
