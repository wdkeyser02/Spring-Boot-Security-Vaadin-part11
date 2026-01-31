package willydekeyser.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route ("admin")
@PageTitle("Spring Boot Tutorials")
@AnonymousAllowed
public class AdminView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public AdminView() {
	
		setDefaultHorizontalComponentAlignment(Alignment.CENTER);
		add(new H1("Spring Boot Tutorial"));
		add(new H2("Home Page!"));
	}

	
}
