package willydekeyser.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route ("public")
@PageTitle("Spring Boot Tutorials")
@AnonymousAllowed
public class PublicView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public PublicView() {
	
		setDefaultHorizontalComponentAlignment(Alignment.CENTER);
		add(new H1("Spring Boot Tutorial"));
		add(new H2("Home Page!"));
	}

	
}
