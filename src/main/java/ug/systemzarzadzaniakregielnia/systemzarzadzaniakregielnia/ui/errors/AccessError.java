package ug.systemzarzadzaniakregielnia.systemzarzadzaniakregielnia.ui.errors;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import ug.systemzarzadzaniakregielnia.systemzarzadzaniakregielnia.ui.MainUI;

@SpringView(ui = MainUI.class,name = AccessError.NAME)
public class AccessError extends HorizontalLayout implements View {
    public static final String NAME = "error";

    private MainUI ad;
    @Autowired
    public AccessError(MainUI ad,MessageSource messageSource) {
        this.ad = ad;
        ad.header.setHeadline(messageSource.getMessage("common.error",null, UI.getCurrent().getLocale()));
        ad.header.setBackButton(true, false);

        Label label = new Label(messageSource.getMessage("common.access",null, UI.getCurrent().getLocale()));
        label.setStyleName("h1");
        this.addComponent(label);


    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
