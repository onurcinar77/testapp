package onur.testApp.samples.menuitemOrders;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.Version;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import onur.testApp.samples.MenuItemBaseView;

public class MenuItemOrdersView extends MenuItemBaseView{

	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "Orders";

    public MenuItemOrdersView() {
    	super();
    	
        VerticalLayout aboutContent = new VerticalLayout();
        aboutContent.setSpacing(true);
        aboutContent.setStyleName("menu-content");
        aboutContent.addComponent(new Label(FontAwesome.INFO_CIRCLE.getHtml()  + VIEW_NAME, ContentMode.HTML));
        aboutContent.addComponent(new Label(" This application is using Vaadin " + Version.getFullVersion()));

        getBaseContent().addComponent(aboutContent);
    }

    @Override
    public void enter(ViewChangeEvent event) {
    }

}
